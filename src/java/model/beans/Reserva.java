package model.beans;

import java.util.Date;

public class Reserva {
    
    private int idReserva,idTrabajador,idCliente;
    private Date Fecha;
    private String Descripcion;

    public Reserva() {
    }

    public Reserva(int idReserva, int idTrabajador, int idCliente, Date Fecha, String Descripcion) {
        this.idReserva = idReserva;
        this.idTrabajador = idTrabajador;
        this.idCliente = idCliente;
        this.Fecha = Fecha;
        this.Descripcion = Descripcion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
