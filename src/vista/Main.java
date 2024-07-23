/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Cuadrado;
import modelo.FiguraGeometrica;
import modelo.Rectangulo;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Cuadrado c1=new Cuadrado();
        c1.setLado(8.9);
        c1.calcularArea();
        System.out.println("El perímetro es:"+c1.calcularPerimetro());
        
        Rectangulo r1=new Rectangulo();
        r1.setBase(5.2);
        r1.setAltura(4.3);
        r1.calcularArea();
        System.out.println("El perimetro es: "+r1.calcularPerimetro());
        System.out.println(r1.toString());
    }
    
    
    
}
