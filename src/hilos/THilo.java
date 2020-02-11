/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis_
 */
public class THilo extends Thread {
    //El método run se encarga de ralizar las acciones
    private String proceso  = "";
    private long ms         = 0;
    @Override
    public void run(){
        try {
            ms = (long) ((Math.random() * 5 + 1) * 1000);
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(THilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Proceso -> " + proceso + " finalizado en " + ms);
    }
    //Constructor
    public THilo(String proceso){
        this.proceso = proceso;
    }
}
