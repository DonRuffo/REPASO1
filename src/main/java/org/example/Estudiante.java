package org.example;

public class Estudiante {
    String nombre, cedula, telefono;
    int edad;
    double nota1, nota2;
    public Estudiante() {}
    public Estudiante(String nombre, String cedula, String telefono, int edad, double nota1, double nota2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota1: " + getNota1());
        System.out.println("Nota2: " + getNota2());
        double promedio=(getNota1()+getNota2())/2;
        System.out.println("Promedio: "+promedio);
        if(promedio>=7){
            System.out.println("\t El estudiante APRUEBA");
        }else{
            System.out.println("\t El estudiante REPRUEBA");
        }
    }
}

