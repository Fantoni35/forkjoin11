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
public class Operazione3 implements Runnable {
  /* 
    Buffer dato;
    public double c;
    public Operazione3( buffer dato) {
        this.dato = dato;
        c=dato.c;
    }
         public void run()
    {
        dato.z=dato.y - 10.0*c;
        
        System.out.println("l'espressione calcolata fa " + dato.z);
    }*/
    
    /*  
     Buffer dato;

    public Operazione3(buffer dato) {
        this.dato = dato;
        
    }
             public void run()
             {
                 dato.z= dato.x * dato.y;
             }
*/
         buffer dato;
    public double b;
    public double p;
    public Operazione3(buffer dato) {
        this.dato = dato;
        b=dato.b;
        p=dato.p;
    }
     public void run()
    {
      dato.z=(7*b*p+3);
      System.out.println("ho calcolato 3 " + dato.z);
    }
    }
