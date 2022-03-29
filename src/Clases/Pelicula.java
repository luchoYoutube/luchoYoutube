package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;


public class Pelicula {
    
    //Atributos miembros
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    private Calendar fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    
    //Atributos referenciales
    private Genero genero; 
    private Calificacion calificacion;
    private PaisDeOrigen paisDeOrigen;
    private List<Personaje> personajes;
    private List<Funcion> funciones;
    

    /**
     * Constructor por Defecto
     */
    public Pelicula() {
        personajes = new ArrayList<>();
        funciones = new ArrayList<>();
    }
        
    /**
     * Este constructor no incluye los atributos referenciales de la clase Pelicula
     * 
     * @param anioEstreno
     * @param disponible
     * @param duracion
     * @param nombre
     * @param tituloOriginal 
     */
    public Pelicula(int anioEstreno, boolean disponible, int duracion, String nombre, String tituloOriginal) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;        
        this.fechaIngreso = Calendar.getInstance();
        this.personajes = new ArrayList<>();
        this.funciones = new ArrayList<>();
        
    }
    
    /**
     * Este constructor incluye todos los atributos de la clase Pelicula
     * 
     * @param anioEstreno
     * @param disponible
     * @param duracion
     * @param nombre
     * @param tituloOriginal
     * @param paisDeOrigen
     * @param personajes
     * @param funciones
     * @param genero
     * @param calificacion 
     * @param fechaIngreso 
     */
    public Pelicula(int anioEstreno, boolean disponible, int duracion, String nombre, String tituloOriginal, PaisDeOrigen paisDeOrigen, List<Personaje> personajes, List<Funcion> funciones, Genero genero, Calificacion calificacion, Calendar fechaIngreso) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.paisDeOrigen = paisDeOrigen;
        this.personajes = personajes;
        this.funciones = funciones;
        this.genero = genero;
        this.calificacion = calificacion;
        this.fechaIngreso = fechaIngreso; 
    }
    
    public boolean estaDisponible() {
        return this.disponible;
    }
    
    /**
     * Consultamos si esta Pelicula se encuentra vigente en Cartelera
     * 
     * @param programacion
     * @return verdadero si está en cartelera
     */
    public boolean estaEnCartelera(Programacion programacion) {
        Iterator<Funcion> iter = programacion.getFunciones().iterator();
        while(iter.hasNext()){
            if(this.nombre.equals(iter.next().getPelicula().getNombre())){
                return true;
            }
        }
       return false;  
    }
    
    /**
     * Consultamos las Funciones habilitadas y las devolvemos en formato
     * de cadena de texto. Asumo que en la lista de funciones hay solo funciones
     * habiliatas, de lo contrario deberiamos agregarle un atributo 
     * private boolean habilitada en la clase Funcion
     * 
     * @return 
     */
    public String mostrarFuncionesHabilitadas() {
        String funcionesHabilitadas = "";
            Iterator<Funcion> iter = this.funciones.iterator();
            while(iter.hasNext()){
                Funcion f = iter.next();
                funcionesHabilitadas += f.toString();
            }
        return funcionesHabilitadas;
    }
    
    /**
     * Calculamos la duracion total de la Pelicula cuando se asigna a una 
     * Funcion determinada para un Cine contando duración de la publicidad
     * y el intervalo entre Funciones
     * 
     * @param horarioFuncion
     * @return 
     */
    public int calcularDuracionEnFuncion (HorarioFuncion horarioFuncion) {
        return this.duracion + horarioFuncion.getDuracionPublicidad() + 
                horarioFuncion.getDuracionIntervalo();
    }
    
    
    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public PaisDeOrigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return nombre; 
    }
    
}