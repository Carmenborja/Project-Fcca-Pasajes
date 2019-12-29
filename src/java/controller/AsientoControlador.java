package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.beans.Asiento;
import model.dao.AsientoDAO;

public class AsientoControlador extends HttpServlet {

    String findAll="Asiento_List.jsp";
    String create="Asiento_add.jsp";
    String edit="Asiento_edit.jsp";
    
    Asiento a = new Asiento();
    AsientoDAO dao = new AsientoDAO();
    int id;
    
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
            acceso=create;
            
        }
        else if(action.equalsIgnoreCase("create")){
            int idTren=Integer.parseInt(request.getParameter("txttren"));
            int idCliente=Integer.parseInt(request.getParameter("txtcliente"));
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
            int idTren=Integer.parseInt(request.getParameter("txttren"));
            int idCliente=Integer.parseInt(request.getParameter("txtcliente"));
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
