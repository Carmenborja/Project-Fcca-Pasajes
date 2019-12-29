/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.beans.Empleado;
import model.dao.EmpleadoDAO;

public class validacion extends HttpServlet {

    EmpleadoDAO dao = new EmpleadoDAO();
    Empleado em = new Empleado();
    
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
        
        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Ingresar")) {
            String user = request.getParameter("txtuser");
            String pass = request.getParameter("txtpass");
            em=dao.validar(user, pass);
            if (em.getUsuario()!=null) {
                request.getRequestDispatcher("EmpleadoControlador?accion=Principal").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
                JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrecta");
            }
        }else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
            JOptionPane.showMessageDialog(null,"Error");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
