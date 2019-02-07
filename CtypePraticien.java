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
public class CtypePraticien {
    
    private int codePraticien;
    private String typeLieuPraticien;
    private String libellePraticien;
   
    
    
    
    
    public CtypePraticien (int codePraticien, String typeLieuPraticien, String libellePraticien) {
        
        this.codePraticien = codePraticien;
        this.libellePraticien =  libellePraticien;
        this.typeLieuPraticien =  typeLieuPraticien;
            
        
    }

    public int getCodePraticien() {
        return codePraticien;
    }

    public void setCodePraticien(int codePraticien) {
        this.codePraticien = codePraticien;
    }

    public String getTypeLieuPraticien() {
        return typeLieuPraticien;
    }

    public void setTypeLieuPraticien(String typeLieuPraticien) {
        this.typeLieuPraticien = typeLieuPraticien;
    }

    public String getLibellePraticien() {
        return libellePraticien;
    }

    public void setLibellePraticien(String libellePraticien) {
        this.libellePraticien = libellePraticien;
    }
    
    
}
