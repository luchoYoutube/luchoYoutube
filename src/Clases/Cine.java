package Clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class Cine {
    
    //Atributos miembros de la clase Cine
    private float precioEntrada;
    private String direccion;
    private Calendar fechaInauguracion;
    private String nombre;
    
    //Atributos referenciales de la clase Cine
    private List<Sala> salas;
    private List<HorarioFuncion> horariosFunciones;
    private Programacion programaciones;

    
    /**
     * Constructor por Defecto
     */
    public Cine(){
        salas = new ArrayList<>();
        horariosFunciones = new ArrayList<>();
    }

    /**
     * Este constructor incluye todos los atributos de la clase Cine
     * 
     * @param direccion
     * @param fechaInauguracion
     * @param nombre
     * @param sala
     * @param horariosFunciones
     * @param programaciones
     */
    public Cine(String direccion, Calendar fechaInauguracion, String nombre, List<Sala> sala, List<HorarioFuncion> horariosFunciones, Programacion programaciones) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.salas = sala;
        this.horariosFunciones = horariosFunciones;
        this.programaciones = programaciones;
    }
    
    /**
     * Este constructor no incluye los atributos referenciales de la clase Cine
     * 
     * @param direccion
     * @param fechaInauguracion
     * @param nombre 
     * @param precioEntrada 
     */
    public Cine(String direccion, Calendar fechaInauguracion, String nombre, Float precioEntrada) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        this.programaciones = null;
        
        // inicializamos las colecciones vacias
        this.salas = new ArrayList<>();
        this.horariosFunciones = new ArrayList<>();

    }
    
    /**
     * 
     * @return 
     */
    public String getDireccion(){
        return direccion;
    }

    /**
     * 
     * @param direccion 
     */
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    /**
     * 
     * @return 
     */
    public Calendar getFechaInauguracion(){
        return fechaInauguracion;
    }

    /**
     * 
     * @param fechaInauguracion 
     */
    public void setFechaInauguracion(Calendar fechaInauguracion){
        this.fechaInauguracion = fechaInauguracion;
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
    public List<Sala> getSalas() {
        return salas;
    }

    /**
     * 
     * @param salas 
     */
    public void setSalas(List<Sala> salas){
        this.salas = salas;
    }

    /**
     * 
     * @return 
     */
    public List<HorarioFuncion> getHorariosFunciones(){
        return horariosFunciones;
    }

    /**
     * 
     * @param horariosFunciones 
     */
    public void setHorariosFunciones(List<HorarioFuncion> horariosFunciones){
        this.horariosFunciones = horariosFunciones;
    }

    /**
     * 
     * @return 
     */
    public Programacion getProgramaciones(){
        return programaciones;
    }

    /**
     * 
     * @param programaciones 
     */
    public void setProgramaciones(Programacion programaciones){
        this.programaciones = programaciones;
    }

    /**
     * 
     * @return 
     */
    public Float getPrecioEntrada() {
        return precioEntrada;
    }

    /**
     * 
     * @param precioEntrada 
     */
    public void setPrecioEntrada(Float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
    /**
     * Obtenemos la Programacion vigente para este Cine
     * 
     * @return 
     
    public Programacion obtenerProgramacionVigente () {
        Programacion vigente = null;
        
        Iterator Programacion iter = programaciones.iterator();
        while (iter.hasNext()) {
            Programacion p = iter.next();
            
            // si esta vigente la devolvemos
            if (p.estaVigente()) {
                vigente = p;
                break;
            }
        }
        
        return vigente;
    }*/
 
    
    
    public String mostrarInfoHorariosFuncion(){
        StringBuilder sb = new StringBuilder();
        
        Iterator<HorarioFuncion> iter = this.horariosFunciones.iterator();
        while(iter.hasNext()){
            sb.append(iter.next().toString()).append("\n");
        }
        return sb.toString();
    }
    /**
     * Devolvemos una represetación textual de Cine
     * 
     * @return 
     */
    @Override
    public String toString () {
        // creamos una instancia del formateador de fechas
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Cine: ").append(nombre).append(" - Dirección: ").append(direccion).append("\n");
        sb.append("Fecha Inauguración: ").append(sdf.format(fechaInauguracion)).append(" - Precio de la Entrada: $").append(precioEntrada).append("\n");
        sb.append("Salas: \n");
        
        // iteramos sobre las salas del cine
        Iterator<Sala> salasIt = salas.iterator();
        while (salasIt.hasNext()) {
            // llama automaticamenticamente al método toString() de la Sala
            sb.append(salasIt.next().toString()).append("\n"); 
        }
        
        // iteramos sobre los horarios posibles de las funciones
        Iterator<HorarioFuncion> horariosIt = horariosFunciones.iterator();
        while (horariosIt.hasNext()) {
            // llama automaticamenticamente al método toString() de HorarioFuncion
            sb.append(horariosIt.next().toString()).append("\n");
        }
        
        // agregamos las programacion vigente de este Cine
        //sb.append("Programación vigente: \n").append(obtenerProgramacionVigente().toString());
        
        // devolvemos toda la cadena de texto resultante
        return sb.toString();
    }
}
