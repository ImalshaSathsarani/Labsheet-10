/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet10Package;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;






 
public class CreateDB {
    
    public static void createNewDatabase(String fileName)throws ClassNotFoundException{
        String url="jdbc:sqlite:C:/sqlite/"+fileName;
        
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection(url);
        if(conn!=null){
        DatabaseMetaData meta=conn.getMetaData();
        System.out.println("The driver name is"+meta.getDriverName());
            System.out.println("New datbase has been created.");
        }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
   
    }
    

