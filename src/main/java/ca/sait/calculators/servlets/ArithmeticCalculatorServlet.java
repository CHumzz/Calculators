package ca.sait.calculators.servlets;

import java.io.*;
import java.util.*;
import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Determines the next age of the person.
 * @author Cole Humeniuk
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NullPointerException, NumberFormatException, IllegalFormatConversionException {
        String num1 = request.getParameter("first");
        String num2 = request.getParameter("second");
        int result = 0;
         
            try{ 
                    int first = Integer.parseInt(num1);
                    int second = Integer.parseInt(num2);

                if (request.getParameter("operation").equals("add")){                  
                    result = first + second;
                    request.setAttribute("result", result);

                   } else if (request.getParameter("operation").equals("minus")){                  
                    result = first - second;
                    request.setAttribute("result", result);

                   } else if (request.getParameter("operation").equals("multiply")){
                    result = first * second;
                    request.setAttribute("result", result);

                   } else if (request.getParameter("operation").equals("divide")){                    
                    result = first / second;
                    request.setAttribute("result", result);
                   }
            
            } catch (NullPointerException ex) {
                String message = String.format("Invalid" );
                request.setAttribute("result", message);
                
            } catch (NumberFormatException | IllegalFormatConversionException ex) {
                String message = String.format("Invalid.");
                request.setAttribute("result", message);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}


