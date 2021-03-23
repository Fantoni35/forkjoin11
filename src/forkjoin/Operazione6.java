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
public class Operazione6 implements Runnable  {
    buffer dato;

    public Operazione6(buffer dato) {
        this.dato = dato;
       
    }
         public void run()
    {
        dato.v=dato.x-dato.o+dato.u;
         System.out.println("ho calcolato 6 " + dato.v);
    }
}
