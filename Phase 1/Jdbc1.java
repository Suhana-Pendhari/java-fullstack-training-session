import java.sql.*;

public class Jdbc1 {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/suhanadb",
                "root",
                "@Suhana786"
            );

            System.out.println("MySQL connected");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");

            while(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println();
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
