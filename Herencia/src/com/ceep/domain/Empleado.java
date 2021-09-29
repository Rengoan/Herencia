
package com.ceep.domain;


public class Empleado extends Persona {
    
   private int idEmpleado;
   private double sueldo;

   //Constructor
    public Empleado(int idEmpleado, double sueldo, String nombre, String direccion, char genero, int edad) {
        super(nombre, direccion, genero, edad);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String direccion, char genero, int edad) {
        super(nombre, direccion, genero, edad);
    }

   


    //Getter and Setter

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
