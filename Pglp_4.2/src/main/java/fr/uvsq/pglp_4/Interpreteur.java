/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andri
 */
public class Interpreteur {
    
    private final Map<String, Command> commands;
    
    Interpreteur(){
        this.commands = new HashMap<>();
    }
    
    public void empiler(String name, Command command){
        this.commands.put(name, command);
    }
    
    public void execute(String name) {
        
	Command command = commands.get(name);
	if (command == null) {
            System.out.println(" Command error ");	
            throw new IllegalStateException("add command " + name);
	}
	command.apply();
    }

   
    
    
    
}
