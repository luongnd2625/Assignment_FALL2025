package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Connect to db
public class DBContext {

    private final String serverName = "localhost\\Ber"; // Instance name
    private final String dbName = "LeaveRequestManager";
    private final String user = "luongnd";
    private final String pass = "12345";

    public Connection getConnection() throws SQLException {
        String connectionUrl = "jdbc:sqlserver://" + serverName
                + ";databaseName=" + dbName
                + ";encrypt=false;user=" + user
                + ";password=" + pass + ";";
        return DriverManager.getConnection(connectionUrl);
    }
}
