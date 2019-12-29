package model.dao;

import java.util.List;
import interfaces.Detalle_VentaCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.beans.Detalle_Venta;
import util.conexion;

public class Detalle_VentaDAO implements Detalle_VentaCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Detalle_Venta dv = new Detalle_Venta();
    
    @Override
    public List findAll() {
        ArrayList<Detalle_Venta> lista = new ArrayList<>();

        try {

            String sql = "Select * from Detalle_venta";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Detalle_Venta dv = new Detalle_Venta();
                dv.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                dv.setIdPasaje(rs.getInt("idPasaje"));
                dv.setIdVenta(rs.getInt("idVenta"));
                dv.setCantidad_venta(rs.getInt("Cantidad_venta"));
                lista.add(dv);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Detalle_Venta findById(int id) {
        String sql = "select * from Detalle_venta where idDetalleVenta=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                dv.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                dv.setIdPasaje(rs.getInt("idPasaje"));
                dv.setIdVenta(rs.getInt("idVenta"));
                dv.setCantidad_venta(rs.getInt("Cantidad_venta"));
            }
        } catch (Exception e) {
        }
        return dv;
    }

    @Override
    public boolean create(Detalle_Venta dv) {
        String sql = "insert into Detalle_venta values('" + dv.getIdDetalleVenta()+ "','" + dv.getIdPasaje()+ "','" + dv.getIdVenta()+ "','"
                + dv.getCantidad_venta()+ "')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Detalle_Venta dv) {
        String sql = "update Detalle_venta set idPasaje='" + dv.getIdPasaje()+ "',idVenta='" + dv.getIdVenta()+ "',Cantidad_venta='" + dv.getCantidad_venta()+ "' where idDetalleVenta=" + dv.getIdDetalleVenta();
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
        String sql = "delete from Detalle_venta where idDetalleVenta=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
