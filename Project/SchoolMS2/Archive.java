package SchoolMS2;

import java.sql.*;


public class Archive {
    studentLog studentLog = new studentLog();


}

class studentLog  {
    private String userName = "root";
    private String password = "";
    private String db_name = "mydatabase";
    private String host = "localhost";
    private int port = 3306;

    private Connection connection = null;
    private Statement statement = null;

    studentLog() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver couldn't found");
        }

        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection is successful");
        } catch (SQLException e) {
            System.out.println("Connection failed");
        }
    }

    void addStudent(String name, char gender, int age) {
        //INSERT INTO studentlog (userName,gender,age) VALUES("Kemal Calis",'m',15)
        String query = "INSERT INTO studentlog (userName,gender,age) VALUES (" +
                "'" + name + "','" + gender + "'," + age + ")";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Student is added");
        } catch (SQLException e) {
            System.out.println("Statement error");
        }
    }

    void deleteStudent(String name) {
        String query = "DELETE FROM studentlog where userName = '" + name + "'";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Student is deleted");
        } catch (SQLException e) {
            System.out.println("Student couldn't delete");
        }
    }

    void getInfoStudent() {
        String query = "SELECT * from studentlog where 1";

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                String userName = rs.getString("userName");
                String gender = rs.getString("gender");
                String birthdate = rs.getString("birthdate");

                int math = rs.getInt("mathematics");

                System.out.println(userName + " " + gender + " " + birthdate + "\nMathematics: " + math);
            }

        } catch (SQLException e) {
            System.out.println("Info couldn't be shown");
        }
    }

    void getInfoStudent(String name) {
        String query = "SELECT * from studentlog where userName = '" + name + "'";

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                String userName = rs.getString("userName");
                String gender = rs.getString("gender");
                String birthdate = rs.getString("birthdate");

                int math = rs.getInt("mathematics");

                System.out.println(userName + " " + gender + " " + birthdate + "\nMathematics: " + math);
            }

        } catch (SQLException e) {
            System.out.println("Info couldn't be shown");
        }
    }

    void addGrade(String name, int mathematics, int biology) {

    }
}
