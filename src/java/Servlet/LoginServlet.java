/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import Controller.UserController;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Wikon3
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession(true);
            if (session.getAttribute("isLoggedIn") != null) {
                response.sendRedirect("home");
                return;
            }
           RequestDispatcher dispatch = request.getRequestDispatcher("/views/login.jsp");
            dispatch.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        try {
            String user = request.getParameter("loginid");
            String password = request.getParameter("password");

            UserController uc = new UserController();
            ResultSet rs = uc.getByUsername(user);

            HttpSession session = request.getSession(true);
            session.removeAttribute("errors");
            
            
            if (rs.isBeforeFirst()) {
                rs.first();
                System.out.println(rs.first());

                String dataPassword = rs.getString("password");
                Boolean isValid = password.equals(dataPassword);
                
                if(!isValid) {
                    session.setAttribute("errors", "loginid or password is invalid!");
                    response.sendRedirect("login");   
                    return;
                }
                
                String name = rs.getString("nama");
                session.setAttribute("loginid", user);
                session.setAttribute("nama", name);
                session.setAttribute("password", password);
                session.setAttribute("isLoggedIn", true);
//                session.setAttribute("success", "Hello, welcome " + name + "!");
                
                response.sendRedirect("home");
            }
            else {
                session.setAttribute("errors", "User or password is invalid!");
                response.sendRedirect("login");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}