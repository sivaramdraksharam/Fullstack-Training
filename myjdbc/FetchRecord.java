package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class FetchRecord{  
public static void main(String args[])throws SQLException, ClassNotFoundException{  
  
Class.forName("com.mysql.jdbc.Driver");   
String s="Hello";
String s1="Hello";
String k=new String("Hai");

System.out.println(s.hashCode());
System.out.println(k.hashCode());

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?characterEncoding=utf8&useSSL=false&useUnicode=true","root","Mysql@786");    
System.out.println("dirver found...");
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
ResultSet rs=stmt.executeQuery("select * from prod");  
  
//getting the record of 3rd row  
rs.absolute(1);  
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));  
  
con.close();  
}} 