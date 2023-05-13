/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_firstpage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;


/**
 *
 * @author SANJAI
 */
public class db {
    Connection con=null;
    PreparedStatement pst;
    public static Connection dbconnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/petrol_pumb","root","root");
            return conn;
        } catch(Exception e){
            System.out.println(e);
            return null;
            }
    }

}
