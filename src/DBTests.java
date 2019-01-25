
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DBTests {

 DBstuff dbt;
 @BeforeEach
 public void setUp(){
     dbt = new DBstuff();
 }

 @Test
    public void shouldCheckForUserWhichIsInDatabase() throws SQLException {
     Assertions.assertTrue(dbt.logIN("Przykład","123"));
 }

}
