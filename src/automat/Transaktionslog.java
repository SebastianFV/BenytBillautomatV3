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
//    
//    public  void setTime(String time)
//    {
//        kunder.forEach((cos) -> {
//            cos.setTidspunkt(time);
//        });
//    }
//    public String getTime()
//    {
//        for(Kunde cos : kunder)
//        {
//            return cos.getTidspunkt();
//        }
//        return "No costumers exist";
//    }
//    public  void setID(int ID)
//    {
//        kunder.forEach((cos) -> {
//            cos.setID(ID);
//        });
//    }
//    public int getID()
//    {
//        for(Kunde cos : kunder)
//        {
//            return cos.getID();
//        }
//        return 0;
//    }
//    public  void setBeløb(int beløb)
//    {
//        kunder.forEach((cos) -> {
//            cos.setBeløb(beløb);
//        });
//    }
//    
//    public int getBeløb()
//    {
//        for(Kunde cos : kunder)
//        {
//            return cos.getBeløb();
//        }
//        return 0;
//    }
//    
//    public int getRetur()
//    {
//        for(Kunde cos : kunder)
//        {
//            return cos.getRetur();
//        }
//        return 0;
//    }
    
    public void printLog()
    {
        for (int i = 0; i < kunder.size(); i++) 
        {
            System.out.println("Kunde ID: " + kunder.get(i).getID());
            System.out.println("Tidspunkt for køb: " + kunder.get(i).getTidspunkt());
            System.out.println("Penge lagt i maskinen: " + kunder.get(i).getBeløb());
            System.out.println("Returpenge var: " + kunder.get(i).getRetur());
            System.out.println("Antal børnebilletter købt var: " + kunder.get(i).getBBillet());
            System.out.println("Antal voksenbilletter købt var: " + kunder.get(i).getVBillet());
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("");
        }
    }
    
    public void printLog(int ID) // Overloader funktionen så vi kan søge på en specific kunde.
    {
        System.out.println("Kunde ID: " + kunder.get(ID).getID());      // Printer ID, på trods af at det er det man søger efter. Skal måske slettes
        System.out.println("Tidspunkt for køb: " + kunder.get(ID).getTidspunkt());
        System.out.println("Penge lagt i maskinen: " + kunder.get(ID).getBeløb());
        System.out.println("Returpenge var: " + kunder.get(ID).getRetur());
        System.out.println("Antal børnebilletter købt var: " + kunder.get(ID).getBBillet());
        System.out.println("Antal voksenbilletter købt var: " + kunder.get(ID).getVBillet());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("");
    }
}
