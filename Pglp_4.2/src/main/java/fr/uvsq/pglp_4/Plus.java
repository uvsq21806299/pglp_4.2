/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.util.EmptyStackException;

/**
 *
 * @author andri
 */
public class Plus implements SpecificCommand{
    
    private final MoteurRPN moteur;
    private final SpecificFactory specific;

    public Plus(SpecificFactory specific, MoteurRPN moteur) {
        this.moteur = moteur;
        this.specific = specific;
    }

    
    @Override
    public void apply(){
        double op1 = 0;
        double op2 = 0;
        
        try{
            op1 = moteur.depiler();
            op2 = moteur.depiler(); 
            
            moteur.empiler(this.operation(op1, op2));
            
        } catch (EmptyStackException e){
            // La pile est vide.....
        }
        
    }
    
    
    @Override
    public double operation(double op1, double op2){
        return specific.plus(op2, op2);
    }
    
}
