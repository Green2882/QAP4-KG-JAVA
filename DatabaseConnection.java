
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Never wanted to include actual password,useranme in public repo, can message you them privately but
    // dont think you'll need them
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "Username";
    private static final String PASSWORD = "password";

    public static Connection getCon() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return connection;
    }
}
