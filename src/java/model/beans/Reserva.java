package model.beans;



public class Reserva {
    
    private int idReserva,idTrabajador,idCliente;
    private String Fecha;
    private String Descripcion,nom_trab,nom_cli;

    public String getNom_trab() {
        return nom_trab;
    }

    public void setNom_trab(String nom_trab) {
        this.nom_trab = nom_trab;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public Reserva() {
    }

    public Reserva(int idReserva, int idTrabajador, int idCliente, String Fecha, String Descripcion) {
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

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
