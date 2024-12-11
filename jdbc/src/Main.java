import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Connection conn = null;
        Statement stmt = null;
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            String url = "jdbc:mysql://localhost:3306/sys";
            String username = "root";
            String password = "@pplic@tion";
            conn = DriverManager.getConnection(url, username, password);

            // Do something with the connection
            // Create a SQL statement
            stmt = conn.createStatement();
            // Define the SQL query to create a table
            String sql = "CREATE TABLE IF NOT EXISTS class (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "username VARCHAR(50) NOT NULL," +
                    "email VARCHAR(100) NOT NULL UNIQUE," +
                    "password VARCHAR(100) NOT NULL" +
                    ")";

// Execute the SQL statement to create the table
            stmt.executeUpdate(sql);

            System.out.println("Table created successfully.");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}