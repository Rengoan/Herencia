/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author Lukelar
 */
public class Persona {
   protected String nombre,direccion;
   protected char genero;
   protected int edad;
   
   //Constructor
    public Persona(String nombre, String direccion, char genero, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
    }
   
   

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", genero=" + genero + ", edad=" + edad + '}';
    }
    
    
    
}
