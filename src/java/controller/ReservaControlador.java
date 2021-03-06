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
import model.beans.Reserva;
import model.dao.ReservaDAO;
import util.conexion;

/**
 *
 * @author crish
 */
public class ReservaControlador extends HttpServlet {

    String findAll="Reserva_List.jsp";
    String create="Reserva_add.jsp";
    String edit="Reserva_edit.jsp";
  
    Reserva r = new Reserva();
    ReservaDAO dao=new ReservaDAO();
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
            out.println("<title>Servlet ReservaControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ReservaControlador at " + request.getContextPath() + "</h1>");
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
            ResultSet s_esp1;
            Statement st1;
            //Un array para almacenar las especialidades
            ArrayList pais = new ArrayList();

            try {
                con = cn.conexion();//(3)
                
                //Consultar el nombre del pais existentes en la BD
                st = con.createStatement();
                s_esp = st.executeQuery("select Nombres from empleado");

                //Añadir cada nombre en el array "pais"
                while (s_esp.next()) {
                    pais.add(s_esp.getString(1));                    
                }
                
                s_esp.close();
                st.close();
                con.close();
              } catch (SQLException e) {
                System.err.println("ERROR en el select Nombres empleado: " + e.getMessage());
            }  
            request.setAttribute("nombre_trabajador", pais);
                
                ArrayList cliente = new ArrayList();

            try {
                con = cn.conexion();//(3)
                
                //Consultar el nombre del pais existentes en la BD
                st1 = con.createStatement();
                s_esp1 = st1.executeQuery("select Nombres from cliente");

                //Añadir cada nombre en el array "pais"
                while (s_esp1.next()) {
                    cliente.add(s_esp1.getString(1));                    
                }
                
                s_esp1.close();
                st1.close();
                con.close();
            
      } catch (SQLException e) {
                System.err.println("ERROR en el select nombre cliente: " + e.getMessage());
            } 
            
            
            
            request.setAttribute("nombre_cliente", cliente);
            
            acceso=create;
            
        }
        else if(action.equalsIgnoreCase("Agregar")){
            int idTrab=Integer.parseInt(request.getParameter("txtidTrab"));
            int idCli=Integer.parseInt(request.getParameter("txtidCli"));
            String Fecha=request.getParameter("txtfecha");
            String descripcion=request.getParameter("txtDesc");
           
           
            r.setIdTrabajador(idTrab);
            r.setIdCliente(idCli);
            r.setFecha(Fecha);
            r.setDescripcion(descripcion);
            
            dao.create(r);
            acceso=findAll;
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idRe",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
             int idTrab=Integer.parseInt(request.getParameter("txtidT"));
            int idCli=Integer.parseInt(request.getParameter("txtidC"));
            String Fecha=request.getParameter("txtfecha");
            String descripcion=request.getParameter("txtDesc");
           
           
            r.setIdTrabajador(idTrab);
            r.setIdCliente(idCli);
            r.setFecha(Fecha);
            r.setDescripcion(descripcion);
            dao.edit(r);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            r.setIdReserva(id);
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
