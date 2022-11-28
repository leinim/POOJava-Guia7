/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Mile
 */
public class Persona {
    
    public String nombre;
    public int edad;
    public int peso;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
