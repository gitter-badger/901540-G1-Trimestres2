/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.generalizacion1;

/**
 *
 * @author hernando
 */
public final class PerroHembra extends Perro{
    
    public void parto(){
        System.out.println("por parto");
    }

    @Override
    public void orinar() {
        System.out.println("orino agachada");
    }

    @Override
    public void morir() {
        System.out.println("morir");
    }
    
    
}
