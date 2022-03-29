package Clases;

/**
 * 
  *  @author Lucho

 */
public class Sala {
    
    private int capacidad;
    private int numero;

    /**
     * Sala(): Constructor por defecto de la clase sala.
     */
    public Sala() {
    }
    
    /**
     * Este constructor incluye todos los atributos de la clase Sala
     * 
     * @param capacidad
     * @param numero 
     */
    public Sala(int capacidad, int numero) {
        this.capacidad = capacidad;
        this.numero = numero;
    }

    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase
    
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * 
     * @param capacidad 
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }
    /**
     * 
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }     

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Sala " + numero + " (" + capacidad + " butacas)";
    }    
}
