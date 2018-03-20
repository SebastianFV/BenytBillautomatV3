/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;


public class Kunde 
{
    private String tidspunkt;
    private int ID;
    private int beløb;
    private int retur;
    private int antalVoksenBilletter;
    private int antalBørneBilletter;

    
    public Kunde(String tidspunkt, int ID, int beløb, int retur, int antalBørneBilletter, int antalVoksenBilletter) 
    {
        this.retur = retur;
        this.tidspunkt = tidspunkt;
        this.ID = ID;
        this.beløb = beløb;
        this.antalBørneBilletter = antalBørneBilletter;
        this.antalVoksenBilletter = antalVoksenBilletter;
    }

    public void setTidspunkt(String tidspunkt) 
    {
        this.tidspunkt = tidspunkt;
    }

    public void setID(int ID) 
    {
        this.ID = ID;
    }

    public void setBeløb(int beløb) 
    {
        this.beløb = beløb;
    }
    
    public void setBBillet(int antalBørneBilletter)
    {
        this.antalBørneBilletter = antalBørneBilletter;
    }
    
    public void setVBillet(int antalVoksenBilletter)
    {
        this.antalVoksenBilletter = antalVoksenBilletter;
    }

    public String getTidspunkt() 
    {
        return tidspunkt;
    }

    public int getID() 
    {
        return ID;
    }

    public int getBeløb() 
    {
        return beløb;
    }
    
    public int getRetur()
    {
        return retur;
    }
    
    public int getBørneBillet()
    {
        return antalBørneBilletter;
    }
    
    public int getVoksenBillet()
    {
        return antalVoksenBilletter;
    }
}
