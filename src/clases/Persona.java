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
public abstract  class Persona implements java.io.Serializable{
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;

    public Persona(String cedula, String nombre, String apellido, int edad, String sexo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void saludar(){
        System.out.println("Buenos dias a todos!");
    }
    
    public abstract void  portarCarnet(); 
    
    public final void horaLLegadaAclases(){
        System.out.println("DEBES VENIR A LAS 8:30 AM");
    }
    
    
}
