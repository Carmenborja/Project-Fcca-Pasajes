package model.dao;

import java.util.List;
import interfaces.TerminalCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.beans.Terminal;
import util.conexion;

public class TerminalDAO implements TerminalCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Terminal tr = new Terminal();
    
    @Override
    public List findAll() {
        ArrayList<Terminal> lista = new ArrayList<>();

        try {

            String sql = "select idTerminal,TR.Ruta,Nombre_Terminal,direccion_Terminal,telefono_Terminal from Terminal T INNER JOIN Tren TR ON T.idTren = TR.idTren";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Terminal tr = new Terminal();
                tr.setIdTerminal(rs.getInt("idTerminal"));
                tr.setIdTren(rs.getString("TR.Ruta"));
                tr.setNombre_Terminal(rs.getString("Nombre_Terminal"));
                tr.setDireccion_Terminal(rs.getString("direccion_Terminal"));
                tr.setTelefono_Terminal(rs.getString("telefono_Terminal"));
                lista.add(tr);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Terminal findById(int id) {
        String sql = "select * from Terminal where idTerminal=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tr.setIdTerminal(rs.getInt("idTerminal"));
                tr.setIdTren(rs.getString("idTren"));
                tr.setNombre_Terminal(rs.getString("Nombre_Terminal"));
                tr.setDireccion_Terminal(rs.getString("direccion_Terminal"));
                tr.setTelefono_Terminal(rs.getString("telefono_Terminal"));
            }
        } catch (Exception e) {
        }
        return tr;
    }

    @Override
    public boolean create(Terminal tr) {
        String sql = "insert into Terminal values('" + tr.getIdTerminal()+ "','" + tr.getIdTren()+ "','" + tr.getNombre_Terminal()+ "','"
                + tr.getDireccion_Terminal()+ "','" + tr.getTelefono_Terminal()+"')";
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
    public boolean edit(Terminal tr) {
        String sql = "update Terminal set idTren='" + tr.getIdTren()+ "',Nombre_Terminal='" + tr.getNombre_Terminal()+ "',direccion_Terminal='" + tr.getDireccion_Terminal()+ "',telefono_Terminal='" + tr.getTelefono_Terminal()+ "' where idTerminal=" + tr.getIdTerminal();
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
        String sql = "delete from Terminal where idTerminal=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
