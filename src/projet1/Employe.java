/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet1;

/**
 *
 * @author Camil
 */

import java.time.LocalDate;

public class Employe { 
    
        private int Matricule;
        private String Nom;
        private String Prenom;
        private LocalDate  DateNais;
        private LocalDate DateEmbau;
        private double Salaire;
        
        // constructeurs
        public Employe() {
        }
        public Employe(int m, String n, String p, LocalDate  dn, LocalDate  de, double s)
        {
            this.Matricule = m;
            this.Nom = n;
            this.Prenom = p;
            this.DateNais = dn;
            this.DateEmbau = de;
            this.Salaire = s;
        }
//propriétés les méthodes d’accès aux différents attributs de la classe 
        // les Getters et Setters
    public int getMatriculeE() {return Matricule;}

    public void setMatriculeE(int m) {this.Matricule = m;}

    public String getNom() {return Nom;}

    public void setNom(String n) {this.Nom = n;}

    public String getPrenom() {return Prenom;}

    public void setPrenom(String p) { this.Prenom = p;}

    public LocalDate getDateNais() {return DateNais;}

    public void setDateNais(LocalDate dn) {this.DateNais = dn;}

    public LocalDate getDateEmbau() {return DateEmbau; }

    public void setDateEmbau(LocalDate de) {this.DateEmbau = de;}

    public double getSalaire() { return Salaire;}

    public void setSalaire(double s) {this.Salaire = s;}

   /* @Override
    public String toString() {
        return "Employe{" + "MatriculeE: \n" + MatriculeE + ", NomE: \n" + NomE + ", "
        + "PrenomE: \n" + PrenomE + ", DateNais: \n" + DateNais + ", DateEmbau:\n" +
        DateEmbau + ", Salair: \n" + Salair + '}';
    }*/
    
//la méthode Age() qui retourne l’âge de l’employé
    private int Age()
    {
        int age = LocalDate.now().getYear() - DateNais.getYear();
        return age;   
    }
//la méthode Anciennete( ) qui retourne le nombre d’années d’ancienneté de l’employé
    private int Anciennete()
    { 
        int annc = LocalDate.now().getYear() - DateEmbau.getYear();
        return annc;
    }
//la méthode AugmentationDuSalaire( ) qui augmente le salaire de l’employé en prenant en considération l’ancienneté
    public void AugmentationDuSalaire()
    {
        if (Anciennete() < 5)
            Salaire += Salaire * 0.02;
        else if (Anciennete() < 10)
            Salaire += Salaire * 0.05;
        else
            Salaire += Salaire * 0.1;
        
    } 
    
    
    
    
    public void AfficherEmploye()
    {
        System.out.println("\n\nMatricule : " + this.Matricule);
        System.out.println("Nom Complet : " + Nom.toUpperCase() + " " + Prenom.substring(0, 1).toUpperCase() + Prenom.substring(1).toLowerCase());
        System.out.println("Age : " + Age());
        System.out.println("Ancienneté : " + Anciennete());
        System.out.println("Salaire : " + Salaire);      
    }
}




