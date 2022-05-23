package DataBase;

import java.sql.*;

public class V2_Getting_Data {
    private String userName = "root";
    private String password = "";
    private String db_name = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection connection= null;
    private Statement statement= null;

    public V2_Getting_Data() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name;

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,userName,password);
    }

    public void getEmployees() throws SQLException {
        String query = "Select * From employees";

        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");

            System.out.println(id + ". " + name + " " + lastname + "\n" + email);
        }

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        V2_Getting_Data setUp = new V2_Getting_Data();
        setUp.getEmployees();
    }
}
