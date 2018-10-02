
package integrador.controller;

import integrador.bean.LoginModelo;
import integrador.dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
    
    public LoginServlet(){
    }
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        LoginModelo loginBean = new LoginModelo(); 
        loginBean.setUsername(userName); 
        loginBean.setPassword(password);
        LoginDao loginDao = new LoginDao(); 
        String userValidate = loginDao.authenticateUser(loginBean); 
        if(userValidate.equals("SUCCESS")) 
        {
        request.setAttribute("userName", userName); 
        request.getRequestDispatcher("/Home.jsp").forward(request, response);
        }
        else
        {
        request.setAttribute("errMessage", userValidate); 
        request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
        }

    }




