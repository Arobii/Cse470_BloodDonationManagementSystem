/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
     public static final String  url = "jdbc:mysql://localhost:3306/bdms";
     public static final String user = "root";
     public static final String password = "123456";
    public static Connection getCon()
    {
        try{
          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            return con;
            

        }
        catch (Exception e)
        {
            
            e.printStackTrace();
            System.out.println("Unable to connect"+e);
            return null;
        }
       
    }
}
