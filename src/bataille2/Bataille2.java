/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille2;


import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jerom
 */
public class Bataille2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       
        //Choix du mode
        System.out.println("Bonjour, \n Choissisez un mode : \n (1) Jouez contre l'ordinateur \n (2) Mode 2 joueurs");
        Game game1 = new Game();
        game1.Mode();
              
        //creation joueur
        System.out.println("Creation des joueurs ...");
        System.out.println("Votre nom : ");
        System.out.flush();
        Scanner sc_nom_1 = new Scanner(System.in);
        String nom_joueur_1 = sc_nom_1.nextLine();
        
        System.out.println("Votre nom de l'adversaire : ");
        System.out.flush();
        Scanner sc_nom_2 = new Scanner(System.in);  
        String nom_joueur_2 = sc_nom_2.nextLine();
        
        Joueur j1 = new Joueur(0);
        Joueur j2 = new Joueur(0);
        

             
        System.out.println("Création des cartes ...");
        TimeUnit.SECONDS.sleep(1);
        //crea un deck
        Deck deck1 = new Deck();
        
        //distribution
        deck1.Distribution(j1,j2);
        //deck1.VoirDeck();    
  
        //lancement du menu
        game1.Menu(nom_joueur_1, nom_joueur_2, j1, j2);
       
    }
}
