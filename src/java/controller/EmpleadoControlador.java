package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.beans.Empleado;
import model.dao.EmpleadoDAO;

public class EmpleadoControlador extends HttpServlet {

    String findAll="Empleado_List.jsp";
    String create="Empleado_add.jsp";
    String edit="Empleado_edit.jsp";
  
    Empleado e=new Empleado();
    EmpleadoDAO dao=new EmpleadoDAO();
    int id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch(accion){
            case "Principal":
                request.getRequestDispatcher("Principal_Empleado.jsp").forward(request, response);
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
        else if(action.equalsIgnoreCase("Agregar")){
            String nom=request.getParameter("txtNombres");
            String ape=request.getParameter("txtApellidos");
            String dni=request.getParameter("txtDNI");
            String telf=request.getParameter("txtTelefono");
            String dir=request.getParameter("txtDireccion");
            String idTEmp=request.getParameter("cboTipo");
            String usu = request.getParameter("txtuser");
            String con = request.getParameter("txtpass");
            byte act = Byte.parseByte(request.getParameter("cboEstado"));
            
            
           
            e.setNombres(nom);
            e.setApellidos(ape);
            e.setDni(dni);
            e.setTelefono(telf);
            e.setDireccion(dir);
            e.setIdTipoEmpleado(idTEmp);
            e.setUsuario(usu);
            e.setContraseña(con);
            e.setActivo(act);

            dao.create(e);
            acceso=findAll;
        }
        else if(action.equalsIgnoreCase("edit")){
            request.setAttribute("idEmp",request.getParameter("id"));
            acceso=edit;    
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            try {
            int id= Integer.parseInt(request.getParameter("txtCodigo"));
            String nom=request.getParameter("txtNombres");
            String ape=request.getParameter("txtApellidos");
            String DNI=request.getParameter("txtDNI");
            String telf=request.getParameter("txtTelefono");
            String dir=request.getParameter("txtDireccion");
            String idTEmp=request.getParameter("cboTipo");
            String usu = request.getParameter("txtuser");
            String con = request.getParameter("txtpass");
            byte act = Byte.parseByte(request.getParameter("cboEstado"));
            
            
            e.setIdEmpleado(id);
            e.setNombres(nom);
            e.setApellidos(ape);
            e.setDni(DNI);
            e.setTelefono(telf);
            e.setDireccion(dir);
            e.setIdTipoEmpleado(idTEmp);
            e.setUsuario(usu);
            e.setContraseña(con);
            e.setActivo(act);

            dao.edit(e);
            acceso=findAll;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        else if(action.equalsIgnoreCase("delete")){
            int id=Integer.parseInt(request.getParameter("id"));
            e.setIdEmpleado(id);
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
