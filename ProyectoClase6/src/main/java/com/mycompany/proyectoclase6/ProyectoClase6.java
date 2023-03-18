/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoclase6;

/**
 *
 * @author Usuario
 */
public class ProyectoClase6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculadora calc=new Calculadora();
        
        double resultSuma=calc.sumar(4.6, 6.5);
        System.out.println("Suma de 4.6 + 6.5 ="+resultSuma);
        
        double resultResta =calc.restar(7.6, 6.5);
        System.out.println("Resta de 7.6 - 6.5 ="+resultResta);
        
        
        double resultMult =calc.multiplicar(2.0, 3.0);
        System.out.println("Mulriplicacion de 2.0 * 3.0 ="+resultMult);
    
          double resultDiv=calc.dividir(4.4, 2.0);
        System.out.println("Division de 4.4 / 2.0 ="+resultDiv);
    
    }
    
}
