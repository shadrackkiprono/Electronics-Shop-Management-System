/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scott
 */
import java.sql.*;
public class JavaConnect {
    Connection conn=null;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:Bms.sqlite");
            return conn;
            
            
        }catch(Exception e){
            
        }return null;
        
    }
    
    
}
