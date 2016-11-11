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
public class Profesor extends Persona{
    private String noTarjetaProfesional;
    private int noPosgrado;
    private int noDocencia;

    public Profesor(String cedula, String nombre, String apellido, int edad, String sexo, String noTarjetaProfesional, int noPosgrado, int noDocencia) {
        super(cedula,nombre,apellido,edad,sexo);
        this.noTarjetaProfesional = noTarjetaProfesional;
        this.noPosgrado = noPosgrado;
        this.noDocencia = noDocencia;
    }

    public String getNoTarjetaProfesional() {
        return noTarjetaProfesional;
    }

    public void setNoTarjetaProfesional(String noTarjetaProfesional) {
        this.noTarjetaProfesional = noTarjetaProfesional;
    }

    public int getNoPosgrado() {
        return noPosgrado;
    }

    public void setNoPosgrado(int noPosgrado) {
        this.noPosgrado = noPosgrado;
    }

    public int getNoDocencia() {
        return noDocencia;
    }

    public void setNoDocencia(int noDocencia) {
        this.noDocencia = noDocencia;
    }

    @Override
    public void portarCarnet() {
        System.out.println("Yo lo porto en un lugar visible.");
    }
    
    
}
