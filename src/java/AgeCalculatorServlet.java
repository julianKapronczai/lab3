/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JRKap
 */
@WebServlet(urlPatterns = {"/AgeCalculatorServlet"})
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageClacJsp.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("ageIn");
        
        System.out.println(age);
        
        if(age == null || age.equals("")){
            request.setAttribute("message", "You need to provide your current age in number format");
            getServletContext().getRequestDispatcher("/WEB-INF/ageClacJsp.jsp").forward(request,response);
            
            return;
        }else{
            try {
                int newAge;
           newAge = Integer.parseInt(age);
            int finalAge = newAge +1;
            request.setAttribute("message","Your age this time next year will be " + finalAge);
           getServletContext().getRequestDispatcher("/WEB-INF/ageClacJsp.jsp").forward(request,response);
        }catch(NumberFormatException e){
            request.setAttribute("message","Your age needs to be a number");
           getServletContext().getRequestDispatcher("/WEB-INF/ageClacJsp.jsp").forward(request,response);
        }
        }
            }
        
        
        
            
        }
        
           
           
   

    
