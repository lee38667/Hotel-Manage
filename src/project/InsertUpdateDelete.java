/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dillon
 */
public class InsertUpdateDelete {
    public static void setData(String Query,String msg)
    {
        Connection conn= null;
        Statement st= null;
        try 
        {
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Yuuji");
                                                                         
            st = conn.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try 
        {}
        catch(Exception e)
        {}
    }
}
