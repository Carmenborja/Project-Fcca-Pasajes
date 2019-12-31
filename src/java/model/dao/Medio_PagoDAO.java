package model.dao;

import java.util.List;
import interfaces.Medio_PagoCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.beans.Medio_Pago;
import util.conexion;

public class Medio_PagoDAO implements Medio_PagoCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Medio_Pago mp = new Medio_Pago();

    @Override
    public List findAll() {
        ArrayList<Medio_Pago> lista = new ArrayList<>();

        try {

            String sql = "Select * from medio_pago";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Medio_Pago mp = new Medio_Pago();
                mp.setIdMedioPago(rs.getInt("idMedioPago"));
                mp.setNombre_titular(rs.getString("nombre_titular"));
                mp.setApellidos_titular(rs.getString("apellidos_titular"));
                mp.setN_tarjeta(rs.getString("n_tarjeta"));
                mp.setCodigo_seguridad(rs.getString("codigo_seguridad"));
                mp.setFecha_expiracion(rs.getString("fecha_expiracion"));
                mp.setCorreo(rs.getString("correo"));
                lista.add(mp);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Medio_Pago findById(int id) {
        String sql = "select * from medio_pago where idMedioPago=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mp.setIdMedioPago(rs.getInt("idMedioPago"));
                mp.setNombre_titular(rs.getString("nombre_titular"));
                mp.setApellidos_titular(rs.getString("apellidos_titular"));
                mp.setN_tarjeta(rs.getString("n_tarjeta"));
                mp.setCodigo_seguridad(rs.getString("codigo_seguridad"));
                mp.setFecha_expiracion(rs.getString("fecha_expiracion"));
                mp.setCorreo(rs.getString("correo"));
            }
        } catch (Exception e) {
        }
        return mp;
    }

    @Override
    public boolean create(Medio_Pago mp) {
        String sql = "insert into medio_pago values('" + mp.getIdMedioPago()+ "','" + mp.getNombre_titular()+ "','" + mp.getApellidos_titular()+ "','"
                + mp.getN_tarjeta()+ "','" + mp.getCodigo_seguridad()+ "','" + mp.getFecha_expiracion()+ "','" + mp.getCorreo()+"')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    @Override
    public boolean edit(Medio_Pago mp) {
        String sql = "update medio_pago set nombre_titular='" + mp.getNombre_titular()+ "',apellidos_titular='" + mp.getApellidos_titular()+ "',n_tarjeta='" + mp.getN_tarjeta()+ "',codigo_seguridad='" + mp.getCodigo_seguridad()+ "',fecha_expiracion='" + mp.getFecha_expiracion()+ "',correo='" + mp.getCorreo()+"' where idMedioPago=" + mp.getIdMedioPago();
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
        String sql = "delete from medio_pago where idMedioPago=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
