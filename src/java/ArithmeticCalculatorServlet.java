/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JRKap
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticJsp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String get1 = request.getParameter("first");
        String get2 = request.getParameter("second");
        String wumbus = request.getParameter("info");
        request.setAttribute("first", get1);
        request.setAttribute("second", get2);
        
        if(get1 == null || get2 == null|| get2.equals("") || get1.equals("")){
            
            request.setAttribute("message", "Incorrect input, use numbers");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticJsp.jsp").forward(request, response);
            return;
        }
        try{
            double get1D = Double.parseDouble(get1);
            double get2D = Double.parseDouble(get2);
     
            String finalD = calculator(get1D, get2D, wumbus.charAt(0));
            request.setAttribute("message",finalD);
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticJsp.jsp").forward(request, response);
            return;
        }catch(NumberFormatException e){
            
        
            try{
                int get1I = Integer.parseInt(get1);
                int get2I = Integer.parseInt(get2);
                String finalD = calculator(get1I, get2I, wumbus.charAt(0));
                
            request.setAttribute("message",finalD);
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticJsp.jsp").forward(request, response);
            return;      
                        
            }catch(NumberFormatException es){
            request.setAttribute("message", "Incorrect input, use numbers");
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticJsp.jsp").forward(request, response);
            return; 
        }}
        
        
        
        
        
        
        
        
    }

    private String calculator(double get1D, double get2D, char wumbus){
        String calc = "";
        switch(wumbus){
            case '+': calc = "" + (get1D + get2D);
            break;
            case'-': calc = "" + (get1D - get2D);
            break;
            case'*': calc = "" + (get1D * get2D);
            break;
            case'%': calc = "" + (get1D % get2D);
            break;
        }
        return calc;
    }
    private String calculator(int get1I, int get2I, char wumbus){
        String calc = "";
        switch(wumbus){
            case '+': calc = "" + (get1I + get2I);
            break;
            case'-': calc = "" + (get1I + get2I);
            break;
            case'*': calc = "" + (get1I + get2I);
            break;
            case'%': calc = "" + (get1I + get2I);
            break;
        }
        return calc;
    }
    
}
