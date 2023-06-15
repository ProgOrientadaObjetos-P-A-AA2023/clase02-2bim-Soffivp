/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        EstudiantePresencial ePresencial = new EstudiantePresencial(
                "Paola Sofia", "Vire Piedra", "1221554564", 24);
        
        ePresencial.establecerCostoCredito(25.6);
        ePresencial.establecerNumeroCreditos(6);
        ePresencial.calcularMatriculaPresencial();
        
        System.out.println(ePresencial);
        
        
    }
}
