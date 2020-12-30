package qam1.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project: Qam1
 * Package: qam1.DAO
 * <p>
 * Author: Zachary Mollenhour
 * Date: 12/30/2020
 * Time: 9:49 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class DBConnection {

    //Declare the Database Connection Variables
    private static final String DATABASENAME = "U07xwX";
    private static final String DB_URL = "jdbc:mysql://wgudb.ucertify.com/" + DATABASENAME;
    private static final String USERNAME = "U07xwX";
    private static final String PASSWORD = "53689163256";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    static Connection conn;

    /**
     * Function to attempt to make a connction to the database
     * @return conn connection
     * @throws ClassNotFoundException classnotfound
     * @throws SQLException sqlexception
     * @throws Exception exception
     */
    public static void makeConnection() throws ClassNotFoundException, SQLException, Exception {
        Class.forName(DRIVER);
        conn = (Connection) DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

        System.out.println("Successful Connection");

    }

    /**
     * Function to close active connections with the sql database
     * @throws ClassNotFoundException classnotfound
     * @throws SQLException sqlexception
     * @throws Exception exception
     */
    public static void closeConnection() throws ClassNotFoundException, SQLException, Exception {

        conn.close();
        System.out.println("Connection Closed");
    }

}
