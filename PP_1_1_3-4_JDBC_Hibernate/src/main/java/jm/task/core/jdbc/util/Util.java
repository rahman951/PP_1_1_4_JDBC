package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    
    
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    
}
