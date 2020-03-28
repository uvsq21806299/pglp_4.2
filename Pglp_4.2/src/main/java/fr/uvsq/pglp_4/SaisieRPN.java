/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_4;

import java.util.Scanner;

/**
 *
 * @author andri
 */
public class SaisieRPN {
    
    private MoteurRPN moteur = new MoteurRPN();
    private Scanner sc = new Scanner(System.in);
    private String saisie = new String();
    
    public void reception(){
        
        moteur.moteurInit();
        System.out.println("veuillez inserer les expressions : ");
        do{
            this.saisie = sc.nextLine();
            if(saisieVerif(this.saisie)==false){
                moteur.apply(this.saisie);
            }else{ 
                moteur.empiler(Double.parseDouble(saisie));
            }
            moteur.afficher();
        }while(true);
    } 
    
    
    private boolean saisieVerif(String op){
        try{
            double saisie = Double.parseDouble(op);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
        
    }
    
}
