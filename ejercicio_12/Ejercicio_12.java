package com.mycompany.ejercicio_12;

public class Ejercicio_12 {

    public static void main(String[] args) {
       float salario_n,salario_b,retencion;
       salario_b = 48 * 5000 * 4;
       retencion = (float) (salario_b * 0.125) ;
       salario_n = salario_b - retencion;
       System.out.println("el salario bruto es " + salario_b);
       System.out.println("la retencion en la fuente es " + retencion);
       System.out.println("el salario neto es " + salario_n);
    }
}
