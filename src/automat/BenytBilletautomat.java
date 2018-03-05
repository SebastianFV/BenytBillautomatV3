package automat;
public class BenytBilletautomat
{
    public static void main(String[] arg)
    {
        int ID = 0;
        int beløb = 0;
        String tidspunkt = "5";
        int købStatus = 0;
        int montørStatus = 0;
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
                        tastatur.nextLine();
                        switch (valg) 
                        {
                            case 1:
                                System.out.print("Skriv beløb: ");
                                beløb = beløb + tastatur.nextInt();
                                automat.indsætPenge(beløb);
                                if(automat.getBalance() >= 10)
                                {
                                    tidspunkt = "klokken 5";
                                    automat.udskrivBillet();
                                    beløb = automat.returpenge();
                                    System.out.println("Du fik "+beløb+" retur");
                                }
                                else System.out.println("You did not put in enough money for a ticket");
                                break;
                            case 2: 
                                købStatus = 0;
                                break;
                            case 3:
                                System.out.println("Afslutter transaktion.");
                                købStatus = 0;
                                valg = 0;   // nulstiller valg, så den ikke går ind i en forkert case
                                ID++;
                                Kunde cos = new Kunde(tidspunkt, ID, beløb);
                                log.tilføjKunde(cos);
                                log.setID(ID);
                                købStatus = 1;
                                break;
                            default:
                                System.out.println("Ugyldigt valg, prøv igen");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Skriv kode: ");
                    String kode = tastatur.next();
                    automat.montørLogin(kode);
                    if(automat.erMontør()) montørStatus = 1;
                    else System.out.println("Wrong password. Please try again.");
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
                                System.out.println("Antal billetter solgt: " + automat.getAntalBilletterSolgt());
                                System.out.println("Total indkomst: " + automat.getTotal()+" kr");
                                break;
                            case 12:
                                automat.nulstil();
                                break;
                            case 13:
                                System.out.print("Skriv beløb: ");
                                beløb = beløb + tastatur.nextInt();
                                automat.setBilletpris(beløb);
                                break;
                            case 14:
                                // Her skal jeg printe array1list, gøres det rigtigt?
                                log.printLog();
//                              System.out.println("The time of the purchase for ID " + log.getID() + " was: " + log.getTime());
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