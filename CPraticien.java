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
public class CPraticien {
    
    private int numeroPraticien;
    private String nomPraticien;
    private String prenomPraticien;
    private String adressePraticien;
    private int codePostal;
    private String villePraticien ;
    private float coeffNotoriete;
    
    public CPraticien() {
	 System.out.println("Praticien:Praticien()");
}
    
   
    public CPraticien (int numeroPraticien, String nomPraticien, String prenomPraticien, String adressePraticien, int codePostal, String villePraticien, float coeffNotoriete )  {
        
        this.numeroPraticien = numeroPraticien;
        this.nomPraticien = nomPraticien;
        this.prenomPraticien = prenomPraticien;
        this.adressePraticien = adressePraticien;
        this.codePostal = codePostal;
        this.villePraticien = villePraticien;
        this.coeffNotoriete = coeffNotoriete;
        
        
        
    }

    public int getNumeroPraticien() {
        return numeroPraticien;
    }

    public void setNumeroPraticien(int numeroPraticien) {
        this.numeroPraticien = numeroPraticien;
    }

    public String getNomPraticien() {
        return nomPraticien;
    }

    public void setNomPraticien(String nomPraticien) {
        this.nomPraticien = nomPraticien;
    }

    public String getPrenomPraticien() {
        return prenomPraticien;
    }

    public void setPrenomPraticien(String prenomPraticien) {
        this.prenomPraticien = prenomPraticien;
    }

    public String getAdressePraticien() {
        return adressePraticien;
    }

    public void setAdressePraticien(String adressePraticien) {
        this.adressePraticien = adressePraticien;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVillePraticien() {
        return villePraticien;
    }

    public void setVillePraticien(String villePraticien) {
        this.villePraticien = villePraticien;
    }

    public float getCoeffNotoriete() {
        return coeffNotoriete;
    }

    public void setCoeffNotoriete(float coeffNotoriete) {
        this.coeffNotoriete = coeffNotoriete;
    }
    
    
    
    
    
}
