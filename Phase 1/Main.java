import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // Database credentials - Update 'your_password' to your actual MySQL password
    static final String DB_URL = "jdbc:mysql://localhost:3306/suhanadb";
    static final String USER = "root";
    static final String PASS = "@Suhana786"; 

    public static void main(String[] args) {
        List<Employee2> employeeList = new ArrayList<>();

        // 1. Database Connection and Data Retrieval
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT employee_id, first_name, salary FROM employees")) {

            while (rs.next()) {
                // Mapping DB rows to Java Objects
                Employee2 emp = new Employee2(
                    rs.getInt("employee_id"),
                    rs.getString("first_name"),
                    rs.getInt("salary")
                );
                employeeList.add(emp);
            }

        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        }

        // 2. Stream Operations (Similar to your Moviestream2 example)
        System.out.println("--- All Employees from DB ---");
        employeeList.forEach(System.out::println);

        // Filter: High Salary Employees (> 70000)
        System.out.println("\n--- High Salary Employees (> 70000) ---");
        List<Employee2> highEarners = employeeList.stream()
                .filter(e -> e.getSalary() > 70000)
                .collect(Collectors.toList());

        highEarners.forEach(System.out::println);
    }
}