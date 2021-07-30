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
public class Employe { 
    
        private int MatriculeE;
        private String NomE;
        private String PrenomE;
        private String  DateNais;
        private String DateEmbau;
        private double Salair;
        
        // constructeurs
        public Employe() {
        }
        public Employe(int Matricule, String Nom, String Prenom, String DateNaissance, String DateEmbauche, double Salaire)
        {
            this.MatriculeE = Matricule;
            this.NomE = Nom;
            this.PrenomE = Prenom;
            this.DateNais = DateNaissance;
            this.DateEmbau = DateEmbauche;
            this.Salair = Salaire;
        }
//propriétés les méthodes d’accès aux différents attributs de la classe 
        // les Getters et Setters
    public int getMatriculeE() {
        return MatriculeE;
    }

    public void setMatriculeE(int MatriculeE) {
        this.MatriculeE = MatriculeE;
    }

    public String getNomE() {
        return NomE;
    }

    public void setNomE(String NomE) {
        this.NomE = NomE;
    }

    public String getPrenomE() {
        return PrenomE;
    }

    public void setPrenomE(String PrenomE) {
        this.PrenomE = PrenomE;
    }

    public String getDateNais() {
        return DateNais;
    }

    public void setDateNais(String DateNais) {
        this.DateNais = DateNais;
    }

    public String getDateEmbau() {
        return DateEmbau;
    }

    public void setDateEmbau(String DateEmbau) {
        this.DateEmbau = DateEmbau;
    }

    public double getSalair() {
        return Salair;
    }

    public void setSalair(double Salair) {this.Salair = Salair;}

    @Override
    public String toString() {
        return "Employe{" + "MatriculeE: \n" + MatriculeE + ", NomE: \n" + NomE + ", "
        + "PrenomE: \n" + PrenomE + ", DateNais: \n" + DateNais + ", DateEmbau:\n" +
        DateEmbau + ", Salair: \n" + Salair + '}';
    }
    
//la méthode Age() qui retourne l’âge de l’employé
    private int Age(int DateNais, int DateNow)
    {
        int age = DateNow - DateNais;
        return age;   
    }   
//la méthode Anciennete( ) qui retourne le nombre d’années d’ancienneté de l’employé
    private int AncienniteE(int DateEmbau, int DatJour)
    { 
        int Annciennite = DatJour - DateEmbau;
            return Annciennite;
        }
//la méthode AugmentationDuSalaire( ) qui augmente le salaire de l’employé en prenant en considération l’ancienneté
   /* public void AugmentationDuSalaire(double a)
    {
        double ajout = Salair + a;
        System.out.println("voulez vous augmenter le salaire (Oui/Non)? : ");
    } */
    public void AfficherEmployé()
    {
        System.out.println("\n Matricle: "+this.MatriculeE+ "\n Nom: "+this.NomE+
            "\n Prenom: "+this.PrenomE+"\n Date de naissance(jj/mm/aaaa): "+
            this.getDateNais()+"\n Date embauche (jj/mm/aaaa): "+this.getDateEmbau()+
            "\n Salaire : "+this.Salair);
                
    }
}




