package model.dao;

import interfaces.Boleta_PagoCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.beans.Boleta_Pago;
import util.conexion;

public class Boleta_PagoDAO implements Boleta_PagoCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Boleta_Pago bp = new Boleta_Pago();

    @Override
    public List findAll() {
        ArrayList<Boleta_Pago> lista = new ArrayList<>();

        try {

            String sql = "Select * from Boleta_pago";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Boleta_Pago bp = new Boleta_Pago();
                bp.setIdBoletaPago(rs.getInt("idBoletaPago"));
                bp.setId_medio_pago(rs.getInt("id_medio_pago"));
                bp.setIdVenta(rs.getInt("idVenta"));
                lista.add(bp);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Boleta_Pago findById(int id) {
        String sql = "select * from Boleta_pago where idBoletaPago=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                bp.setIdBoletaPago(rs.getInt("idBoletaPago"));
                bp.setId_medio_pago(rs.getInt("id_medio_pago"));
                bp.setIdVenta(rs.getInt("idVenta"));
            }
        } catch (Exception e) {
        }
        return bp;
    }

    @Override
    public boolean create(Boleta_Pago bp) {
        String sql = "insert into Boleta_pago values('" + bp.getId_medio_pago() + "','" + bp.getIdVenta() + "')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Boleta_Pago bp) {
        String sql = "update Boleta_pago set id_medio_pago='" + bp.getId_medio_pago()+ "',idVenta='" + bp.getIdVenta()+ "' where idBoletaPago=" + bp.getIdBoletaPago();
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
        String sql = "delete from Boleta_pago where idBoletaPago=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
