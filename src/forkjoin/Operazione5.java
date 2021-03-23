/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkjoin;

/**
 *
 * @author PC
 */
public class Operazione5 implements Runnable {
          buffer dato;
    public Operazione5(buffer dato) {
        this.dato = dato;
    }
         public void run()
    {
        dato.o=dato.z * dato.y;
         System.out.println("ho calcolato 5 " + dato.o);
    }
}
