
package Clases;

/**
 * 
 *  @author Lucho

 */
public class Sexo {
    
    private String nombre; //Atributo utilizado para almacenar 

    /**
     * Sexo():Constructor por defecto de la clase Sexo
     */
    public Sexo() {
    }

    /**
     * 
     * @param nombre 
     */
    public Sexo(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
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
    public String toString(){
        return this.nombre;
    }
    
}
