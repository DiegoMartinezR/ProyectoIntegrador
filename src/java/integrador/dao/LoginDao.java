
package integrador.dao;

import integrador.bean.LoginModelo;
import integrador.db.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginDao {
    
    public String authenticateUser(LoginModelo loginBean)
{
    String userName = loginBean.getUsername(); 
    String password = loginBean.getPassword();
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    String userNameDB = "";
    String passwordDB = "";
    try{
        con = ConexionDB.createConnection(); 
        statement = con.createStatement(); 
        resultSet = statement.executeQuery("select username,passwords from users"); 
        while(resultSet.next()) {
        userNameDB = resultSet.getString("username"); 
        passwordDB = resultSet.getString("passwords");
        if(userName.equals(userNameDB) && password.equals(passwordDB)) {
        return "SUCCESS"; 
        }
    } }catch(SQLException e){
    e.printStackTrace();
    }
    return "Invalid user credentials"; 
    }
}

