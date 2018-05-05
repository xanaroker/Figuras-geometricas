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
public class Romboide {
    
     private double Base1;
    private double Altura1;
    
    public Romboide (double base1, double altura1) {
        this.Base1 = base1;
        this.Altura1 = altura1;
    }
    
    public Romboide () {
        // Llama al método constructor anterior
        this(0, 0);
    }
    
     public double getBase1() {
        return Base1;
    }
     
    public void setBase1(double base1) {
        this.Base1 = base1;
    }
    
    public double getAltura1() {
        return Altura1;
    }
    
    public void setAltura1(double altura1) {
        this.Altura1 = altura1;
    }
    
    public double getArea() {
        return (this.Base1 * this.Altura1);
    }
    
    public double getPerimetro() {
        return (2 * (this.Base1 + this.Altura1)); 
    }
}
