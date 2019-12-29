package model.beans;

import java.io.Serializable;
import java.util.Date;

public class Detalle_Reserva implements Serializable{

    private int idDetalleReserva;
    private int idPasaje;
    private int idReserva;
    private Date Duracion;
    
    public Detalle_Reserva(){
    
    }

    public Detalle_Reserva(int idDetalleReserva, int idPasaje, int idReserva, Date Duracion) {
        this.idDetalleReserva = idDetalleReserva;
        this.idPasaje = idPasaje;
        this.idReserva = idReserva;
        this.Duracion = Duracion;
    }

    public int getIdDetalleReserva() {
        return idDetalleReserva;
    }

    public void setIdDetalleReserva(int idDetalleReserva) {
        this.idDetalleReserva = idDetalleReserva;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getDuracion() {
        return Duracion;
    }

    public void setDuracion(Date Duracion) {
        this.Duracion = Duracion;
    }
    
    
    
    
    

    
}
