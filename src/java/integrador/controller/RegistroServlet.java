
package integrador.controller;

import integrador.bean.RegistroModelo;
import integrador.dao.RegistroDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistroServlet extends HttpServlet {
    
    public RegistroServlet(){
        
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
      
                 
            String fullName = request.getParameter("fullname");
            String email = request.getParameter("email");
            String userName = request.getParameter("username");
            String password = request.getParameter("password");

            RegistroModelo registerBean = new RegistroModelo();
           
            registerBean.setFullname(fullName);
            registerBean.setEmail(email);
            registerBean.setUsername(userName);
            registerBean.setPassword(password); 

            RegistroDao registerDao = new RegistroDao();

            
            String userRegistered = registerDao.registerUser(registerBean);

            if(userRegistered.equals("SUCCESS")){
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
            }else{
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/Register.jsp").forward(request, response);
            }
            
      }

    }

