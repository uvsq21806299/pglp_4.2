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
public class GenericFactory {
    
    public void quit() {
        // TODO Auto-generated method stub
        System.out.println("Quit");
        System.exit(0);
    }
    
    public void undo(Stack<Double> hist, MoteurRPN moteur){
        int i = 0;
        if(hist.size()>1){
            hist.remove(hist.size()-1);
            moteur.depiler();
            while(i<2){
                moteur.empiler(hist.pop());
                i++;
            }
            
            while(!hist.empty()){
                hist.pop();
            }
            
            
        }
        
        
        

    
    }
    
    
}
