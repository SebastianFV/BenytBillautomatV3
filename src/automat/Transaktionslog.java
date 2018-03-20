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
    public ArrayList<Billet> billet;
    
    public Transaktionslog()
    {
        kunder = new ArrayList<Kunde>();
        billet = new ArrayList<Billet>();
    }
    
    public void tilføjKunde(Kunde cos)
    {
        kunder.add(cos);
    }
    
    public void tilføjTilKurv(int antalBilletter, String billetType, int pris)
    {
        billet.add(new Billet(antalBilletter, billetType, pris));
    }
    
    public void printKurv()
    {
        for (int i = 0; i < billet.size(); i++) 
        {
            System.out.println("");
            
        }
    }
    
    public void printLog()
    {
        for (int i = 0; i < kunder.size(); i++) 
        {
            System.out.println("Kunde ID: " + kunder.get(i).getID());
            System.out.println("Tidspunkt for køb: " + kunder.get(i).getTidspunkt());
            System.out.println("Penge lagt i maskinen: " + kunder.get(i).getBeløb());
            System.out.println("Returpenge var: " + kunder.get(i).getRetur());
            System.out.println("Antal børnebilletter købt var: " + kunder.get(i).getBørneBillet());
            System.out.println("Antal voksenbilletter købt var: " + kunder.get(i).getVoksenBillet());
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
        System.out.println("Antal børnebilletter købt var: " + kunder.get(ID).getBørneBillet());
        System.out.println("Antal voksenbilletter købt var: " + kunder.get(ID).getVoksenBillet());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("");
    }
    public void printBørneLog(int børneBilletter)
    {
        for (int i = 0; i < kunder.get(i).getBørneBillet(); i++) 
        {
            System.out.println("Kunde ID: " + kunder.get(i).getID());      // Printer ID, på trods af at det er det man søger efter. Skal måske slettes
            System.out.println("Tidspunkt for køb: " + kunder.get(i).getTidspunkt());
            System.out.println("Penge lagt i maskinen: " + kunder.get(i).getBeløb());
            System.out.println("Returpenge var: " + kunder.get(i).getRetur());
            System.out.println("Antal børnebilletter købt var: " + kunder.get(i).getBørneBillet());
            System.out.println("Antal voksenbilletter købt var: " + kunder.get(i).getVoksenBillet());
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("");
        }
    }
    
    
}
