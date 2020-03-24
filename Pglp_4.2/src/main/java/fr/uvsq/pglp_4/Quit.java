/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

/**
 *
 * @author andri
 */
public class Quit implements GenericCommand {

    private final GenericFactory quit;
	
    public Quit(GenericFactory quit) {
	this.quit = quit;
    }
	
    @Override
	public void apply() {
		quit.quit();
	}
    
}
