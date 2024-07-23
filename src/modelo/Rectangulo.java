/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Rectangulo implements FiguraGeometrica,Datos {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = getBase()*getAltura()*PI;
        System.out.println("El area es: "+area);
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (getBase()*2)+(getAltura()*2);
        return perimetro;
    }
    
    public String toString(){
        return "DATOS DEL RECTANGULO\n"
                + "Base: "+getBase()+"\n"
                + "Altura: "+getAltura()+"\n";
    }
    
}
