package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class Programacion {
    
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private Calendar fechaHoraCreada;
    private List<Funcion> funciones;
    private List<Cine> cines;
    

    /**
     * Constructor por Defecto
     */
    public Programacion() {
        funciones = new ArrayList<>();
    }

    /**
     * Este constructor todos los atributos de la clase Programacion
     * 
     * @param fechaInicio
     * @param fechaFin
     * @param fechaHoraCreada
     * @param funciones 
     */
    public Programacion(Calendar fechaInicio, Calendar fechaFin, Calendar fechaHoraCreada, List<Funcion> funciones) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.funciones = funciones;
        this.funciones = new ArrayList<>();
    }
      
    /**
     * 
     * @return true sii la programacion semanal esta llena.
     * la programación solo puede tener 3 funciones por cada día de la semana.
     */
    public boolean estaLlena(){
        return this.funciones.size() == 21;
    }

    /**
     * Comprobamos si todos los días de esta programación tienen al menos una
     * Función asignada.
     * Osea si el lunes , martes miercoles jueves viernes sabado domingo tienen
     * al menos una programacion asiganada, recorrer todas y ver si 
     * @return 
     */
    public boolean estaCompleta () {
        int count = 0;
        boolean ln =false, mt = false, mr = false, jv = false, vs = false, sb = false, dm = false;
        Iterator<Funcion> iter = this.funciones.iterator();
        while(iter.hasNext()){
            Funcion f = iter.next();
            if(f.getDiaSemana() == 1 && !dm){
                count++;
                dm = true;
            }else{
                if(f.getDiaSemana() == 2 && !ln){
                    ln = true;
                    count++;
                }else{
                    if(f.getDiaSemana() == 3 && !mt){
                        mt = true;
                        count++;
                    }else{
                        if(f.getDiaSemana() == 4 && !mr){
                            mr = true;
                            count++;
                        }else{
                            if(f.getDiaSemana() == 5 && !jv){
                                jv = true;
                                count++;
                            }else{
                                if(f.getDiaSemana() == 6 && !vs){
                                    vs = true;
                                    count++;
                                }else{
                                    if(f.getDiaSemana() == 6 && !sb){
                                        sb = true;
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 7 == count;
    }
    
    /**
     * Consultamos si la Programacion está vigente cuando
     * 
     * @return 
     
    public boolean estaVigente () {
        return estaVigente(Calendar.getInstance().getTime());
    }
    
    /**
     * Comprobamos si la fecha actual se encuentra dentro del periodo de 
     * vigencia de esta Programacion (fecha de inicio y fin), consideramos
     * también que la fecha de inicio y fin también están en el periodo de 
     * vigencia de la Programación
     */
    public boolean estaVigente () {
        Calendar cal = Calendar.getInstance();
        return this.fechaInicio.before(cal.getTime()) && this.fechaFin.after(cal.getTime());
    }

    
    /**
     * 
     * @param funcion
     * @return 
     */
    public boolean estaIniciadaFuncion(Funcion funcion){
        Calendar cal = Calendar.getInstance();
        return funcion.getHoraInicio().before(cal.getTime());
    }
    
    /**
     * 
     * @return 
     */
    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * 
     * @param fechaInicio 
     */
    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * 
     * @return 
     */
    public Calendar getFechaFin() {
        return fechaFin;
    }

    /**
     * 
     * @param fechaFin 
     */
    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * 
     * @return 
     */
    public Calendar getFechaHoraCreada() {
        return fechaHoraCreada;
    }

    /**
     * 
     * @param fechaHoraCreada 
     */
    public void setFechaHoraCreada(Calendar fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    /**
     * 
     * @return 
     */
    public List<Funcion> getFunciones() {
        return funciones;
    }

    /**
     * 
     * @param funciones 
     */
    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
    
    /**
     * 
     * @return 
     */
    public List<Cine> getCines(){
        return this.cines;
    }
    
    
    public void setCines(List<Cine> cines){
        this.cines = cines;
    }
    
   /**
     * Recorremos las Funciones y armamos una cadena de texto con la 
     * representación de cada una de ellas.
     * 
     * @return cadena de texto con las funciones
     */
    public String mostrarProgramacion() {
        String programacion = "";
        Iterator<Funcion> iter = this.funciones.iterator();
        while(iter.hasNext()){
            Funcion f = iter.next();
            programacion += f.toString()+" ";
        }
        return programacion;
    }

    @Override
    public String toString() {
        return "Programacion{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", fechaHoraCreada=" + fechaHoraCreada + ", funciones=" + funciones + '}';
    }
    
}
