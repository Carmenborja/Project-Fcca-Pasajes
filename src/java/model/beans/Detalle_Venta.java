package model.beans;import java.io.Serializable;

public class Detalle_Venta implements Serializable{
    
    private int idDetalleVenta,idPasaje,idVenta,Cantidad_venta;
 
    public Detalle_Venta(){
    
    }
    
    public Detalle_Venta(int idDetalleVenta, int idPasaje, int idVenta, int Cantidad_venta) {
        this.idDetalleVenta = idDetalleVenta;
        this.idPasaje = idPasaje;
        this.idVenta = idVenta;
        this.Cantidad_venta = Cantidad_venta;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
    public int getCantidad_venta() {
        return Cantidad_venta;
    }

    public void setCantidad_venta(int idCantidad_venta) {
        this.Cantidad_venta = Cantidad_venta;
    }
    
    
       
}
