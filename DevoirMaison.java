/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir.maison;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

/**
 *
 * @author coren
 */
public class DevoirMaison 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int min =0;
        int max =100;
        int saisie = 0;
        int resultat = 0;
        /* Déclaration des variables de stockage du chiffre à trouver
        Utilisation des méthodes Math.random + transformation en entier
        Le 101 indique le chiffre le plus haut exclusif
        Le 0 indique le point de départ du chiffre à calculer
        */
        int Chiffreatrouver1 = (int) (Math.random() * 101 + 0);
        int Chiffreatrouver2 = (int) (Math.random() * 101 + 0);
        int Chiffreatrouver3 = (int) (Math.random() * 101 + 0);
       
        System.out.println("Chiffre à trouver numéro 1 : " + Chiffreatrouver1);
        System.out.println("Chiffre à trouver numéro 2 : " + Chiffreatrouver2);
        System.out.println("Chiffre à trouver numéro 3 : " + Chiffreatrouver3);
         
        /* test du premier chiffre */
        for (int nbretentative = 1; nbretentative < 4; nbretentative++)
        {
           if (nbretentative == 3) {System.out.println(" vous n'avez pas trouvé la bonne combinaison"); resultat = 1; }    
            
        System.out.println("tentative de saisie numéro : "+ nbretentative +"/3 du premier chiffre");
        System.out.println("saisir un nombre entre 0 et 100 : ");
        Scanner keyb = new Scanner (System.in);
        saisie =keyb.nextInt();
        
        if (saisie > Chiffreatrouver1) {System.out.println("Le chiffre saisi est trop haut !");}
        else
           {if (saisie < Chiffreatrouver1) {System.out.println("Le chiffre saisi est trop bas !");}
           else {System.out.println("Le chiffre saisi " + saisie + " est le bon chiffre. Bravo ! Vous pouvez tenter de trouver le second"); nbretentative = 4;} 
           }
        }
        
        
        /* Test du deuxième chiffre si on a trouvé le premier (si resultat <> 1) */
        if (resultat == 0)
                   for (int nbretentative = 1; nbretentative < 4; nbretentative++)
                   {
                    if (nbretentative == 3) {System.out.println(" vous n'avez pas trouvé la bonne combinaison"); resultat = 1; } 
                    System.out.println("tentative de saisie numéro : "+ nbretentative +"/3 du second chiffre");
                    System.out.println("saisir un nombre entre 0 et 100 : ");
                    Scanner keyb = new Scanner (System.in);
                    saisie =keyb.nextInt();
        
                    if (saisie > Chiffreatrouver2) {System.out.println("Le chiffre saisi est trop haut !");}
                    else
                        {if (saisie < Chiffreatrouver2) {System.out.println("Le chiffre saisi est trop bas !");}
                         else {System.out.println("Le chiffre saisi " + saisie + " est le bon chiffre. Bravo ! Vous pouvez tenter de trouver le troisieme"); nbretentative = 4;} 
                        }
                    };
                         
        if (resultat == 0)         
                   for (int nbretentative = 1; nbretentative < 4; nbretentative++)
                  {
                    if (nbretentative == 3) {System.out.println(" vous n'avez pas trouvé la bonne combinaison"); resultat = 1; } 
                    System.out.println("tentative de saisie numéro : "+ nbretentative +"/3 du troisième chiffre");
                    System.out.println("saisir un nombre entre 0 et 100 : ");
                    Scanner keyb = new Scanner (System.in);
                    saisie =keyb.nextInt();
        
                    if (saisie > Chiffreatrouver3) {System.out.println("Le chiffre saisi est trop haut !");}
                    else
                        {if (saisie < Chiffreatrouver3) {System.out.println("Le chiffre saisi est trop bas !");}
                         else {System.out.println("Le chiffre saisi " + saisie + " est le bon chiffre. Bravo ! Vous avez trouvé le code"); nbretentative = 4;} 
                        }
                    }
                    System.out.println("Le chiffre à trouver était : " + Chiffreatrouver1 +" "+ Chiffreatrouver2 +" "+ Chiffreatrouver3);
                 }
}
        