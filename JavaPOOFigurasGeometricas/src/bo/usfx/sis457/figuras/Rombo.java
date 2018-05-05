/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author Xana Prudencio
 */
public class Rombo {
    private double Dl;
    private double Ds;
    private double Lado;
    
    public Rombo (double diametro, double diametro2, double lado) {
        this.Dl = diametro;
        this.Ds = diametro2;
        this.Lado = lado;
    }
    
    public Rombo () {
        // Llama al método constructor anterior
        this(0, 0, 0);
    }
    
     public double getDiametro() {
        return Dl;
    }
     
    public void setDiametro(double diametro) {
        this.Dl = diametro; 
    }
    
    public double getDiametro2() {
        return Ds;
    }
    
    public void setDiametro2(double diametro2) {
        this.Ds = diametro2;
    }
    
      public double getLado() {
        return Lado;
    }
    
    public void setLado(double lado) {
        this.Lado = lado;
    }
    
    public double getArea() {
        return ((this.Dl * this.Ds)/2);
    }
    
    public double getPerimetro() {
        return (4 * this.Lado);
    }
    
}
