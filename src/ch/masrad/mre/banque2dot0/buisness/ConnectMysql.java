package ch.masrad.mre.banque2dot0.buisness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectMysql {

 private static String url = "jdbc:mysql://localhost:3306/bdeupoinzero";
 private static String user = "root";
 private static String passwd = "";
 
 private static Connection connect;

 public static Connection getInstance(){
  if(connect == null){
   try {
    connect = DriverManager.getConnection(url, user, passwd);
   } catch (SQLException e) {
    e.printStackTrace();
   }
  }  
  return connect; 
 } 
}
