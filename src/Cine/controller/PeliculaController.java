package Cine.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Clases.Pelicula;

/**
 *
 * @author Lucho

 */
public class PeliculaController {
    
    private final List<Pelicula> peliculas; //En esta lista vamos a guardar todas las peliculas.
    
    public PeliculaController(){
        this.peliculas = new ArrayList<>();
    }
    
    public void guardarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }
    
    public Boolean buscarPelicula(String nombre){
        Iterator<Pelicula> iter = this.peliculas.iterator();
        while(iter.hasNext()){
            Pelicula p = iter.next();
            if(p.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }
    
    
}
