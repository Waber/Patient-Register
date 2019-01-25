import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginFrame extends JFrame {
    private JPanel LoginPanel;
    private JTextField userName;
    private JPasswordField userPassword;
    private JCheckBox showPassword;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JButton buttonOK;
    private JLabel wrongData;

    private String user, passWD;

    DBstuff dBstuff = new DBstuff();


    public LoginFrame() {
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                if(dBstuff.logIN(userName.getText(), userPassword.getText())){
                    System.out.println("Prawidłowe dane :)");
                    new CalendarForm();
                    dispose();
                }
                else{
                    wrongData.setText("Błędny login i/lub hasło");
                    wrongData.setForeground(Color.red);
                }
            }
            catch (SQLException er){
                    er.printStackTrace();
            }
            }
        });
        showPassword.addActionListener(new ActionListener() {// After checking the checkbox, user can see the password they typed
            @Override
            public void actionPerformed(ActionEvent e) {
                userPassword.setEchoChar((char) 0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Logowanie");
        frame.setContentPane(new LoginFrame().LoginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // this value enables the window to launch on the center of the screen
    }


}
