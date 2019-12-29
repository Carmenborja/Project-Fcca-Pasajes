/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.beans.Terminal;
import model.dao.TerminalDAO;
import util.conexion;

/**
 *
 * @author crish
 */
public class TerminalControlador extends HttpServlet {

    String findAll="Terminal_List.jsp";
    String create="Terminal_add.jsp";
    String edit="Terminal_edit.jsp";
  
    Terminal t=new Terminal();
    TerminalDAO dao=new TerminalDAO();
    int id;
    
    Connection con; //(1)
    conexion cn = new conexion();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TerminalControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TerminalControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String acceso="";
        String action=request.getParameter("accion");
        
        
        
        if(action.equalsIgnoreCase("findAll")){
            acceso=findAll;             
            
        }else if(action.equalsIgnoreCase("add")){
            acceso=create;
           
            Statement st;
            ResultSet s_esp;

            //Un array para almacenar las especialidades
            ArrayList ruta = new ArrayList();

            try {
                con = cn.conexion();//(3)
                
                //Consultar el nombre del pais existentes en la BD
                st = con.createStatement();
                s_esp = st.executeQuery("select ruta from tren");

                //Añadir cada nombre en el array "pais"
                while (s_esp.next()) {
                    ruta.add(s_esp.getString(1));                    
                }
                
                s_esp.close();
                st.close();
                con.close();
            
      
            } catch (SQLException e) {
                System.err.println("ERROR en el select ruta tren: " + e.getMessage());
            }
            
            request.setAttribute("ruta_tren", ruta);
            
            
            acceso=create;
            
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idTer",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
             String idTren=request.getParameter("cboTren");
            String Nom_Ter=request.getParameter("txtNom_Ter");
            String dir_Ter=request.getParameter("txtdir_Ter");
            String telf_Ter=request.getParameter("txttelf_Ter");
            
           
            t.setIdTren(idTren);
            t.setNombre_Terminal(Nom_Ter);
            t.setDireccion_Terminal(dir_Ter);
            t.setTelefono_Terminal(telf_Ter);
            
            dao.create(t);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            t.setIdTerminal(id);
            dao.delete(id);
            acceso=findAll;
        }
        
         RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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
        processRequest(request, response);
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
