/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet10Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static Connection getConnection(){
    String url="jdbc:sqlite:C://sqlite/Student details.db";
     Connection conn=null;
    try{
    conn=DriverManager.getConnection(url);
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
    return conn;
    }
    
}
