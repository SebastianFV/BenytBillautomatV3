/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;


public class Kunder 
{
    private String tidspunkt;
    private String handling;
    private int beløb;

    public Kunder()
    {
        
    }
    
    public Kunder(String tidspunkt, String handling, int beløb) 
    {
        this.tidspunkt = tidspunkt;
        this.handling = handling;
        this.beløb = beløb;
    }

    public void setTidspunkt(String tidspunkt) 
    {
        this.tidspunkt = tidspunkt;
    }

    public void setHandling(String handling) 
    {
        this.handling = handling;
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
        return handling;
    }

    public int getBeløb() 
    {
        return beløb;
    }
    

    
}
