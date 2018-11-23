package dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class JDBCUtil {
    private static final String SERVER = "localhost";
    private static final String DATABASE = "sad";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static MysqlDataSource ds = null;

    public static synchronized Connection getConnection() throws SQLException {
        if (ds == null) {
            try {
                ds = new MysqlDataSource();
                ds.setServerName(SERVER);
                ds.setDatabaseName(DATABASE);
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }
        return ds.getConnection(USER, PASSWORD);
    }

    public static void close(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}