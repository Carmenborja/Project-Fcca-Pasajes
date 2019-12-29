package model.dao;

import java.util.List;
import interfaces.ReservaCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.beans.Reserva;
import util.conexion;

public class ReservaDAO implements ReservaCRUD {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Reserva res = new Reserva();

    @Override
    public List findAll() {
        ArrayList<Reserva> lista = new ArrayList<>();

        try {

            String sql = "Select * from Reserva";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Reserva res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setIdTrabajador(rs.getInt("idTrabajador"));
                res.setIdCliente(rs.getInt("idCliente"));
                res.setFecha(rs.getDate("Fecha"));
                res.setDescripcion(rs.getString("Descripcion"));
                lista.add(res);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Reserva findById(int id) {
        String sql = "select * from Reserva where idReserva=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                res.setIdReserva(rs.getInt("idReserva"));
                res.setIdTrabajador(rs.getInt("idTrabajador"));
                res.setIdCliente(rs.getInt("idCliente"));
                res.setFecha(rs.getDate("Fecha"));
                res.setDescripcion(rs.getString("Descripcion"));
            }
        } catch (Exception e) {
        }
        return res;
    }

    @Override
    public boolean create(Reserva res) {
        String sql = "insert into Reserva values('" + res.getIdTrabajador()+ "','" + res.getIdCliente()+ "','" + res.getFecha()+ "','"
                + res.getDescripcion()+"')";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Reserva res) {
        String sql = "update Reserva set idTrabajador='" + res.getIdTrabajador()+ "',idCliente='" + res.getIdCliente()+ "',Fecha='" + res.getFecha()+"' where idReserva=" + res.getIdReserva();
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
        String sql = "delete from Reserva where idReserva=" + id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
