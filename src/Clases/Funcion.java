package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Funcion {

    //Atributos miembros
    private int diaSemana; //Los dias de la semana van de 1 a 7, domingo(1) a sabado(7)
    private int duracion;
    private Calendar horaInicio;
    private int numero;
    
    //Atributos referenciales
    private Pelicula pelicula;
    private Sala sala;
    private List<Entrada> entradas;

    /**
     * Constructor por Defecto
     */
    public Funcion() {
        entradas = new ArrayList<>();
    }
    
    /**
     * Este constructor no incluye los atributos referenciales de la clase Funcion.
     * @param diaSemana
     * @param horarioFuncion
     * @param horaInicio
     * @param numero
     * @param pelicula
     * @param sala 
     */
    public Funcion(int diaSemana, HorarioFuncion horarioFuncion, Calendar horaInicio, int numero, Pelicula pelicula, Sala sala) {
        this.diaSemana = diaSemana;
        this.duracion = this.pelicula.getDuracion() + horarioFuncion.getDuracionIntervalo()+horarioFuncion.getDuracionPublicidad();
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.pelicula = pelicula;
        this.sala = sala;
        entradas = new ArrayList<>();
    }
    
    
    /**
     * Este se usaria en el caso que tengamos una listas de reservas previas a la creacion de la funcion.
     * @param diaSemana
     * @param horarioFuncion
     * @param horaInicio
     * @param numero
     * @param pelicula
     * @param sala
     * @param entradas 
     */
    public Funcion(int diaSemana, HorarioFuncion horarioFuncion, Calendar horaInicio, int numero, Pelicula pelicula, Sala sala, List<Entrada> entradas) {
        this.diaSemana = diaSemana;
        this.duracion = this.pelicula.getDuracion() + horarioFuncion.getDuracionIntervalo()+horarioFuncion.getDuracionPublicidad();
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.pelicula = pelicula;
        this.sala = sala;
        this.entradas = entradas;
    }
    
    
    /**
     * Calculamos la cantidad de butacas disponibles en base a la cantidad
     * total de la sala y las entradas vendidas para esta Función
     * 
     * @return cantidad de butacas disponibles
     */
    public int calcularDisponibilidad() {
        return sala.getCapacidad() - entradas.size();
    }
    
    /**
     * Obtenemos la capacidad de la Sala en cantidad de butacas
     * 
     * @return cantidad total de butacas de la Sala
     */
    public int capacidadSala() {
        return sala.getCapacidad();
    }
    
    /**
     * 
     * @return retorna true sii
     */
    public boolean estaEnCurso() {
        Calendar cal = Calendar.getInstance();
        Calendar horaFinal = this.horaInicio;
        horaFinal.add(Calendar.MINUTE, duracion);
        return (this.horaInicio.before(cal.getTime()) && horaFinal.after(cal.getTime()));
    }
    
    /**
     * Consultamos si queda al menos una Entrada disponible para esta función
     * 
     * @return 
     */
    public boolean hayLugar() {
        return (this.sala.getCapacidad() - this.entradas.size() > 0);
    }
    
    /**
     * Devolvemos una representación en texto del día y hora de esta función
     * 
     * @return 
     */
    public String mostrarDiaHora() {
        String diaHora;
        switch(diaSemana){
            case 1: diaHora = "Domingo "+ horaInicio.getTime();
                    break;
            case 2: diaHora = "Lunes "+ horaInicio.getTime();
                    break;
            case 3: diaHora = "Martes "+ horaInicio.getTime();
                    break;
            case 4: diaHora = "Miércoles "+ horaInicio.getTime();
                    break;
            case 5: diaHora = "Jueves "+ horaInicio.getTime();
                    break;
            case 6: diaHora = "Viernes "+ horaInicio.getTime();
                    break;
            case 7: diaHora = "Sábado "+horaInicio.getTime();
                    break;
            default: diaHora = "";  
        }
        return diaHora;
    }

    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase
    
    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }
    
    

    public int getDuracion() {
        return duracion;
    }

    /**
     * 
     * @param horarioFuncion 
     */
    public void setDuracion(HorarioFuncion horarioFuncion) {
        this.duracion = this.pelicula.getDuracion() + horarioFuncion.getDuracionIntervalo()+horarioFuncion.getDuracionPublicidad();
    }

    /**
     * 
     * @return 
     */
    public Calendar getHoraInicio() {
        return horaInicio;
    }

    /**
     * 
     * @param horaInicio 
     */
    public void setHoraInicio(Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * 
     * @return 
     */
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
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * 
     * @param pelicula 
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * 
     * @return 
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * 
     * @param sala 
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    /**
     * 
     * @return 
     */
    public List<Entrada> getEntradas() {
        return entradas;
    }

    /**
     * 
     * @param entradas 
     */
    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }
    /**
     * Recorremos las Funciones y armamos una cadena de texto con la 
     * representación de cada una de ellas.
     * 
     * @return cadena de texto con las funciones
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos de la función: ").append(this.pelicula.getNombre()).append(this.sala.getNumero()).append(mostrarDiaHora());
        //return "Datos de la función: " + this.pelicula.getNombre()+" Sala "+ this.sala.getNumero()+" "+ mostrarDiaHora();
        return sb.toString();
    }
      
}