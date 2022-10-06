package DataBase.Demo;

import java.sql.*;

public class RemoteDatabase {
    private String username ="hr";
    private String password ="hr";
    private String db_name = "HR";
    private String host = "54.89.215.84";
    private int port = 1521;

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public RemoteDatabase(){
        String url = "jdbc:oracle://" + host + ":" + port + "/" + db_name;

        try {
            Class.forName("com.ojdbc11.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection is successful");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't found");
        } catch (SQLException e) {
            System.out.println("Couldn't connected");
        }
    }

    public static void main(String[] args) {
        RemoteDatabase remote = new RemoteDatabase();
    }


}
