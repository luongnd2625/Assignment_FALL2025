package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Connect to db
public class DBContext {
    
// SQL Server Connection
    public Connection GetConnection() throws Exception {
        
        //Connection Settings
        String serverName = "Ber"; //Instance Name
        String dbName = "LeaveRequestManager"; //DB
        String portNumber = "1433"; //Portt
        String instance = ""; // Nếu SQL Server có instance riêng thì ghi ở đây, VD: "Ber\\SQLEXPRESS"
        String userID = "luongnd"; 
        String password = "12345";

        // Chuỗi kết nối
        String connectionURL = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";"
                + "databaseName=" + dbName + ";encrypt=false;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionURL, userID, password);
        } catch (SQLException e) {
            System.err.println("Lỗi kết nối SQL Server: " + e.getMessage());
            throw e;
        }
    }

    // Hàm main chỉ để test kết nối riêng
    public static void main(String[] args) {
        Connection conn = null;
        try {
            DBContext db = new DBContext();
            conn = db.GetConnection();
            if (conn != null) {
                System.out.println("Kết nối thành công!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

