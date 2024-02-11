/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet10Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateTables {
    
    public static void createNewTable(){
        String sql="CREATE TABLE IF NOT EXISTS students (\n"
                +"indexnumber integer PRIMARY KEY  ,\n"
                +"name text  NOT NULL,\n"
                +"subject1 text NOT  NULL,\n"
                +"subject2 text NOT NULL,\n"
                +"subject3 text NOT NULL ,\n"
                + "gpa text \n"
                +");";
        
        try{
            Connection conn=Connect.getConnection();
            Statement stmt=conn.createStatement();
            stmt.execute(sql);
        }catch(SQLException e){
        System.out.println(e.getMessage());
        }
    
    }
    
}
