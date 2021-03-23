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
public class Operazione2 implements Runnable {
  
 /* 
    Buffer dato;
    public Operazione2(Buffer dato) {
        this.dato = dato;
 
    }
         public void run()
    {
        dato.y=dato.x * 5;
        
        System.out.println("ha calcolato" + dato.y);
    }*/ 
    
    /*  
     Buffer dato;
    public double b;
    public Operazione2(Buffer dato) {
        this.dato = dato;
        b=dato.b;
    }
    public void run()
    {
      dato.y=(5*b-7);
    }*/
         buffer dato;
    public double c;
    public Operazione2(buffer dato) {
        this.dato = dato;
        c=dato.c;
        
    }
     public void run()
    {
      dato.y=(5-2*c);
      System.out.println("ho calcolato 2 " + dato.y);
    }
    }
 
    

