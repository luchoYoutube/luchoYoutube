/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.controller;

import java.util.ArrayList;
import java.util.List;
import Clases.Calificacion;

/**
 *
 * @author Lucho
 */
public class CalificacionController {
    
    private List<Calificacion> calificaciones;
    
    public CalificacionController(){
        this.calificaciones = new ArrayList<>();
        this.calificaciones.add(new Calificacion("ATP"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 18 años"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 16 años"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 13 años"));
    }

    public List<Calificacion> mostrarCalificaciones(){
        return this.calificaciones;
    }
    
}
