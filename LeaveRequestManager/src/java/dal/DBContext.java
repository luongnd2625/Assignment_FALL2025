package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Connect to db
public class DBContext {
    
// SQL Server Connection
    public Connection GetConnection() throws Exception {
        
        //Connection Settings
        String serverName = "Ber"; //Server Name
        String dbName = "LeaveRequestManager"; //DB
        String portNumber = "1433"; //Portt
        String instance = ""; //Idk but also add if needed
        String userID = "luongnd"; //username ssms
        String password = "12345"; //Pass ssms

        // Chuỗi kết nối
        String connectionURL = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";"
                + "databaseName=" + dbName + ";encrypt=false;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionURL, userID, password);
        } catch (SQLException e) {
            System.err.println("Connect Error SQL Server: " + e.getMessage());
            throw e;
        }
    }

//    // Test connection
//    public static void main(String[] args) {
//        Connection conn = null;
//        try {
//            DBContext db = new DBContext();
//            conn = db.GetConnection();
//            if (conn != null) {
//                System.out.println("Connected Successfully!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) conn.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
}

