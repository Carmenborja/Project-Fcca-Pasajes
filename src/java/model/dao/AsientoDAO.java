/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import interfaces.AsientoCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.Asiento;
import util.conexion;

public class AsientoDAO implements AsientoCRUD {
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Asiento asi = new Asiento();

    @Override
    public List findAll() {
        ArrayList<Asiento> lista = new ArrayList<>();
        
        try {
            
            String sql = "select a.idAsiento,t.idTren,c.Nombres,a.n_asiento,a.Descripcion_Asiento from tren as t inner join asiento as a on a.idTren = t.idTren inner join cliente as c\n" +
"on c.idCliente = a.idCliente";
            con = cn.conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Asiento asi = new Asiento();
                asi.setIdAsiento(rs.getInt("idAsiento"));
                asi.setIdTren(rs.getInt("idTren"));
                asi.setNombre(rs.getString("Nombres"));
                asi.setN_asiento(rs.getString("n_asiento"));
                asi.setDescripcion_Asiento(rs.getString("Descripcion_Asiento"));
                lista.add(asi);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista;
    }

    @Override
    public Asiento findById(int id) {
        String sql="select * from Asiento where idAsiento="+id;
        try{
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                asi.setIdAsiento(rs.getInt("idAsiento"));
                asi.setIdTren(rs.getInt("idTren"));
                asi.setIdCliente(rs.getInt("idCliente"));
                asi.setN_asiento(rs.getString("n_asiento"));
                asi.setDescripcion_Asiento(rs.getString("Descripcion_Asiento"));
            }           
        }catch (Exception e){       
        }
        return asi;
    }

    @Override
    public boolean create(Asiento asi) {
       String sql="insert into Asiento values('"+asi.getIdAsiento()+"','"+asi.getIdTren()+"','"+asi.getIdCliente()+"','"+asi.getN_asiento()+"','"
                +asi.getDescripcion_Asiento()+"')";
            try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            }catch(Exception e){  
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return false;
    }

    @Override
    public boolean edit(Asiento asi) {
        String sql="update Asiento set idTren='"+asi.getIdTren()+"',idCliente='"+asi.getIdCliente()+"',n_asiento='"+asi.getN_asiento()+"',Descripcion_Asiento='"+asi.getDescripcion_Asiento()+"' where idCliente="+asi.getIdAsiento();
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from Asiento where idAsiento="+id;
        try {
            con=cn.conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    
}
