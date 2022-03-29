package Clases;


public class Actor {
    
    private boolean animado; 
    private String apellido;
    private String nombre;
    private Sexo sexo;

    /**
     * 
     *   @author Lucho
Actor(): Constructor por Defecto de la clase actor
     */
    public Actor(){
    }
    
    /**
     * Este constructor incluye todos los atributos de la clase Personaje
     * 
     * @param animado
     * @param apellido
     * @param nombre
     * @param sexo 
     */
    public Actor(boolean animado, String apellido, String nombre, Sexo sexo){
        this.animado = animado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    //A continuación se listan todos los métodos de seteo de cada atributo de la clase.
    public boolean isAnimado(){
        return animado;
    }

    /**
     * 
     * @param animado 
     */
    public void setAnimado(boolean animado){
        this.animado = animado;
    }

    /**
     * 
     * @return el apellido del actor
     */
    public String getApellido(){
        return apellido;
    }

    /**
     * 
     * @param apellido 
     */
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    /**
     * 
     * @return El nombre del actor
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
    public Sexo getSexo(){
        return sexo;
    }

    /**
     * 
     * @param sexo 
     */
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.apellido).append("\n").append(this.nombre);
        return sb.toString();
    }
    
}
