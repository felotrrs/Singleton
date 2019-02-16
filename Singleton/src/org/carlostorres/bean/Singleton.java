/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlostorres.bean;

/**
 *
 * @author Felipe
 */
public class Singleton {
    private static Singleton instancia;
    
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if (instancia == null){
            instancia = new Singleton ();
        }
        return instancia;
    }
    
   // Singleton S1 = Singleton.getInstance();
}
