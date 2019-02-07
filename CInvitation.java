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
public class CInvitation {
    
    private int numeroActiviteComplementaire;
    private int numeroPraticien;
    private String specialisteON;
    
    
    public CInvitation( int numeroActiviteComplementaire, int numeroPraticien, String specialisteON) {
        
        this.numeroActiviteComplementaire = numeroActiviteComplementaire;
        
        this.numeroPraticien = numeroPraticien;
        
        this.specialisteON = specialisteON;
        
        
    }

    public int getNumeroActiviteComplementaire() {
        return numeroActiviteComplementaire;
    }

    public void setNumeroActiviteComplementaire(int numeroActiviteComplementaire) {
        this.numeroActiviteComplementaire = numeroActiviteComplementaire;
    }

    public int getNumeroPraticien() {
        return numeroPraticien;
    }

    public void setNumeroPraticien(int numeroPraticien) {
        this.numeroPraticien = numeroPraticien;
    }

    public String getSpecialisteON() {
        return specialisteON;
    }

    public void setSpecialisteON(String specialisteON) {
        this.specialisteON = specialisteON;
    }
    
    
}
