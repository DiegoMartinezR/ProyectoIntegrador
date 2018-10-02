
package integrador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import integrador.bean.RegistroModelo;
import integrador.db.ConexionDB;

public class RegistroDao {
    
     public String registerUser(RegistroModelo registerBean)
 {
 String fullName = registerBean.getFullname();
 String email = registerBean.getEmail();
 String userName = registerBean.getUsername();
 String password = registerBean.getPassword();
 
 Connection con = null;
 PreparedStatement preparedStatement = null;
 
 try
 {
 con = ConexionDB.createConnection();
 String query = "insert into users(id_usuario,fullname,email,username,passwords) values (NULL,?,?,?,?)"; 
 preparedStatement = con.prepareStatement(query); 
 preparedStatement.setString(1, fullName);
 preparedStatement.setString(2, email);
 preparedStatement.setString(3, userName);
 preparedStatement.setString(4, password);
 
 int i= preparedStatement.executeUpdate();

 if (i!=0)  
 return "SUCCESS";}
 catch(SQLException e){
 e.printStackTrace();
 }
 return "Oops.. Something went wrong there..!"; 
 }
}
