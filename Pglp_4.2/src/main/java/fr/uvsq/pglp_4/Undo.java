/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.util.Stack;

/**
 *
 * @author andri
 */
public class Undo implements GenericCommand{
    
    private final GenericFactory undo;
    private final Stack<Double> hist;
    private final MoteurRPN moteur;
    
    public Undo(GenericFactory undo, Stack<Double> hist, MoteurRPN moteur){
        
        this.undo = undo;
        this.hist = hist;
        this.moteur = moteur;
    }
    
    @Override
    public void apply(){
        
        undo.undo(this.hist, this.moteur);
    }
    
    
}
