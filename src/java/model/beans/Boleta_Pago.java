package model.beans;
public class Boleta_Pago {
    
    private int idBoletaPago,id_medio_pago,idVenta;

    public Boleta_Pago() {
    }

    public Boleta_Pago(int idBoletaPago, int id_medio_pago, int idVenta) {
        this.idBoletaPago = idBoletaPago;
        this.id_medio_pago = id_medio_pago;
        this.idVenta = idVenta;
    }

    public int getIdBoletaPago() {
        return idBoletaPago;
    }

    public void setIdBoletaPago(int idBoletaPago) {
        this.idBoletaPago = idBoletaPago;
    }

    public int getId_medio_pago() {
        return id_medio_pago;
    }

    public void setId_medio_pago(int id_medio_pago) {
        this.id_medio_pago = id_medio_pago;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
    
}
