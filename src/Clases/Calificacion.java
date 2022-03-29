package Clases;

public class Calificacion{
    
    private String nombre; //Atributo utilizado para 
    
    /**
     * Calificacion(): Constructor por Defecto de la clase Calificacion
     */
    public Calificacion(){
    }

    /**
     * Este constructor incluye todos atributos de la clase Calificacion
     * 
     * @param nombre 
     */
    public Calificacion(String nombre){
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return this.nombre;
    }
    
}