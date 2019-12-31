package model.dao;

import java.util.List;
import interfaces.PaisCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.beans.Cliente;
import model.beans.Pais;
import util.conexion;

public class PaisDAO implements PaisCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Pais p = new Pais();

    @Override
    public List findAll() {
        ArrayList<Pais> lista = new ArrayList<>();

        try {

            String sql = "Select * from Pais";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pais p = new Pais();
                p.setIdPais(rs.getInt("idPais"));
                p.setNombre(rs.getString("Nombre"));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Pais findById(int id) {
        String sql = "select * from Pais where idPais=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setIdPais(rs.getInt("idPais"));
                p.setNombre(rs.getString("Nombre"));
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean create(Pais p) {
        String sql = "insert into Pais values('" + p.getIdPais()+ "','" + p.getNombre()+"')";
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
    public boolean edit(Pais p) {
        String sql = "update Pais set Nombre='" + p.getNombre()+"' where idPais=" + p.getIdPais();
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
    public boolean delete(int id) {
        String sql = "delete from Pais where idPais=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
