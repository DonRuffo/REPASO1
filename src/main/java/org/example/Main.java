package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        System.out.println("Ingrese la nota 1 del estudiante: ");
        double nota1 = sc.nextDouble();
        estudiante1.setNota1(nota1);
        System.out.println("Ingrese la nota 2 del estudiante: ");
        double nota2 = sc.nextDouble();
        estudiante1.setNota2(nota2);

        String url="jdbc:mysql://localhost:3306/MIDB";
        String pass="Lap20112023$";
        String user="root";

        String sql="INSERT INTO estudiantes (cedula,nombre,b1,b2) VALUES(?,?,?,?)";

        try(Connection conec= DriverManager.getConnection(url,user,pass)){
            System.out.println("Conexión exitosa");
            PreparedStatement pst=conec.prepareStatement(sql);
            pst.setString(1,estudiante1.getCedula());
            pst.setString(2,estudiante1.getNombre());
            pst.setDouble(3,estudiante1.getNota1());
            pst.setDouble(4,estudiante1.getNota2());

            int result=pst.executeUpdate();
            if(result>0){
                System.out.println("Se ha registrado el estudiante");
            }
            pst.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}