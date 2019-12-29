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
import model.beans.Detalle_Reserva;
import model.dao.ClienteDAO;
import model.dao.Detalle_ReservaDAO;

/**
 *
 * @author crish
 */
public class Detalle_ReservaControlador extends HttpServlet {

    String findAll="Detalle_Reserva_List.jsp";
    String create="Detalle_Reserva_add.jsp";
    String edit="Detalle_Reserva_edit.jsp";
  
    Detalle_Reserva d=new Detalle_Reserva();
    Detalle_ReservaDAO dao=new Detalle_ReservaDAO();
    int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Detalle_ReservaControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Detalle_ReservaControlador at " + request.getContextPath() + "</h1>");
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
            int idPas = Integer.parseInt(request.getParameter("txtPasaje"));
            int idRes=Integer.parseInt(request.getParameter("txtReserva"));
            Date dur = new Date();
            
            d.setIdPasaje(idPas);
            d.setIdReserva(idRes);
            d.setDuracion(dur);
   
            dao.create(d);
            acceso=findAll;
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idDeRe",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
             int idPas = Integer.parseInt(request.getParameter("txtPasaje"));
            int idRes=Integer.parseInt(request.getParameter("txtReserva"));
            Date dur = new Date();
            
            d.setIdPasaje(idPas);
            d.setIdReserva(idRes);
            d.setDuracion(dur);
   
            dao.create(d);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            d.setIdDetalleReserva(id);
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
