/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.beans.Venta;
import model.dao.VentaDAO;

/**
 *
 * @author crish
 */
public class VentaControlador extends HttpServlet {

    String findAll="Venta_List.jsp";
    String create="Venta_add.jsp";
    String edit="Venta_edit.jsp";
  
    Venta v=new Venta();
    VentaDAO dao=new VentaDAO();
    int id;
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
            
        }
        else if(action.equalsIgnoreCase("create")){           
            int idTar=Integer.parseInt(request.getParameter("txtidTar"));
            int idCli=Integer.parseInt(request.getParameter("txtidCli"));
            int idEmp=Integer.parseInt(request.getParameter("txtidEmp"));
            String Fecha_venta = request.getParameter("fecha");
            
           
            v.setIdTarifa(idTar);
            v.setIdCliente(idCli);
            v.setIdEmpleado(idEmp);
            v.setFecha_venta(Fecha_venta);
            
            dao.create(v);
            acceso=findAll;
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idTren",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
             int idTar=Integer.parseInt(request.getParameter("txtidTar"));
            int idCli=Integer.parseInt(request.getParameter("txtidCli"));
            int idEmp=Integer.parseInt(request.getParameter("txtidEmp"));
            String Fecha_venta = request.getParameter("fecha");

            
           
            v.setIdTarifa(idTar);
            v.setIdCliente(idCli);
            v.setIdEmpleado(idEmp);
            v.setFecha_venta(Fecha_venta);
            
            dao.create(v);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            v.setIdVenta(id);
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
