package automat;

import java.util.ArrayList;

/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat 
{
    private int børneBilletpris;    // Prisen for én billet.
    private int voksenBilletpris;
    private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
    private boolean montørtilstand;
    public int antalVBillet = 0;
    public int antalBBillet = 0;
    public int antalBilletterSolgt; // Antal billetter automaten i alt har solgt

    /**
     * Opret en billetautomat der sælger billetter til 10 kr.
     */
    public Billetautomat() 
    {
        børneBilletpris = 10;
        voksenBilletpris = 20;
        balance = 0;
        antalBilletterSolgt = 0;
    }

    /**
     * Giver prisen for en billet. 
     */
    public int getBBilletpris() 
    {
        return børneBilletpris;
    }
    
    public int getVBilletpris()
    {
        return voksenBilletpris;
    }

    /**
     * Modtag nogle penge (i kroner) fra en kunde.
     */
    public void indsætPenge(int beløb) 
    {
        balance = balance + beløb;
    }

    /**
     * Giver balancen (beløbet maskinen har modtaget til den næste billet).
     */
    public int getBalance() 
    {
        return balance;
    }
    

    /**
     * Udskriv en billet.
     * Opdater total og nedskriv balancen med billetprisen
     */
    public void udskrivBørneBillet() 
    {
        if (balance<10) 
        {
            System.out.println("Du mangler at indbetale nogle penge");
        }
        else
        {
        System.out.println("##########B##T#########");
        System.out.println("# BlueJ Trafikselskab #");
        System.out.println("#                     #");
        System.out.println("#   Børne Billet      #");
        System.out.println("#       " + børneBilletpris + " kr.      #");
        System.out.println("#                     #");
        System.out.println("##########B##T#########");
        System.out.println("# Du har " + (balance-børneBilletpris) + " kr til gode       #");
        System.out.println("##########B##T#########");
        System.out.println();

        antalBBillet++;
        antalBilletterSolgt++;
        balance = balance - børneBilletpris; // Børne billetter koster 10 kroner
        }
    }
    public void udskrivVoksenBillet() 
    {
        if (balance<20) 
        {
            System.out.println("Du mangler at indbetale nogle penge");
        }
        else
        {
        System.out.println("##########B##T#########");
        System.out.println("# BlueJ Trafikselskab #");
        System.out.println("#                     #");
        System.out.println("#   Voksen Billet      #");
        System.out.println("#       " + voksenBilletpris + " kr.      #");
        System.out.println("#                     #");
        System.out.println("##########B##T#########");
        System.out.println("# Du har " + (balance-voksenBilletpris) + " kr til gode       #");
        System.out.println("##########B##T#########");
        System.out.println();

        antalVBillet++;
        antalBilletterSolgt++;
        balance = balance - voksenBilletpris; // Børne billetter koster 10 kroner
        }
    }


    public int returpenge() 
    {
        int returbeløb = balance;
        balance = 0;
        System.out.println("Du får "+returbeløb+" kr retur");
        return returbeløb;
    }


    void montørLogin(String adgangskode) 
    {
        if ("1234".equals(adgangskode)) 
        {
            montørtilstand = true;
            System.out.println("Montørtilstand aktiveret");
            System.out.println("Du kan nu angive billetpris");
        } 
        else 
        {
            montørtilstand = false;
            System.out.println("Montørtilstand deaktiveret");
        }
    }


    public int getTotal() 
    {
        if (montørtilstand) 
        {
            return børneBilletpris * antalBilletterSolgt + voksenBilletpris * antalBilletterSolgt;
        } 
        else 
        {
            System.out.println("Afvist - log ind først");
            return 0;
        }
    }

    public int getTotalBilletSalg() 
    {
        if (montørtilstand) 
        {
            return antalBilletterSolgt;
        } 
        else 
        {
            System.out.println("Afvist - log ind først");
            return 0;
        }
    }

    public void setAntalBørneBilletterSolgt(int antalBBillet)
    {
        this.antalBBillet = antalBBillet;
    }

    public void setAntalVoksenBilletterSolgt(int antalVBillet)
    {
        this.antalVBillet = antalVBillet;
    }

    public int getAntalBørneBilletterSolgt() 
    {
        if (montørtilstand) 
        {
            return antalBBillet;
        } 
        else 
        {
            System.out.println("Afvist - log ind først");
            return 0;
        }
    }

    public int getAntalVoksenBilletterSolgt() 
    {
        if (montørtilstand) 
        {
            return antalVBillet;
        } 
        else 
        {
            System.out.println("Afvist - log ind først");
            return 0;
        }
    }

    public void setBørneBilletpris(int børneBilletpris) 
    {
        this.børneBilletpris = børneBilletpris;
    }

    public void setVoksenBilletpris(int voksenBilletpris) 
    {
        this.voksenBilletpris = voksenBilletpris;
    }
        
    public void nulstil() 
    {
        if (montørtilstand) 
        {
            balance = 0;
            antalBilletterSolgt = 0;
            antalVBillet = 0;
            antalBBillet = 0;
        } 
        else 
        {
            System.out.println("Afvist - log ind først");
        }
    }

    public void setAntalBilletterSolgt(int antalBilletterSolgt) 
    {
        if (montørtilstand) 
        {
            this.antalBilletterSolgt = antalBilletterSolgt;
        } 
        else 
        {
            System.out.println("Afvist - log ind først");
        }
    }

    public boolean erMontør() 
    {
        return montørtilstand;
    }

    public void buyerMenu()
    {
        System.out.println("-----------------------------------------------");
        System.out.println("Balancen er på " + getBalance() + " kroner");
        System.out.println();
        System.out.println("Tast 1 for at indbetale penge");
        System.out.println("Tast 2 for at udskrive din billet");
        System.out.println("Tast 3 for at afslutte køb");
    }

    public void billetmenu()
{
        System.out.println("Vælg billettype:");
        System.out.println("1. Børnebillet " + getBBilletpris() + "kr");
        System.out.println("2. Voksenbillet "+ getVBilletpris() + "kr");
    }
}