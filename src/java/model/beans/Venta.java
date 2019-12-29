package model.beans;

import java.util.Date;

public class Venta {
 
    private int idVenta,idTarifa,idCliente,idEmpleado;
    private String Fecha_venta;

    public Venta() {
    }

    public Venta(int idVenta, int idTarifa, int idCliente, int idEmpleado, String Fecha_venta) {
        this.idVenta = idVenta;
        this.idTarifa = idTarifa;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.Fecha_venta = Fecha_venta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFecha_venta() {
        return Fecha_venta;
    }

    public void setFecha_venta(String Fecha_venta) {
        this.Fecha_venta = Fecha_venta;
    }
    
    
}
