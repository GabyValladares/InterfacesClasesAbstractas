/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Triangulo implements FiguraGeometrica{
    private double base;
    private double altura;
    private int tipo;

    public Triangulo() {
    }

    public Triangulo(double base, double altura, int tipo) {
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void calcularArea() {
        double area=(getBase()*getAltura())/2;
        }

    @Override
    public double calcularPerimetro() {
        return getBase()*3;
        }
    public void imprimir(){}

    @Override
    public String toString() {
        return "DATOS DEL TRIÁNGULO\n"+
                "Base:"+getBase()+"\n"+
                "Altura:"+getAltura()+"\n"+
                "Tipo:"+getTipo();
        }
    
    
    
}
