import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Path to your database file
        String dbURL = "jdbc:ucanaccess://C:\\Users\\USER\\Documents\\EVENT DRIVEN SOURCE CODES\\LoginApp\\LoginDB.accdb";

        System.out.println("=== Java Login System Using MS Access ===");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        try {
            // Load UCanAccess driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            // Connect to Access database
            Connection conn = DriverManager.getConnection(dbURL);

            // Query to check login
            String sql = "SELECT * FROM Users WHERE Username = ? AND Password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful! Welcome, " + username + ".");
            } else {
                System.out.println("Invalid username or password.");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}