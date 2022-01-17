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
public class AgeCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
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
            throws ServletException, IOException, NumberFormatException, IllegalFormatConversionException {
        String ageInput = request.getParameter("age");

        if (ageInput != null){

            try{

            int age = Integer.parseInt(ageInput);

            age++;

            String message = String.format("You will be %d after your next birthday.", age);

            request.setAttribute("message", message);

            } catch (NumberFormatException | IllegalFormatConversionException ex) {
            //When input exists but not a number
            String message = String.format("%s is not a number, enter numerical values only.", ageInput);
           
           request.setAttribute("message", message);
            }
        } else {
            String message = String.format("You must provide your current age", ageInput );
           
            request.setAttribute("message", message);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
}
