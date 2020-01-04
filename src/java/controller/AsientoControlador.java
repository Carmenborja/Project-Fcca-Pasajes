package controller;

import java.io.IOException;
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
import model.beans.Asiento;
import model.dao.AsientoDAO;
import util.conexion;

public class AsientoControlador extends HttpServlet {

    String findAll="Asiento_List.jsp";
    String create="Asiento_add.jsp";
    String edit="Asiento_edit.jsp";
    
    Asiento a = new Asiento();
    AsientoDAO dao = new AsientoDAO();
    int id;
    Connection con; //(1)
    conexion cn = new conexion(); //(2)
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

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
                s_esp = st.executeQuery("select idTren from tren");

                //Añadir cada nombre en el array "pais"
                while (s_esp.next()) {
                    pais.add(s_esp.getString(1));                    
                }
                
                s_esp.close();
                st.close();
                con.close();
              } catch (SQLException e) {
                System.err.println("ERROR en el select id tren: " + e.getMessage());
            }  
            request.setAttribute("id_tren", pais);
                
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
            int idTren=Integer.parseInt(request.getParameter("cboTren"));
            int idCliente=Integer.parseInt(request.getParameter("cboCliente"));
            String n_asiento=request.getParameter("txtnumero");
            String descripcion=request.getParameter("txtdescripcion");
           
            a.setIdTren(idTren);
            a.setIdCliente(idCliente);
            a.setN_asiento(n_asiento);
            a.setDescripcion_Asiento(descripcion);
            
            dao.create(a);
            acceso=findAll;
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idAsi",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
            int id=Integer.parseInt(request.getParameter("txtCodigo"));
            int idTren=Integer.parseInt(request.getParameter("cboTren"));
            int idCliente=Integer.parseInt(request.getParameter("cboCliente"));
            String n_asiento=request.getParameter("txtnumero");
            String descripcion=request.getParameter("txtdescripcion");
            
            a.setIdAsiento(id);
            a.setIdTren(idTren);
            a.setIdCliente(idCliente);
            a.setN_asiento(n_asiento);
            a.setDescripcion_Asiento(descripcion);
            dao.edit(a);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            a.setIdAsiento(id);
            dao.delete(id);
            acceso=findAll;
        }
        
         RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
