package utilities;

import org.testng.annotations.Test;

import java.sql.*;

public class ManageDb extends Base{


    public static void myDB() throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.jdbc.Driver");//Load mysql jdbc driver
        Connection con = DriverManager.getConnection(dbUrl, user, pass);//Create DB Connection
        Statement stmt = con.createStatement();//Create Statement Object
        ResultSet rs = stmt.executeQuery(query);//Execute the SQL Query. Store results in ResultsSet
        while (rs.next()) {
            userName = rs.getString(2);
            password = rs.getString(3);
        }
        con.close();

    }
    @Test
    public void test() throws SQLException, ClassNotFoundException {
        myDB();
        System.out.println(userName+password);
    }


}