import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class StoreDepartmentInDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/departments"; 
        String username = "your_username"; 
        String password = "your_password"; 

        Department dept1 = new Department(1, "HR");
        Department dept2 = new Department(2, "Finance");
        Department dept3 = new Department(3, "IT");

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

            insertDepartment(statement, dept1);
            insertDepartment(statement, dept2);
            insertDepartment(statement, dept3);

            System.out.println("Department data inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void insertDepartment(Statement statement, Department dept) throws SQLException {
        String query = "INSERT INTO department VALUES (" + dept.getId() + ", '" + dept.getName() + "')";
        statement.executeUpdate(query);
    }
}
