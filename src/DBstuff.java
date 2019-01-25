import java.sql.*;

public class DBstuff {

    private Connection connection = null;
   private String query;
   private Statement statement;
   private ResultSet resultSet;
   private String returnString = "";

    public DBstuff(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e){
            System.out.println("Driver not found");
            e.printStackTrace();
            return;
        }
        try{
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Rejestracja", "Orto123");
        } catch (SQLException e){
            System.out.println("Problem z połączeniem");
            e.printStackTrace();
            return;
        }
    }

    //Method that returns true if typer user with a proper password exists in database
    public boolean logIN(String login, String password) throws SQLException {
        query = "SELECT nazwa_uzytkownika, haslo FROM uzytkownicy";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            returnString = resultSet.getString("nazwa_uzytkownika");
          if(resultSet.getString("nazwa_uzytkownika").equals(login) && resultSet.getString("haslo").equals(password)){
              return true;
          }
        }
        return false;
    }
}
