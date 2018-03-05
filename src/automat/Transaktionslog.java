/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;
import java.util.ArrayList;

public class Transaktionslog 
{
    public ArrayList<Kunde> kunder;
    
    public Transaktionslog()
    {
        kunder = new ArrayList<Kunde>();
    }
    
    public void tilføjKunde(Kunde cos)
    {
        kunder.add(cos);
    }
    
    public  void setTime(String time)
    {
        kunder.forEach((cos) -> {
            cos.setTidspunkt(time);
        });
    }
    public String getTime()
    {
        for(Kunde cos : kunder)
        {
            return cos.getTidspunkt();
        }
        return "No costumers exist";
    }
    public  void setID(int ID)
    {
        kunder.forEach((cos) -> {
            cos.setID(ID);
        });
    }
    public int getID()
    {
        for(Kunde cos : kunder)
        {
            return cos.getID();
        }
        return 0;
    }
    public  void setBeløb(int beløb)
    {
        kunder.forEach((cos) -> {
            cos.setBeløb(beløb);
        });
    }
    
    public int getBeløb()
    {
        for(Kunde cos : kunder)
        {
            return cos.getBeløb();
        }
        return 0;
    }
    
    public void printLog()
    {
        for (int i = 0; i < kunder.size(); i++) 
        {
            System.out.println("Costumor ID: " + kunder.get(i).getID());
            System.out.println("Time of purchase: " + kunder.get(i).getTidspunkt());
            System.out.println("Money put in machine: " + kunder.get(i).getBeløb());
        }
    }
    
    
}
