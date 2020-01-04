package model.dao;

import java.util.List;
import interfaces.CronogramaCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.beans.Cronograma;
import util.conexion;

public class CronogramaDAO implements CronogramaCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cronograma cr = new Cronograma();

    @Override
    public List findAll() {
        ArrayList<Cronograma> lista = new ArrayList<>();

        try {

            String sql = "select idCronograma,TE.Nombre_Terminal,TA.Costo,hora_partida,hora_llegada,Fecha_salida,Fecha_retorno,estacion_inicio,estacion_fin from Cronograma C INNER JOIN Terminal TE ON C.idTerminal = TE.idTerminal INNER JOIN Tarifa TA ON C.idTarifa = TA.idTarifa";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cronograma cr = new Cronograma();
                cr.setIdCronograma(rs.getInt("idCronograma"));
                cr.setIdTerminal(rs.getString("Nombre_Terminal"));
                cr.setIdTarifa(rs.getDouble("Costo"));
                cr.setHora_partida(rs.getString("hora_partida"));
                cr.setHora_llegada(rs.getString("hora_llegada"));
                cr.setFecha_salida(rs.getString("Fecha_salida"));
                cr.setFecha_retorno(rs.getString("Fecha_retorno"));
                cr.setEstacion_inicio(rs.getString("estacion_inicio"));
                cr.setEstacion_fin(rs.getString("estacion_fin"));
                lista.add(cr);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Cronograma findById(int id) {
        String sql = "select * from Cronograma where idCronograma=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cr.setIdCronograma(rs.getInt("idCronograma"));
                cr.setIdTerminal(rs.getString("idTerminal"));
                cr.setIdTarifa(rs.getDouble("idTarifa"));
                cr.setHora_partida(rs.getString("hora_partida"));
                cr.setHora_llegada(rs.getString("hora_llegada"));
                cr.setFecha_salida(rs.getString("Fecha_salida"));
                cr.setFecha_retorno(rs.getString("Fecha_retorno"));
                cr.setEstacion_inicio(rs.getString("estacion_inicio"));
                cr.setEstacion_fin(rs.getString("estacion_fin"));
            }
        } catch (Exception e) {
        }
        return cr;
    }

    @Override
    public boolean create(Cronograma cr) {
        String sql = "insert into Cronograma values('" + cr.getIdCronograma()+ "','" + cr.getIdTerminal()+ "','" + cr.getIdTarifa()+ "','" + cr.getHora_partida()+ "','"+ cr.getHora_llegada()+ "',"
                + "'"+cr.getFecha_salida()+"','"+cr.getFecha_retorno()+"','"+cr.getEstacion_inicio()+"','"+cr.getEstacion_fin()+"')";
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
    public boolean edit(Cronograma cr) {
        String sql = "update Cronograma set idTerminal='" + cr.getIdTerminal() + "',idTarifa='" + cr.getIdTarifa()+ "',hora_partida='" + cr.getHora_partida()+ "',hora_llegada='"
                + cr.getHora_llegada()+ "',Fecha_salida='" + cr.getFecha_salida()+ "',Fecha_retorno='" + cr.getFecha_retorno()+ "',estacion_inicio='" + cr.getEstacion_inicio()+ "',estacion_fin='" + cr.getEstacion_fin()+ "' where idCronograma=" + cr.getIdCronograma();
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
        String sql = "delete from Cronograma where idCronograma=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
