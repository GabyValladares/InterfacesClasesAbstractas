/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Cuadrado implements FiguraGeometrica {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public void calcularArea() {
        double area = getLado() * getLado();
        System.out.println("El área es:" + area);
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = getLado() * 4;
        return perimetro;
    }
    
    
    
}
