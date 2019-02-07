/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author N'Diaye Automobile
 */
public class CRealiser {
    
    private String matriculeVisisteur;
    private int numeroActiviteComplemenataire;
    
    
    public CRealiser (String matriculeVisiteur, int numeroActiviteComplementaire) {
        
        this.matriculeVisisteur = matriculeVisiteur;
        this.numeroActiviteComplemenataire = numeroActiviteComplementaire;
            
        
    }

    public String getMatriculeVisisteur() {
        return matriculeVisisteur;
    }

    public void setMatriculeVisisteur(String matriculeVisisteur) {
        this.matriculeVisisteur = matriculeVisisteur;
    }

    public int getNumeroActiviteComplemenataire() {
        return numeroActiviteComplemenataire;
    }

    public void setNumeroActiviteComplemenataire(int numeroActiviteComplemenataire) {
        this.numeroActiviteComplemenataire = numeroActiviteComplemenataire;
    }
    
    
}
