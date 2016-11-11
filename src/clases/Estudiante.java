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
public class Estudiante extends Persona{
    private String carrera;
    private String semestre;

    public Estudiante(String cedula, String nombre, String apellido, int edad, String sexo, String carrera, String semestre) {
        super(cedula,nombre,apellido,edad,sexo);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    @Override
    public void saludar(){
        System.out.println("Mi llave que ma'.");
    }

    @Override
    public void portarCarnet() {
        System.out.println("Yo lo porto donde quiera."); 
    }
    
  
    
}
