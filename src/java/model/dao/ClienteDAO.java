    
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.beans.Cliente;
import util.conexion;
import interfaces.ClienteCRUD;
import javax.swing.JOptionPane;


public class ClienteDAO implements ClienteCRUD{
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ResultSet rs_cli;
    Cliente cli = new Cliente();

    @Override
    public List findAll() {
        ArrayList<Cliente> lista = new ArrayList<>();
        
        try {
            
            String sql = "select idcliente,P.nombre,nombres,apellidos,idtipodocumento,nrodocumento,telefono,direccion,genero,correo,fechanacimiento from Cliente C INNER JOIN pais P ON  C.idPais = P.idPais";
            
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setIdCliente(rs.getInt("idcliente"));
                cli.setIdPais(rs.getString("P.nombre"));
                cli.setNombres(rs.getString("nombres"));
                cli.setApellidos(rs.getString("Apellidos"));
                cli.setIdTipoD(rs.getString("idTipoDocumento"));
                cli.setnDocumento(rs.getString("NroDocumento"));
                cli.setTelf(rs.getString("Telefono"));
                cli.setDireccion(rs.getString("Direccion"));
                cli.setGenero(rs.getString("Genero"));
                cli.setCorreo(rs.getString("Correo"));
                cli.setFechaN(rs.getString("FechaNacimiento"));
                lista.add(cli);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    

    @Override
    public Cliente findById(int id) {
        String sql="select * from Cliente where idCliente="+id;
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
               cli.setIdCliente(rs.getInt("idCliente"));
                cli.setIdPais(rs.getString("idPais"));
                cli.setNombres(rs.getString("Nombres"));
                cli.setApellidos(rs.getString("Apellidos"));
                cli.setIdTipoD(rs.getString("idTipoDocumento"));
                cli.setnDocumento(rs.getString("NroDocumento"));
                cli.setTelf(rs.getString("Telefono"));
                cli.setDireccion(rs.getString("Direccion"));
                cli.setGenero(rs.getString("Genero"));
                cli.setCorreo(rs.getString("Correo"));
                cli.setFechaN(rs.getString("FechaNacimiento"));
            }           
        }catch (Exception e){       
        }
        return cli;
    }

    @Override
    public boolean create(Cliente cli) {
        String sql="insert into Cliente (idPais, Nombres, Apellidos, idTipoDocumento, NroDocumento, Telefono,Direccion, Genero, Correo, FechaNacimiento) values('"+cli.getIdPais()+"','"+cli.getNombres()+"','"+cli.getApellidos()+"','"
                +cli.getIdTipoD()+"','"+cli.getnDocumento()+"','"+cli.getTelf()+"','"+cli.getDireccion()+"','"+cli.getGenero()+"','"+cli.getCorreo()+"','"
               +cli.getFechaN()+"')";
            try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            }catch(Exception e){ 
                JOptionPane.showMessageDialog(null,""+e.getMessage());
            }
                return false;
    }
    
    @Override
    public boolean edit(Cliente cli) {
        String sql="update Cliente set idPais='"+cli.getIdPais()+"',Nombres='"+cli.getNombres()+"',Apellidos='"+cli.getApellidos()+"',idTipoDocumento='"+cli.getIdTipoD()+"',NroDocumento='"+cli.getnDocumento()+"',Telefono='"+cli.getTelf()+"',Direccion='"+cli.getDireccion()+"',Genero='"+cli.getGenero()+"',Correo='"+cli.getCorreo()+"',FechaNacimiento='"+cli.getFechaN()+"' where idCliente="+cli.getIdCliente();
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
       String sql="delete from Cliente where idCliente="+id;
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public List findByCountry() {
        ArrayList<Cliente> lista = new ArrayList<>();
        
        try {
            
            String sql = "Select p.nombre from Cliente as c inner join Pais as p where c.idPais = p.idPais";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setIdPais(rs.getString("idPais"));
                lista.add(cli);
            }
        } catch (Exception e) {
        }
        return lista;
    }


    
    
}
