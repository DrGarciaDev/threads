/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author luis_
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        THilo proceso1 = new THilo("Word");
        THilo proceso2 = new THilo("Excel");
        THilo proceso3 = new THilo("Paint");
        THilo proceso4 = new THilo("Reloj");
        THilo proceso5 = new THilo("Nexus");
        
        // Para ejecutar hilos se usa el método sytart
        proceso1.start();
        proceso2.start();
        proceso3.start();
        proceso4.start();
        proceso5.start();
    }
    
}
