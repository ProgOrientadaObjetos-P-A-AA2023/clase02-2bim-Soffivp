/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Reporte {

    protected String nombre;
    protected String apellido;
    protected String carrera;
    protected String ciclo;

    public Reporte(String n, String p, String c, String cic) {
        nombre = n;
        apellido = p;
        carrera = c;
        ciclo = cic;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String p) {
        apellido = p;
    }

    public void establecerCarrera(String n) {
        carrera = n;
    }

    public void establecerCiclo(String n) {
        ciclo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCarrera() {
        return carrera;
    }

    public String obtenerCiclo() {
        return ciclo;
    }

}
