package Clases;

public class Genero {
    
   
    private String nombre;

    /**
     * Constructor por Defecto
     */
    public Genero() {
    }

    /**
     * Este constructor incluye todos atributos de la clase Genero
     * 
     * @param nombre 
     */
    public Genero(String nombre) {
        this.nombre = nombre;
    }

    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase

    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
