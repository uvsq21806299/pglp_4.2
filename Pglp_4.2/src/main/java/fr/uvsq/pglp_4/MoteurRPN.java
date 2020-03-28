/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author andri
 */
public class MoteurRPN {
    
    private Stack <Double> pile;
    private Stack <Double> hist;
    
    public MoteurRPN(){
        pile = new Stack<>();
        hist = new Stack<>();
    }
    
    
        // Commandes Generique
        private GenericFactory genericFact = new GenericFactory();
        private Quit quit = new Quit(genericFact);
        //private GenericCommand undo = new Undo(genericFact, this.hist, this);
        
        
        
        // Commandes Specific
        private SpecificFactory specific  = new SpecificFactory();
        private Plus plus = new Plus(specific, this);
        private Moins moins = new Moins(specific, this);
        private Multi multi = new Multi(specific, this);
        private Div div = new Div(specific, this);
        
        
        
        private Interpreteur interpreteur = new Interpreteur();
    
        
        public void moteurInit(){
            interpreteur.addCommand("+", plus);
            interpreteur.addCommand("-", moins);
            interpreteur.addCommand("*", multi);
            interpreteur.addCommand("/", div);
            
        }
        
        /**
         * 
         * @param operande 
         */
	public void empiler(double operande) {
		this.pile.push(operande);
	}
	
        
        /**
         * 
         * @return 
         */
	public double depiler() {
		if(this.pile.isEmpty()) {
			throw new EmptyStackException();
		}else {
                    this.hist.push(pile.peek());
                    return pile.pop();
		}
	}
        
        public void apply(String name){
            interpreteur.execute(name);
        }
        
        public void afficher(){
            System.out.println(" la pile contient : ");
            if(!this.pile.isEmpty()){
                for(int i=0; i<this.pile.size(); i++){
                    System.out.println(this.pile.elementAt(i));
                }
            }
            
        }
    
}
