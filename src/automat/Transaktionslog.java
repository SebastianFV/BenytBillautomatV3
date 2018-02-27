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
    
    
}
