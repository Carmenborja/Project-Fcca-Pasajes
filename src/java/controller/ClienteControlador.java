
package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.beans.Cliente;
import model.dao.ClienteDAO;
import util.conexion;

/**
 *
 * @author carmen
 */
@WebServlet(name = "ClienteControlador", urlPatterns = {"/ClienteControlador"})
public class ClienteControlador extends HttpServlet {

    String findAll="Cliente_List.jsp";
    String create="Cliente_add.jsp";
    String edit="Cliente_edit.jsp";
  
    Cliente e=new Cliente();
    ClienteDAO dao=new ClienteDAO();
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
        
        } else if (action.equalsIgnoreCase("add")) {
            
               Statement st;
            ResultSet s_esp;

            //Un array para almacenar las especialidades
            ArrayList pais = new ArrayList();

            try {
                con = cn.conexion();//(3)
                
                //Consultar el nombre del pais existentes en la BD
                st = con.createStatement();
                s_esp = st.executeQuery("select nombre from pais");

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
            
            request.setAttribute("nombre_pais", pais);
            
            
            acceso=create;
            
            
        }else if(action.equalsIgnoreCase("Agregar")){
            
        try {
            String idP = request.getParameter("cboP");
            String nom=request.getParameter("txtNombres");
            String ape=request.getParameter("txtApellidos");
            String tipoD=request.getParameter("cboTipoD");
            String nDocu=request.getParameter("txtNDocumento");
            String telef=request.getParameter("txtTelf");
            String dire=request.getParameter("txtDireccion");
            String genero=request.getParameter("cboG");
            String cor=request.getParameter("txtCorreo");
            String fechaN=request.getParameter("txtFechaN"); 
           
            e.setIdPais(idP);
            e.setNombres(nom);
            e.setApellidos(ape);
            e.setIdTipoD(tipoD);
            e.setnDocumento(nDocu);
            e.setTelf(telef);
            e.setDireccion(dire);
            e.setGenero(genero);
            e.setCorreo(cor);
            e.setFechaN(fechaN);
            
            dao.create(e);
            acceso=findAll;
             } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idCli",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
            int id=Integer.parseInt(request.getParameter("txtCodigo"));
            String idP = request.getParameter("cboP");
            String nom=request.getParameter("txtNombres");
            String ape=request.getParameter("txtApellidos");
            String tipoD=request.getParameter("cboTipoD");
            String nDocu=request.getParameter("txtNDocumento");
            String telef=request.getParameter("txtTelf");
            String dire=request.getParameter("txtDireccion");
            String genero=request.getParameter("cboG");
            String cor=request.getParameter("txtCorreo");
            String fechaN=request.getParameter("txtFechaN"); 
            
            e.setIdCliente(id);
            e.setIdPais(idP);
            e.setNombres(nom);
            e.setApellidos(ape);
            e.setIdTipoD(tipoD);
            e.setnDocumento(nDocu);
            e.setTelf(telef);
            e.setDireccion(dire);
            e.setGenero(genero);
            e.setCorreo(cor);
            e.setFechaN(fechaN);
            dao.edit(e);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            e.setIdCliente(id);
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
