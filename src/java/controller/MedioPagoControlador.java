package controller;

import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.beans.Medio_Pago;
import model.dao.Medio_PagoDAO;

public class MedioPagoControlador extends HttpServlet {

    String findAll="MedioPago_List.jsp";
    String create="MedioPago_add.jsp";
    String edit="MedioPago_edit.jsp";
  
    Medio_Pago m=new Medio_Pago();
    Medio_PagoDAO dao=new Medio_PagoDAO();
    int id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch(accion){
            case "Principal":
                request.getRequestDispatcher("Principal_Empleado.html").forward(request, response);
                break;
            default:
                throw new AssertionError();
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
            String nomT=request.getParameter("txtNombreTit");
            String apeT=request.getParameter("txtApellidosT");
            String n_tar=request.getParameter("txtNTarjeta");
            String cod=request.getParameter("txtCodSeg");
            String corr=request.getParameter("txtCorreo");
            Date Fecha_exp = new Date();
            
            m.setNombre_titular(nomT);
            m.setApellidos_titular(apeT);
            m.setN_tarjeta(n_tar);
            m.setCodigo_seguridad(cod);
            m.setCorreo(corr);
            m.setFecha_expiracion(Fecha_exp);
           

            dao.create(m);
            acceso=findAll;
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idMePa",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
             String nomT=request.getParameter("txtNombreTit");
            String apeT=request.getParameter("txtApellidosT");
            String n_tar=request.getParameter("txtNTarjeta");
            String cod=request.getParameter("txtCodSeg");
            String corr=request.getParameter("txtCorreo");
            Date Fecha_exp = new Date();
            
            m.setNombre_titular(nomT);
            m.setApellidos_titular(apeT);
            m.setN_tarjeta(n_tar);
            m.setCodigo_seguridad(cod);
            m.setCorreo(corr);
            m.setFecha_expiracion(Fecha_exp);
           

            dao.create(m);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            m.setIdMedioPago(id);
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
