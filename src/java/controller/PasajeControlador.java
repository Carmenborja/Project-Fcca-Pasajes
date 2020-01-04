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
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.beans.Pasaje;
import model.dao.PasajeDAO;
import util.conexion;

/**
 *
 * @author crish
 */
public class PasajeControlador extends HttpServlet {

   String findAll="Pasaje_List.jsp";
    String create="Pasaje_add.jsp";
    String edit="Pasaje_edit.jsp";
  
    Pasaje p=new Pasaje();
    PasajeDAO dao=new PasajeDAO();
    int id;
    Connection con; //(1)
    conexion cn = new conexion(); //(2)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PasajeControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PasajeControlador at " + request.getContextPath() + "</h1>");
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
            Statement st;
            ResultSet s_esp;

            //Un array para almacenar las especialidades
            ArrayList pais = new ArrayList();

            try {
                con = cn.conexion();//(3)
                
                //Consultar el nombre del pais existentes en la BD
                st = con.createStatement();
                s_esp = st.executeQuery("select idCronograma from cronograma");

                //Añadir cada nombre en el array "pais"
                while (s_esp.next()) {
                    pais.add(s_esp.getString(1));                    
                }
                
                s_esp.close();
                st.close();
                con.close();
            
      
            } catch (SQLException e) {
                System.err.println("ERROR en el select nombre pais: " + e.getMessage());
            }
            
            request.setAttribute("id_cronograma", pais);
            
            
            acceso=create;
            
        }
        else if(action.equalsIgnoreCase("Agregar")){
            try {
                
            
            int idCrono=Integer.parseInt(request.getParameter("cbocrono"));
            String fecha=request.getParameter("Fecha_pasaje");
            
           
            p.setIdCronograma(idCrono);
            p.setFecha_pasaje(fecha);
            
            
            dao.create(p);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idPa",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
                
            int id=Integer.parseInt(request.getParameter("txtCodigo"));
                
            int idCrono=Integer.parseInt(request.getParameter("cbocrono"));
            String fecha=request.getParameter("Fecha_pasaje");
            
            p.setIdPasaje(id);
            p.setIdCronograma(idCrono);
            p.setFecha_pasaje(fecha);
            
            
            dao.edit(p);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            p.setIdPasaje(id);
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
