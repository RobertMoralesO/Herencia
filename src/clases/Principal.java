/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author rmorales1
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("114345789","Roberto", "Morales",27,"Masculino","Medicina","Tercer");
        System.out.println("Edad Estudiante:"+e.getEdad());
        e.saludar();
        e.portarCarnet();
        Profesor p = new Profesor("836547889","Carlos","Perez",64,"Indefinido","ABC50235",2,15);
        System.out.println("Cedula del docente: "+p.getCedula());
        p.saludar();
        p.portarCarnet();
        
        
    }
}
