package automat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BenytBilletautomat
{
    public static void main(String[] arg)
    {
        Transaktionslog log = new Transaktionslog();
        Billetautomat automat = new Billetautomat();
        GUI gui = new GUI();
        gui.automat = automat;      // Vi sætter automat objektet inde i gui til at være det objekt vi har oprettet i main.'
        gui.updateAutomat();          // This function is repeated.
        JFrame vindue = new JFrame("Billetautomat");
        vindue.add(gui);
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vindue.setSize(1000, 1000);
        vindue.setVisible(true);
        
        
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
        
        java.util.Scanner tastatur = new java.util.Scanner(System.in);

        System.out.println("BenytBilletautomat version 3");
        System.out.println();

        while (true) 
        {
            gui.updateAutomat(); 
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
                        gui.updateAutomat(); 
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
                                    System.out.println("Dette er ikke et brugbart input");
                                    input = tastatur.nextInt();
                                }
                                automat.indsætPenge(input);
                                beløb = beløb + input;
                                break;
                            case 2:
                                automat.billetmenu();
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
                                automat.setAntalBørneBilletterSolgt(0);
                                automat.setAntalVoksenBilletterSolgt(0);
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
                    int retries = 3;
                    while (montørStatus != 1 && retries > 0)
                    {
                        counter++;
                        String kode = tastatur.next();
                        automat.montørLogin(kode);
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
                    while(montørStatus == 1)
                    {
                        if (automat.erMontør()) 
                        {
                            System.out.println("Tast 11 for at se status (montør)");
                            System.out.println("Tast 12 for at nulstille (montør)");
                            System.out.println("Tast 13 for at sætte billetpris (montør)");
                            System.out.println("Tast 14 for at printe transaktionslog (montør)");
                            System.out.println("Tast 15 for at logge ud af montørtilstand");
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
                                automat.setBørneBilletpris(beløb);
                                break;
                            case 14:
                                System.out.println("Ønsker du at:");
                                System.out.println("1. Print total log");
                                System.out.println("2. Print info ud fra ID");
                                System.out.println("3. Print info ud fra børnebilletter");
                                System.out.println("---------------------------------------------------------------------------");
                                valg = tastatur.nextInt();
                                tastatur.nextLine();
                                switch(valg)
                                {
                                    case 1:
                                        log.printLog();
                                    break;
                                    case 2:
                                        System.out.println("Skriv ID på kunden du ønsker at søge på:");
                                        valg = tastatur.nextInt() - 1;
                                        tastatur.nextLine(); 
                                        log.printLog(valg);
                                    break;
                                    case 3:
//                                        log.printBørneLog(); // virker ikke
                                    break;
                                    default:
                                        System.out.println("That was not a valid input");
                                }
                                break;
                            case 15:
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