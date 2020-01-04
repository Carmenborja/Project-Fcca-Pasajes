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
import model.beans.Cronograma;
import model.dao.CronogramaDAO;
import util.conexion;

/**
 *
 * @author crish
 */
public class CronogramaControlador extends HttpServlet {

    String findAll = "Cronograma_List.jsp";
    String create = "Cronograma_add.jsp";
    String edit = "Cronograma_edit.jsp";

    Cronograma c = new Cronograma();
    CronogramaDAO dao = new CronogramaDAO();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CronogramaControlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CronogramaControlador at " + request.getContextPath() + "</h1>");
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

        String acceso = "";
        String action = request.getParameter("accion");
         Connection con; //(1)
    conexion cn = new conexion(); //(2)

        if (action.equalsIgnoreCase("findAll")) {
            acceso = findAll;

        } else if (action.equalsIgnoreCase("add")) {
            Statement st;
            ResultSet s_esp;
            ResultSet s_esp1;
            Statement st1;
            //Un array para almacenar las especialidades
            ArrayList terminal = new ArrayList();

            try {
                con = cn.conexion();//(3)
                
                //Consultar el nombre del pais existentes en la BD
                st = con.createStatement();
                s_esp = st.executeQuery("select direccion_Terminal from terminal");

                //Añadir cada nombre en el array "pais"
                while (s_esp.next()) {
                    terminal.add(s_esp.getString(1));                    
                }
                
                s_esp.close();
                st.close();
                con.close();
              } catch (SQLException e) {
                System.err.println("ERROR en el select direccion_Terminal terminal: " + e.getMessage());
            }  
            request.setAttribute("nombre_terminal", terminal);
                
                ArrayList tarifa = new ArrayList();

            try {
                con = cn.conexion();//(3)
                
                //Consultar el nombre del pais existentes en la BD
                st1 = con.createStatement();
                s_esp1 = st1.executeQuery("select Costo from tarifa");

                //Añadir cada nombre en el array "pais"
                while (s_esp1.next()) {
                    tarifa.add(s_esp1.getString(1));                    
                }
                
                s_esp1.close();
                st1.close();
                con.close();
            
      } catch (SQLException e) {
                System.err.println("ERROR en el select Costo tarifa: " + e.getMessage());
            } 
            
            
            
            request.setAttribute("costo_tarifa", tarifa);
            
            acceso=create;
            

        } else if (action.equalsIgnoreCase("Agregar")) {  
            String ter = request.getParameter("cboTerminal");
            double tar = Double.parseDouble(request.getParameter("cboTarifa"));
            String hor_part = request.getParameter("txthor_partida");
            String hor_lleg = request.getParameter("txthor_llegada");
            String fecha_sal = request.getParameter("txtfech_sal");
            String fecha_ret = request.getParameter("txtfech_ret");
            String est_inicio = request.getParameter("txtest_inicio");
            String est_fin = request.getParameter("txtest_fin");

            c.setIdTerminal(ter);
            c.setIdTarifa(tar);
            c.setHora_partida(hor_part);
            c.setHora_llegada(hor_lleg);
            c.setFecha_salida(fecha_sal);
            c.setFecha_retorno(fecha_ret);
            c.setEstacion_inicio(est_inicio);
            c.setEstacion_fin(est_fin);

            dao.create(c);
            acceso = findAll;
        } else if (action.equalsIgnoreCase("edit")) {
            request.setAttribute("idCro", request.getParameter("id"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("Actualizar")) {

            try {
                int id=Integer.parseInt(request.getParameter("txtCodigo"));
                String ter = request.getParameter("cboTerminal");
                double tar = Double.parseDouble(request.getParameter("cboTarifa"));
                String hor_part = request.getParameter("txthor_partida");
                String hor_lleg = request.getParameter("txthor_llegada");
                String fecha_sal = request.getParameter("txtfech_sal");
                String fecha_ret = request.getParameter("txtfech_ret");
                String est_inicio = request.getParameter("txtest_inicio");
                String est_fin = request.getParameter("txtest_fin");

                c.setIdCronograma(id);
                c.setIdTerminal(ter);
                c.setIdTarifa(tar);
                c.setHora_partida(hor_part);
                c.setHora_llegada(hor_lleg);
                c.setFecha_salida(fecha_sal);
                c.setFecha_retorno(fecha_ret);
                c.setEstacion_inicio(est_inicio);
                c.setEstacion_fin(est_fin);
                dao.edit(c);
                acceso = findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + e.getMessage());
            }

        } else if (action.equalsIgnoreCase("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            c.setIdCronograma(id);
            dao.delete(id);
            acceso = findAll;
        }

        RequestDispatcher vista = request.getRequestDispatcher(acceso);
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
