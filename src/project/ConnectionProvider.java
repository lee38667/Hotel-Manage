/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
    
    /**
     *
     * @return
     */
    public static Connection getCon()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","123456");
        return con; 
        }
        catch(Exception e)
        {
        return null;
        }
    }
}
