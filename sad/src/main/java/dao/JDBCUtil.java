package dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class JDBCUtil {
    private static final String SERVER = "nicolas010256.000webhostapp.com";
    private static final String DATABASE = "id5238415_sad";
    private static final String USER = "id5238415_usuario";
    private static final String PASSWORD = "12345678";
    private static final String TIMEZONE = "UTC";
    private static MysqlDataSource ds = null;

    public static synchronized Connection getConnection() throws SQLException {
        if (ds == null) {
            try {
                ds = new MysqlDataSource();
                ds.setServerName(SERVER);
                ds.setDatabaseName(DATABASE);
                ds.setServerTimezone(TIMEZONE);
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