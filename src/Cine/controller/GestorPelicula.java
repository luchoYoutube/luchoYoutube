package Cine.controller;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import Clases.Actor;
import Clases.Calificacion;
import Clases.Cine;
import Clases.Genero;
import Clases.PaisDeOrigen;
import Clases.Pelicula;
import Clases.Personaje;
import Clases.Rol;
import Clases.Sexo;
import Vista.PantallaAdministracionPelicula;


/**
 * 
 * @author Lucho
 */
public class GestorPelicula {
    
    private final Cine cine;

    private final PeliculaController peliculaController;
    private final GeneroController generoController;
    private final CalificacionController calificacionController;
    private final PaisDeOrigenController paisDeOrigenController;

    public GestorPelicula() {
        Calendar ahora = Calendar.getInstance();
        cine = new Cine("San Martin 155, Rio Cuarto", ahora, "Gran Cine", new Float(57));
        this.peliculaController = new PeliculaController();
        this.generoController = new GeneroController();
        this.paisDeOrigenController = new PaisDeOrigenController();
        this.calificacionController = new CalificacionController();
    }
    
    public void run () {
        // obtenemos los objetos para completar las listas de seleccion
        List<Genero> generos =  this.generoController.mostrarGeneros();
        List<Calificacion> calificaciones = this.calificacionController.mostrarCalificaciones();
        List<PaisDeOrigen> paises = this.paisDeOrigenController.mostrarPaisDeOrigen();
        
        // creamos una instancia del formulario y lo mostramos
        PantallaAdministracionPelicula panel = new PantallaAdministracionPelicula(generos, calificaciones, paises, this);
        panel.setVisible(true);
        
    }
    
    public List<Personaje> obtenerElenco () {
        // mockup del resultado de la llamada al caso de uso "Registrar Elenco"
        
        Sexo masculino = new Sexo("Masculino");
        Actor guillermo = new Actor(false, "Guillermo", "Francella", masculino);
        Rol protagonista = new Rol("Protagonista");
        Personaje personaje1 = new Personaje("Ninja Purpura", guillermo, protagonista);
        
        Sexo femenino = new Sexo("Femenino");
        Actor china = new Actor(false, "China", "Suarez", femenino);
        Rol secundario = new Rol("Secundario");
        Personaje personaje2 = new Personaje("Ninja Rosa", china, secundario);
        
        
        List<Personaje> personajes = new ArrayList<>();                
        personajes.add(personaje1);
        personajes.add(personaje2);
        
        return personajes;
    }

    /**
     * 
     * @param nombre
     * @return 
     */
    public boolean buscarPelicula(String nombre) {
        return this.peliculaController.buscarPelicula(nombre);
    }
    
    /**
     * 
     * @param pelicula 
     */
    public void guardarPelicula (Pelicula pelicula) {
        this.peliculaController.guardarPelicula(pelicula);
    }
}
