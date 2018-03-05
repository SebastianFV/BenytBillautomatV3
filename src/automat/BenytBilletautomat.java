package automat;
import java.util.Date;

public class BenytBilletautomat
{
    public static void main(String[] arg)
    {
        Date dato = new Date();
        String tidspunkt = dato.toString();
        int beløb = 0;
        int ID = 0;
        int retur = 0;
        int købStatus = 0;
        int montørStatus = 0;
        int antalVBillet = 0;
        int antalBBillet = 0;
        int counter = 0;
        
        Transaktionslog log = new Transaktionslog();
        Billetautomat automat = new Billetautomat();
        java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered

        System.out.println("BenytBilletautomat version 3");
        System.out.println();

        while (true) 
        {
            System.out.println("Tast 1 for at købe in billet");
            System.out.println();
            System.out.println("Tast 2 for at logge ind som montør");
            int valg = tastatur.nextInt();
            tastatur.nextLine();

            switch(valg)
            {
                case 1:
                    beløb = 0;
                    købStatus = 1;
                    // Arraylist skal fungere bedre. Virker som om den overskriver gamle lists når den tilføjer nye.
                    while(købStatus == 1)
                    {
                        automat.buyerMenu();
                        valg = tastatur.nextInt();
                        tastatur.nextLine(); // HVad er det her? 
                        switch (valg) 
                        {
                            case 1:
                                System.out.println("Beløb:");
                                int input = tastatur.nextInt();
                                while(input < 0)            //Betaling skal være positiv
                                {
                                    input = tastatur.nextInt();
                                }
                                automat.indsætPenge(input);
                                beløb = beløb + input;
                                break;
                            case 2:
                                System.out.println("Vælg billettype:");
                                System.out.println("1. Børnebillet 10kr");
                                System.out.println("2. Voksenbillet 20kr");
                                valg = tastatur.nextInt();
                                tastatur.nextLine(); // HVad er det her?
                                if(valg == 1)
                                {
                                    automat.udskrivBørneBillet();
                                }
                                else if(valg == 2)
                                {
                                    automat.udskrivVoksenBillet();
                                }
                                else
                                {
                                    System.err.println("Ikke en mulighed");
                                }
                                break;
                            case 3:
                                retur = automat.returpenge();
                                System.out.println("Afslutter transaktion.");
                                valg = 0;   // nulstiller valg, så den ikke går ind i en forkert case
                                ID++;
                                Kunde cos = new Kunde(tidspunkt, ID, beløb, retur, automat.antalBBillet, automat.antalVBillet);
                                log.tilføjKunde(cos);
                                købStatus = 0;
                                break;
                            default:
                                System.out.println("Ugyldigt valg, prøv igen");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Skriv kode: ");
                    counter = 0;
                    String kode = tastatur.next();
                    int retries = 3;
                    while (montørStatus != 1 && retries <= 0)
                    {
                        counter++;
                        kode = tastatur.next();
                        if (automat.erMontør())
                        {
                            montørStatus = 1;
                        }
                        else 
                        {
                            retries = 3 - counter;
                            System.out.println("Wrong password");
                            System.out.println("You have " + retries + " tries left");
                        }
                    }
                    automat.montørLogin(kode);
                    while(montørStatus == 1)
                    {
                        if (automat.erMontør()) 
                        {
                            System.out.println("Tast 11 for at se status (montør)");
                            System.out.println("Tast 12 for at nulstille (montør)");
                            System.out.println("Tast 13 for at sætte billetpris (montør)");
                            System.out.println("Tast 14 for at printe transaktionslog (montør)");
                            System.out.println("Tast 15 for at søge efter information om en specifik kunde");
                            System.out.println("Tast 16 for at logge ud af montørtilstand");
                            valg = tastatur.nextInt();
                            tastatur.nextLine();
                            switch(valg)
                            {
                            case 11:
                                System.out.println("Antal billetter solgt: " + automat.getTotalBilletSalg());
                                System.out.println("Total indkomst: " + automat.getTotal()+" kr");
                                break;
                            case 12:
                                automat.nulstil();
                                break;
                            case 13:
                                System.out.print("Skriv beløb: ");
                                beløb = tastatur.nextInt();
                                beløb = beløb + tastatur.nextInt();
                                automat.setBilletpris(beløb);
                                break;
                            case 14:
                                System.out.println("---------------------------------------------------------------------------");
                                log.printLog();
                                break;
                            case 15:
                                // Virker ikke optimalt. Den printer info for ID 3 når man vælger 2, og error når man vælger 1.
                                System.out.println("Skriv ID på kunden du ønsker at søge på:");
                                valg = tastatur.nextInt();
                                tastatur.nextLine(); // HVad er det her?
                                log.printLog(valg);
                                break;
                            case 16:
                                automat.montørLogin("");
                                montørStatus = 0;
                                valg = 0; // nulstiller valg, så den ikke går ind i en forkert case
                                break;
                            default:
                            System.out.println("Ugyldigt valg, prøv igen");
                            }
                        }
                    }
                    break;
            default:
                System.out.println("Ugyldigt valg, prøv igen");
            }
        }
    }
}