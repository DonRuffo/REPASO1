package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc para strings
        Scanner sc1 = new Scanner(System.in); //sc1 para numericos
        Estudiante estudiante1 = new Estudiante();
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        estudiante1.setNombre(nombre);
        System.out.println("Ingrese la cedula del estudiante: ");
        String cedula = sc.nextLine();
        estudiante1.setCedula(cedula);
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        estudiante1.setEdad(edad);
        System.out.println("Ingrese el telefono del estudiante: ");
        String telefono = sc1.nextLine();
        estudiante1.setTelefono(telefono);
        System.out.println("Ingrese la nota 1 del estudiante: ");
        double nota1 = sc.nextDouble();
        estudiante1.setNota1(nota1);
        System.out.println("Ingrese la nota 2 del estudiante: ");
        double nota2 = sc.nextDouble();
        estudiante1.setNota2(nota2);

        estudiante1.imprimirDatos();

    }
}