package at.spengergasse;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {


    public static void main(String[] args) {


        System.out.println("Bitte geben sie ein Alter zwischen 17 und 24:");

        Scanner sc = new Scanner(System.in);

        String eingabealter =sc.nextLine();
        int alter = parseInt(eingabealter);
        if(alter ==17 || alter == 18 || alter == 19){
            System.out.println("Bitte geben sie eine Größe zwischen 150 und 184:");
            String eingabeheight =sc.nextLine();
            int height =parseInt(eingabeheight);
            if( height ==150 ||height ==151||height ==152||height ==153||height ==154){
                System.out.println("Bitte geben sie eine Druckstärke ein:");
                String eingabedruck =sc.nextLine();
                double hgs =Double.parseDouble(eingabedruck);
                if(hgs < 21.6){
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                }
            }
            if( height ==155 ||height ==156||height ==157||height ==158||height ==159) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");
                String eingabedruck = sc.nextLine();
                double hgs = Double.parseDouble(eingabedruck);
                if (hgs < 22.9) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                }
            }
            if( height ==160 ||height ==161||height ==162||height ==163||height ==164) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");
                String eingabedruck = sc.nextLine();
                double hgs = Double.parseDouble(eingabedruck);
                if (hgs < 24.0) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                }
            }
        }
        else{
            System.out.println("Bitte ein Alter das zugelassen ist");
        }






        sc.close();

    }
}
