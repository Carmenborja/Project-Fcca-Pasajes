package model.dao;

import java.util.List;
import interfaces.TarifaCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.beans.Tarifa;
import util.conexion;

public class TarifaDAO implements TarifaCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Tarifa tr = new Tarifa();
    
    @Override
    public List findAll() {
        ArrayList<Tarifa> lista = new ArrayList<>();

        try {

            String sql = "Select * from Tarifa";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Tarifa tr = new Tarifa();
                tr.setIdTarifa(rs.getInt("idTarifa"));
                tr.setIdTipoViaje(rs.getString("idTipoViaje"));
                tr.setIdCategoria(rs.getString("idCategoria"));
                tr.setCosto(rs.getDouble("Costo"));
                lista.add(tr);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Tarifa findById(int id) {
        String sql = "select * from Tarifa where idTarifa=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tr.setIdTarifa(rs.getInt("idTarifa"));
                tr.setIdTipoViaje(rs.getString("idTipoViaje"));
                tr.setIdCategoria(rs.getString("idCategoria"));
                tr.setCosto(rs.getDouble("Costo"));
            }
        } catch (Exception e) {
        }
        return tr;
    }

    @Override
    public boolean create(Tarifa tr) {
        String sql = "insert into Tarifa values('" + tr.getIdTarifa()+ "','" + tr.getIdTipoViaje()+ "','" + tr.getIdCategoria()+ "','"
                + tr.getCosto()+"')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Tarifa tr) {
        String sql = "update Tarifa set idTipoViaje='" + tr.getIdTipoViaje()+ "',idCategoria='" + tr.getIdCategoria()+ "',Costo='" + tr.getCosto()+"' where idTarifa=" + tr.getIdTarifa();
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from Tarifa where idTarifa=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
