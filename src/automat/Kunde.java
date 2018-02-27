/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;


public class Kunde 
{
    private String tidspunkt;
    private String ID;
    private int beløb;

    public Kunde()
    {
        
    }
    
    public Kunde(String tidspunkt, String handling, int beløb) 
    {
        this.tidspunkt = tidspunkt;
        this.ID = handling;
        this.beløb = beløb;
    }

    public void setTidspunkt(String tidspunkt) 
    {
        this.tidspunkt = tidspunkt;
    }

    public void setHandling(String handling) 
    {
        this.ID = handling;
    }

    public void setBeløb(int beløb) 
    {
        this.beløb = beløb;
    }

    public String getTidspunkt() 
    {
        return tidspunkt;
    }

    public String getHandling() 
    {
        return ID;
    }

    public int getBeløb() 
    {
        return beløb;
    }
    

    
}
