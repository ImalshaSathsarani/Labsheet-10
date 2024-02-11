/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet10Package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public  void insert(int indexnumber,String name,String subject1,String subject2,String subject3,String gpa){
    
    String sql="INSERT INTO students(indexnumber,name,subject1,subject2,subject3,gpa) VALUES(?,?,?,?,?,?)";
      try{
      Connection conn=Connect.getConnection();
      PreparedStatement pstmt=conn.prepareStatement(sql);
      
        pstmt.setInt(1,indexnumber);
       pstmt.setString(2,name);
      pstmt.setString(3,subject1);
       pstmt.setString(4,subject2);
       pstmt.setString(5,subject3);
       pstmt.setString(6,gpa);
       pstmt.executeUpdate();
       
       pstmt.close();
      }catch(SQLException e){
          System.out.println(e.getMessage());
      }
    } 
    
    public void deleteAllData()throws SQLException{
    String deleteQuery="DELETE FROM students";
    
    Connection conn=Connect.getConnection();
   Statement statement =conn.createStatement();
   
   statement.executeUpdate(deleteQuery);
    
   }
    
}
