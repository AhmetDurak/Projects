package DataBase;

import java.sql.*;

public class RemoteDatabase {
    //Server: sql11.freemysqlhosting.net
    //Name: sql11494589
    //Username: sql11494589
    //Password: RSidAHF7Mu
    //Port number: 3306

    private String userName = "sql11493323";
    private String password = "Please wait";
    private String db_name = "sql11493323";

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public RemoteDatabase() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://" + "sql11.freemysqlhosting.net" + ":" + 3306 + "/" + db_name;

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection is successful");
    }
}
