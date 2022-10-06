package DataBase.Demo;


import java.sql.*;
import java.util.Scanner;

public class V1_SetUp {
    private String userName = "root";
    private String password = "";
    private String db_name = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    ResultSet rs = null;

    public V1_SetUp() {
        //jdbc:mysql://localhost:3306/demo"
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection is successful");
        } catch (SQLException e) {
            //e.printStackTrace();
            System.out.println("Connection is failed");
        }
    }

    public void getEmployees() {
        String query = "Select * From employees where 1";

        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");

                System.out.println("id: " + id + ". Name: " + name + " " + lastname
                        + "\nemail: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee()  {
        String name = "'Semih'";
        String lastName = "'Akbas'";
        String email = "'semihAkbas@gmail.com'";

        try {
            statement = connection.createStatement();

            // INSERT INTO employees (name,lastname,email) VALUES(name,lastname,email)
            String query = "Insert Into employees (name,lastname,email) VALUES(" + name + "," + lastName + "," + email + ")";
            //String query = "Insert Into employees (name,lastname,email) VALUES(" + "'" + name + "','" + lastName + "','" + email + "')";

            statement.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("Data cannot be added");
        }
    }

    public void updateEmployee() {
        String query = "Update employees Set email = 'volkaff51@gmail.com' where id = 1";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("Update is failed");
        }
    }

    public void getEmployeesOrderBy() {
        try {
            statement = connection.createStatement();

            String setOrder = "SELECT * FROM employees ORDER BY name";

            statement = connection.createStatement();
            rs = statement.executeQuery(setOrder);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");

                System.out.println("id: " + id + ". Name: " + name + " " + lastname
                        + "\nemail: " + email);
            }
        } catch (SQLException e) {
            System.out.println("Data isn't in order");
        }
    }

    public void deleteEmployee() {
        try {
            statement = connection.createStatement();
            String query = "Delete from employees where name = 'Semih'";

            statement.executeUpdate(query);


        } catch (SQLException e) {
            System.out.println("Delete is failed");
        }
    }

    public void preparedGetEmployees_1(){
        try {
            statement = connection.createStatement();

            String query = "Select * From employees where name like 'm%'";

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                System.out.println("Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("PreparedGetEmployees");
        }
    }

    public void preparedGetEmployees(int id){
        String query = "Select * From employees where id > ? and name like ?";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2,"m%");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String email =  rs.getString("email");
                System.out.println("Name: " + name + " " + lastname + "\nEmail: " + email);
            }

        } catch (SQLException e) {
            System.out.println("PreparedGetEmployees Error");
        }
    }

    public void commitAndRollback() {
        getEmployees();
        String query1 = "DELETE FROM employees where id = 11";
        String query2 = "UPDATE employees SET email = 'durakahmet@gmail.com' where id = 1";
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            statement.executeUpdate(query1);
            statement.executeUpdate(query2);

            System.out.println("Do you want to save your changes?");
            if (new Scanner(System.in).nextLine().equalsIgnoreCase("yes")){
                connection.commit();
                getEmployees();
                System.out.println("Database is updated");
            }else{
                connection.rollback();
                getEmployees();
                System.out.println("Database update is canceled");
            }


        } catch (SQLException e) {
            System.out.println("Commit and Rollback failure");
        }
    }

    public void setIdEmp() {
        String query = "UPDATE employees SET id = 6 WHERE id = 11";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Change is made successful");

        } catch (SQLException e) {
            System.out.println("Failure in setIdEmp");
        }
    }

    public static void main(String[] args) {
        V1_SetUp connectionSetUp = new V1_SetUp();

    }
}
