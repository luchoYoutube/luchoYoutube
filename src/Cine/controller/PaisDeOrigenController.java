package Cine.controller;

import java.util.ArrayList;
import java.util.List;
import Clases.PaisDeOrigen;

/**
 *
 * @author @author Lucho

 */
public class PaisDeOrigenController {
    
    private List<PaisDeOrigen> paisesDeOrigen;
    
    /**
     * PaisDeOrigenController(): constructor por defecto de la clase
     */
    public PaisDeOrigenController(){
        this.paisesDeOrigen = new ArrayList<>();
        this.paisesDeOrigen.add(new PaisDeOrigen("Argentina","Castellano"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Inglaterra","Ingles"));
        this.paisesDeOrigen.add(new PaisDeOrigen("China","Chino Mandarin"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Estados","Unidos"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Francia","Frances"));
        this.paisesDeOrigen.add(new PaisDeOrigen("España","Español"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Alemania","Aleman"));
    }
    
    /**
     * 
     * @return 
     */
    public List<PaisDeOrigen> mostrarPaisDeOrigen(){
        return this.paisesDeOrigen;
    }
}
