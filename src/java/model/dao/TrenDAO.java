package model.dao;

import interfaces.TrenCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.beans.Tren;
import util.conexion;

public class TrenDAO implements TrenCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Tren tn = new Tren();

    @Override
    public List findAll() {
        ArrayList<Tren> lista = new ArrayList<>();

        try {

            String sql = "Select * from Tren";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Tren tn = new Tren();
                tn.setIdTren(rs.getInt("idTren"));
                tn.setAsientos(rs.getString("Asientos"));
                tn.setDescripcion_tren(rs.getString("Descripcion_tren"));
                tn.setRuta(rs.getString("Ruta"));
                tn.setCantidadCoche(rs.getString("CantidadCoche"));
                lista.add(tn);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Tren findById(int id) {
        String sql = "select * from Tren where idTren=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tn.setIdTren(rs.getInt("idTren"));
                tn.setAsientos(rs.getString("Asientos"));
                tn.setDescripcion_tren(rs.getString("Descripcion_tren"));
                tn.setRuta(rs.getString("Ruta"));
                tn.setCantidadCoche(rs.getString("CantidadCoche"));
            }
        } catch (Exception e) {
        }
        return tn;
    }

    @Override
    public boolean create(Tren tn) {
        String sql = "insert into Tren values('" + tn.getIdTren()+ "','" + tn.getAsientos()+ "','" + tn.getDescripcion_tren()+ "','"
                + tn.getRuta()+ "','" + tn.getCantidadCoche()+"')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Tren tn) {
        String sql = "update Tren set Asientos='" + tn.getAsientos()+ "',Descripcion_tren='" + tn.getDescripcion_tren()+ "',Ruta='" + tn.getRuta()+ "',CantidadCoche='" + tn.getCantidadCoche()+ "' where idTren=" + tn.getIdTren();
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
        String sql = "delete from Tren where idTren=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
