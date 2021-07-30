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
public class Projet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employe e = new Employe(10941,"SALIM","Omar", "04/08/1990","5/12/2012",10000);
       e.AfficherEmployé();
        System.out.println("\n Marticule :"+ "\n Nom Complete: "+
                "\n Age: "+"\n Annciennité: "+"\n Salaire: ");
        System.out.println(e.getNomE().toString());
        
        
      
    }
    
}
