package JDBC.BASICS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JD {

    private static final String url = "jdbc:mysql://localhost:3306/SMS2";
    private static final String user = "root";
    private static final String password = "Deepu@1213";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish Connection
        Connection con = DriverManager.getConnection(url, user, password);

        // ================= SELECT OPERATION =================
        String selectQuery = "SELECT * FROM students";

        PreparedStatement ps = con.prepareStatement(selectQuery);

        ResultSet rs = ps.executeQuery();

        System.out.println("Student Records:");

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            int marks = rs.getInt("marks");

            System.out.println("ID    : " + id);
            System.out.println("Name  : " + name);
            System.out.println("Email : " + email);
            System.out.println("Marks : " + marks);
           // System.out.println("---------------------");
        }

        // ================= INSERT OPERATION =================
        String insertQuery =
                "INSERT INTO students(id, name, email, marks) VALUES (?, ?, ?, ?)";

        PreparedStatement insertPs = con.prepareStatement(insertQuery);

        insertPs.setInt(1, 2);
        insertPs.setString(2, "deep");
        insertPs.setString(3, "dee");
        insertPs.setInt(4, 68);

        int myRes = insertPs.executeUpdate();

        if (myRes > 0) {
            System.out.println("Record Inserted Successfully");
        } else {
            System.out.println("Insertion Failed");
        }

        // Close Resources
        rs.close();
        ps.close();
        insertPs.close();
        con.close();

    }
}