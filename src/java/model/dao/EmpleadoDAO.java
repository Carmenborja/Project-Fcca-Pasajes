package model.dao;

import java.util.List;
import interfaces.EmpleadoCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.beans.Empleado;
import util.conexion;

public class EmpleadoDAO implements EmpleadoCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Empleado emp = new Empleado();
    
    @Override
    public List findAll() {
        ArrayList<Empleado> lista = new ArrayList<>();

        try {

            String sql = "Select * from Empleado";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setIdEmpleado(rs.getInt("idEmpleado"));
                emp.setNombres(rs.getString("Nombres"));
                emp.setApellidos(rs.getString("Apellidos"));
                emp.setDni(rs.getString("Dni"));
                emp.setTelefono(rs.getString("Telefono"));
                emp.setDireccion(rs.getString("Direccion"));
                emp.setIdTipoEmpleado(rs.getString("idTipoEmpleado"));
                emp.setActivo(rs.getByte("Activo"));
                emp.setUsuario(rs.getString("Usuario"));
                emp.setContraseña(rs.getString("Contraseña"));
                lista.add(emp);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Empleado findById(int id) {
        String sql = "select * from Empleado where idEmpleado=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                emp.setIdEmpleado(rs.getInt("idEmpleado"));
                emp.setNombres(rs.getString("Nombres"));
                emp.setApellidos(rs.getString("Apellidos"));
                emp.setDni(rs.getString("Dni"));
                emp.setTelefono(rs.getString("Telefono"));
                emp.setDireccion(rs.getString("Direccion"));
                emp.setIdTipoEmpleado(rs.getString("idTipoEmpleado"));
                emp.setActivo(rs.getByte("Activo"));
                emp.setUsuario(rs.getString("Usuario"));
                emp.setContraseña(rs.getString("Contraseña"));
            }
        } catch (Exception e) {
        }
        return emp;
    }

    @Override
    public boolean create(Empleado emp) {
        String sql = "insert into Empleado values('" + emp.getIdEmpleado()+ "','" + emp.getNombres()+ "','" + emp.getApellidos()+ "','" + emp.getDni()+ "','"
                + emp.getTelefono()+ "','" + emp.getDireccion()+ "','" + emp.getIdTipoEmpleado()+ "','" + emp.getActivo()+ "','" + emp.getUsuario()+ "','" + emp.getContraseña()+ "')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Empleado emp) {
        String sql = "update Empleado set Nombres='" + emp.getNombres()+ "',Apellidos='" + emp.getApellidos()+ "',Dni='" + emp.getDni()+ "',Telefono='" + emp.getTelefono()+ "',Direccion='" + emp.getDireccion()+ "',idTipoEmpleado='" + emp.getIdTipoEmpleado()+ "',Activo='" + emp.getActivo()+ "',Usuario='" + emp.getUsuario()+ "',Contraseña='" + emp.getContraseña()+ "' where idEmpleado=" + emp.getIdEmpleado();
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from Empleado where idEmpleado=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Empleado validar(String user, String pass) {
        Empleado em = new Empleado();
        String sql = "select * from Empleado where Usuario=? and Contraseña=?";
        try {
            con = cn.conexion();
            ps= con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            while (rs.next()) {                
                em.setIdEmpleado(rs.getInt("idEmpleado"));
                em.setUsuario(rs.getString("Usuario"));
                em.setIdTipoEmpleado(rs.getString("idTipoEmpleado"));
                em.setNombres(rs.getString("Nombres"));
                em.setApellidos(rs.getString("Apellidos"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage());
        }
        return em;
    }

}
