
package Cine.controller;

import java.util.ArrayList;
import java.util.List;
import Clases.Genero;

/**
 *
  * @author @author Lucho

 */
public class GeneroController {
    
    private List<Genero> generos;
    
    public GeneroController(){
        this.generos = new ArrayList<>();
        this.generos.add(new Genero("Drama"));
        this.generos.add(new Genero("Comedia"));
        this.generos.add(new Genero("Accion"));
        this.generos.add(new Genero("Suspenso"));
        this.generos.add(new Genero("Triler"));
        this.generos.add(new Genero("Terror"));
    }
    
    public List<Genero> mostrarGeneros(){
        return this.generos;
    }
    
}
