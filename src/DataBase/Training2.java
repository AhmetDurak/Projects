package DataBase;

import java.sql.*;

public class Training2 {
    private String username = "root";
    private String password = "";


    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public Training2() {
        try {
            String url = "jdbc:mysql://localhost:3306/demo";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection is successful");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void getEmployeeList(){
        try {
            String query = "Select * FROM employees where 1";

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");

                System.out.println(id + ". " + name + " " + lastname + "\nE-mail: " + email);
            }

        }catch (SQLException ignored){}
    }

    public void addEmployee() throws SQLException {
        String name = "'Semih',";
        String lastname = "'Tegrak',";
        String email = "'semihtegrak@gmail.com'";

        String add = "INSERT INTO employees (name,lastname, email) VALUES ("+name + lastname + email+")";

        statement = connection.createStatement();
        statement.executeUpdate(add);
        System.out.println("Employee is added");

    }

    public void setIdEmployee() throws SQLException {
        String query = "UPDATE employees SET id = 6 WHERE id = 15";

        statement = connection.createStatement();
        statement.executeUpdate(query);
        System.out.println("Change is made");
    }

    public void deleteEmployee() throws SQLException {
        String update = "DELETE FROM employees where name = 'Semih'";

        statement = connection.createStatement();
        statement.executeUpdate(update);
        System.out.println("Delete is done");
    }

    public void updateEmployee() throws SQLException {
        String update = "UPDATE employees SET email = 'durakahmet51@gmail.com' WHERE name = 'Ahmet'";

        statement = connection.createStatement();
        statement.executeUpdate(update);
        System.out.println("Update is done");
    }

    public void preparedGetEmp() throws SQLException {
        String query = "SELECT * FROM employees where name like ?";

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "m%");
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()){
            String name = rs.getString("name");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");
            System.out.println(name + " " + lastname + " " + email);
        }
        System.out.println("Prepared Statement is successful");
    }


    public static void main(String[] args) throws SQLException{
        Training2 database = new Training2();
        database.preparedGetEmp();
    }
}
