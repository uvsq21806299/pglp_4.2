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
public interface SpecificCommand extends Command{
    
    /**
     *
     */
    
    @Override
    public void apply();
    public double operation(double op1, double op2);
    
}
