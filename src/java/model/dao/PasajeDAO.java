package model.dao;

import java.util.List;
import interfaces.PasajeCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.beans.Pasaje;
import util.conexion;

public class PasajeDAO implements PasajeCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Pasaje pas = new Pasaje();
    
    @Override
    public List findAll() {
        ArrayList<Pasaje> lista = new ArrayList<>();

        try {

            String sql = "Select * from Pasaje";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pas = new Pasaje();
                pas.setIdPasaje(rs.getInt("idPasaje"));
                pas.setIdCronograma(rs.getInt("idCronograma"));
                pas.setFecha_pasaje(rs.getDate("Fecha_pasaje"));
                pas.setCategoria(rs.getString("categoria"));
                lista.add(pas);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Pasaje findById(int id) {
        String sql = "select * from Pasaje where idPasaje=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pas.setIdPasaje(rs.getInt("idPasaje"));
                pas.setIdCronograma(rs.getInt("idCronograma"));
                pas.setFecha_pasaje(rs.getDate("Fecha_pasaje"));
                pas.setCategoria(rs.getString("categoria"));
            }
        } catch (Exception e) {
        }
        return pas;
    }

    @Override
    public boolean create(Pasaje pas) {
        String sql = "insert into Pasaje values('" + pas.getIdCronograma()+ "','" + pas.getFecha_pasaje()+ "','" + pas.getCategoria()+"')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Pasaje pas) {
        String sql = "update Pasaje set idCronograma='" + pas.getIdCronograma()+ "',Fecha_pasaje='" + pas.getFecha_pasaje()+ "',categoria='" + pas.getCategoria()+ "' where idPasaje=" + pas.getIdPasaje();
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
        String sql = "delete from Pasaje where idPasaje=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
