/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet1;

import projet1.Employe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author Camil
 */
public class Projet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  Scanner input = new Scanner(System.in);
  
        int mat;
        String nom, prenom;
        String sdn, sde;
        LocalDate dn, de;
        double salaire;
        
        
  
        System.out.println("Matricule : ");
        mat = Integer.parseInt(input.nextLine()) ;
        System.out.println("Nom : ");
        nom = input.nextLine();
        System.out.println("Prenom : ");
        prenom = input.nextLine();
        System.out.println("Date de naissance (jj-mm-yyyy): " );
        sdn = input.nextLine();
        System.out.println("Date d' Embauche (jj-mm-yyyy): " );
        sde = input.nextLine();
        System.out.println("Salaire : ");
        salaire = input.nextInt();
  
        //traitement de la date
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        dn = LocalDate.parse(sdn, fmt);
        de = LocalDate.parse(sde, fmt);


        Employe e = new Employe(mat, nom, prenom, dn, de, salaire);
        e.AfficherEmploye();

        System.out.println("\n\nAprés application de l'augmentation de salaire");
        e.AugmentationDuSalaire();
        e.AfficherEmploye();

        input.next();
        
      
    }
    
}
