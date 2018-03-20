/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author Squid
 */
public class Billet 
{
    int antalBilletter;
    String billetType;
    int pris;
    
    public Billet(int antalBilletter, String billetType, int pris)
    {
       this.antalBilletter = antalBilletter;
       this.billetType = billetType;
       this.pris = pris;
    }

    public int getAntalBilletter() {
        return antalBilletter;
    }

    public void setAntalBilletter(int antalBilletter) {
        this.antalBilletter = antalBilletter;
    }

    public String getBilletType() {
        return billetType;
    }

    public void setBilletType(String billetType) {
        this.billetType = billetType;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }
    
}
