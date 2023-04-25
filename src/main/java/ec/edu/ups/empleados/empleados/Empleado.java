/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.empleados.empleados;

import java.util.Date;

/**
 *
 * @author venot
 */
public class Empleado {
    String cedula;
    private String nombr;
    private String apellido;
    private Date fechaNacimiento;  
    private String telefono;
    private String direccion;
    protected String cargo;
public double calcularSalario(){
    return 0.00 ; 
}
    public Empleado() {
    }
//constructores mismo nimbre de la clase, es publico y no retorna nada 
    public Empleado(String cedula, String nombr, String apellido) {
        this.cedula = cedula;
        this.nombr = nombr;
        this.apellido = apellido;
    }
    
 public Empleado(String cedula, String nombr, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombr = nombr;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public Empleado(String cedula) {
        this.cedula = cedula;
    }

    public Empleado(String cedula, String nombr, String apellido, Date fechaNacimiento, String telefono, String direccion, String cargo, double calcularSalario) {
        this.cedula = cedula;
        this.nombr = nombr;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cargo = cargo;
       
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombr() {
        return nombr;
    }

    public void setNombr(String nombr) {
        this.nombr = nombr;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombr=" + nombr + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", direccion=" + direccion + ", cargo=" + cargo  + '}';
    }
}