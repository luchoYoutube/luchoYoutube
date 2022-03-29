package Clases;

import java.util.Calendar;

/**
 * 
 * @author @author Lucho

 */
public class Entrada {

    private Calendar fechaHoraFuncion;
    private Calendar fechaHoraVenta;
    private Funcion funcion;
    private float precioCobrado;
    private int ticketNro; // Singleton posible

    /**
     * Constructor por Defecto
     */
    public Entrada() {
    }

    /**
     * Este constructor incluye todos los atributos de la clase Entrada
     * 
     * @param fechaHoraFuncion
     * @param fechaHoraVenta
     * @param funcion
     * @param precioCobrado
     * @param ticketNro 
     */
    public Entrada(Calendar fechaHoraFuncion, Calendar fechaHoraVenta, Funcion funcion, float precioCobrado, int ticketNro) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.funcion = funcion;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
    }
    
    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase

    public Calendar getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(Calendar fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public Calendar getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Calendar fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public float getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(float precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }
 
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(this.ticketNro).append("\n");
        sb.append(this.funcion.getPelicula().getNombre());
        sb.append("Sala: ").append(this.funcion.getSala().getNumero());
        sb.append(this.fechaHoraFuncion.toString());
        return sb.toString();
    }
    
}
