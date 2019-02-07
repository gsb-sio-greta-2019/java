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
public class CPosseder {
    
    private int numeroPraticien;
    private int codeSpecialite;
    private int possedeDiplome;
    private float coefficientPrescription;
    
    
    public CPosseder (int numeroPraticien, int codeSpecialite, int possedeDiplome, float coefficientPrescription) {
        
        this.codeSpecialite = codeSpecialite;
        this.coefficientPrescription = coefficientPrescription;
        this.possedeDiplome = possedeDiplome;
        
        
    }

    public int getNumeroPraticien() {
        return numeroPraticien;
    }

    public void setNumeroPraticien(int numeroPraticien) {
        this.numeroPraticien = numeroPraticien;
    }

    public int getCodeSpecialite() {
        return codeSpecialite;
    }

    public void setCodeSpecialite(int codeSpecialite) {
        this.codeSpecialite = codeSpecialite;
    }

    public int getPossedeDiplome() {
        return possedeDiplome;
    }

    public void setPossedeDiplome(int possedeDiplome) {
        this.possedeDiplome = possedeDiplome;
    }

    public float getCoefficientPrescription() {
        return coefficientPrescription;
    }

    public void setCoefficientPrescription(float coefficientPrescription) {
        this.coefficientPrescription = coefficientPrescription;
    }
    
    
}
