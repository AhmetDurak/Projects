package DataBase;

import java.sql.*;

public class Training {
    private String userName = "root";
    private String password = "";
    private String db_name = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Training() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name;

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection is successful");
    }

    public void getEmployee() throws SQLException {
        String query = "Select * From employees where 1";

        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");

            System.out.println(id + ". " + name + " " + lastname + "\nEmail: " + email);
        }

    }

    public void addEmployee() throws SQLException {
        String name = "'Semih',";
        String lastname = "'Tegrak',";
        String email = "'tegrakSemih@gmail.com'";

        String query = "Insert Into employees (name,lastname,email) VALUES(" + name + lastname + email + ")";

        statement = connection.createStatement();
        statement.executeUpdate(query);

        System.out.println("Add is successful");
    }

    public void deleteEmployee() throws SQLException {
        String query = "Delete from employees where name = 'Semih'";

        statement = connection.createStatement();
        statement.executeUpdate(query);

        System.out.println("Delete is successful");
    }

    public void getEmpInOrder() throws SQLException {
        String query = "Select * From employees Order By lastname";
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");

            System.out.println(id + ". " + name + " " + lastname + "\nEmail: " + email);
        }

    }

    public void updateEmployee() throws SQLException {
        String query = "Update employees  Set email = 'ahmetdurak@gmail.com' where name = 'Ahmet'";

        statement = connection.createStatement();
        statement.executeUpdate(query);

        System.out.println("Update is complete!");
    }

    public void preparedGetEmp() throws SQLException {
        String query = "Select * From employees where name like 'b%'";

        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()){
            System.out.println("Name: " + rs.getString("name") + " " + rs.getString("lastname"));
        }
    }

    public void preparedGetEmp2() throws SQLException {
        String query = "SELECT * FROM employees where name like ?";

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "m%");
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()){
            String name = rs.getString("name");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");

            System.out.println(name + " " + lastname + "\nEmail: " + email);
        }
        System.out.println("Prepared Statement is successful");
    }

    public void setIdEmployee() throws  SQLException {
        String query = "UPDATE employees SET id = 6 WHERE id = 12";

        statement = connection.createStatement();
        statement.executeUpdate(query);

        System.out.println("Update is successful");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Training training = new Training();
        training.setIdEmployee();
    }
}
