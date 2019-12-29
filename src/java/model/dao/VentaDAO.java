package model.dao;

import interfaces.VentaCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.beans.Venta;
import util.conexion;

public class VentaDAO implements VentaCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Venta v = new Venta();

    @Override
    public List findAll() {
        ArrayList<Venta> lista = new ArrayList<>();

        try {

            String sql = "Select * from Venta";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta v = new Venta();
                v.setIdVenta(rs.getInt("idVenta"));
                v.setIdTarifa(rs.getInt("idTarifa"));
                v.setIdCliente(rs.getInt("idCliente"));
                v.setIdEmpleado(rs.getInt("idEmpleado"));
                v.setFecha_venta(rs.getString("Fecha_venta"));
                lista.add(v);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Venta findById(int id) {
        String sql = "select * from Venta where idVenta=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                v.setIdVenta(rs.getInt("idVenta"));
                v.setIdTarifa(rs.getInt("idTarifa"));
                v.setIdCliente(rs.getInt("idCliente"));
                v.setIdEmpleado(rs.getInt("idEmpleado"));
                v.setFecha_venta(rs.getString("Fecha_venta"));
            }
        } catch (Exception e) {
        }
        return v;
    }

    @Override
    public boolean create(Venta v) {
        String sql = "insert into Venta values('" + v.getIdVenta()+ "','" + v.getIdTarifa()+ "','" + v.getIdCliente()+ "','"
                + v.getIdEmpleado()+ "','" + v.getFecha_venta()+"')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Venta v) {
        String sql = "update Venta set idTarifa='" + v.getIdTarifa()+ "',idCliente='" + v.getIdCliente()+ "',idEmpleado='" + v.getIdEmpleado()+ "',Fecha_venta='" + v.getFecha_venta()+ "' where idVenta=" + v.getIdVenta();
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
        String sql = "delete from Venta where idVenta=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
