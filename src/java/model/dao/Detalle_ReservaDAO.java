package model.dao;

import java.util.List;
import interfaces.Detalle_ReservaCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.beans.Detalle_Reserva;
import util.conexion;

public class Detalle_ReservaDAO implements Detalle_ReservaCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Detalle_Reserva dr = new Detalle_Reserva();
    
    @Override
    public List findAll() {
        ArrayList<Detalle_Reserva> lista = new ArrayList<>();

        try {

            String sql = "Select * from Detalle_reserva";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Detalle_Reserva dr = new Detalle_Reserva();
                dr.setIdDetalleReserva(rs.getInt("idDetalleReserva"));
                dr.setIdPasaje(rs.getInt("idPasaje"));
                dr.setIdReserva(rs.getInt("idReserva"));
                dr.setDuracion(rs.getDate("Duracion"));
                lista.add(dr);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Detalle_Reserva findById(int id) {
        String sql = "select * from Detalle_reserva where idDetalleReserva=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                dr.setIdDetalleReserva(rs.getInt("idDetalleReserva"));
                dr.setIdPasaje(rs.getInt("idPasaje"));
                dr.setIdReserva(rs.getInt("idReserva"));
                dr.setDuracion(rs.getDate("Duracion"));
            }
        } catch (Exception e) {
        }
        return dr;
    }

    @Override
    public boolean create(Detalle_Reserva dr) {
        String sql = "insert into Detalle_reserva values('" + dr.getIdDetalleReserva()+ "','" + dr.getIdPasaje()+ "','" + dr.getIdReserva()+ "','"
                + dr.getDuracion()+ "')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Detalle_Reserva dr) {
        String sql = "update Detalle_reserva set idPasaje='" + dr.getIdPasaje()+ "',idReserva='" + dr.getIdReserva()+ "',Duracion='" + dr.getDuracion() +"' where idDetalleReserva=" + dr.getIdDetalleReserva();
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
        String sql = "delete from Detalle_reserva where idDetalleReserva=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
