
import com.mycompany.proyectoclase6.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pbarzaghi
 */
public class CalculadoraTest {


  //El resultado de multiplicar 80 por 3 da 240  
  @Test
  public void multiplicar80x3igual240(){
      Calculadora calSuma=new Calculadora();
      double unNumero=80.0;
      double otroNumero=3.0;
      Assertions.assertEquals(240.00,calSuma.multiplicar(unNumero,otroNumero));
   }
  
  //El resultado de sumar 150 y 180, dividido por 3, da 110
  @Test
  public void sumar150y180Dividido3da110(){
  
      Calculadora calc= new Calculadora();
      double suma150y180=calc.sumar(150.0, 180.0);
      double divPor3=calc.dividir(suma150y180, 3.0);
      Assertions.assertEquals(110.0, divPor3);
      
  }
  
  //El resultado de restar 90 y 50, multiplicado por 15, no da 605.
  @Test
  public void restar90y50Multiplicar15da605(){
      
      Calculadora calc=new Calculadora();
      double resta90y50=calc.restar(90.0, 50.0);
      double multiplicadoX15=calc.multiplicar(resta90y50,15.0);
      // el resultado da 600 falla porque puse 605
      Assertions.assertEquals(605.0, multiplicadoX15);
    }
  
  //El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
  @Test
  public void sumar70y40Multiplicar25Noda2700(){
      Calculadora calc=new Calculadora();
      double sumar70y40=calc.sumar(70.0, 40.0);
      double multiplcarX25=calc.multiplicar(sumar70y40, 25.0);
      Assertions.assertNotEquals(2700, multiplcarX25);
  
  
  }
}
