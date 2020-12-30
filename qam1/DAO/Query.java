package qam1.DAO;
import static qam1.DAO.DBConnection.conn;
import java.sql.ResultSet;
import java.sql.Statement;

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
public class Query {

    //Query Variables
    private static String query;
    private static Statement statement;
    private static ResultSet result;

    /**
     * Function responsible for forming queries.
     * Takes in a string paramter and forms a query and processes a executequery or executeupdate depending on first keyword.
     * @param q
     */
    public static void makeQuery(String q){
        query =q;
        try{
            statement =conn.createStatement();
            // determine query execution
            if(query.toLowerCase().startsWith("select"))
                result= statement.executeQuery(q);
            if(query.toLowerCase().startsWith("delete")||query.toLowerCase().startsWith("insert")||query.toLowerCase().startsWith("update"))
                statement.executeUpdate(q);

        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
    public static ResultSet getResult(){
        return result;
    }
}
