package at.spengergasse;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;

public class MyTest {
    public int Testirg(int alter, int height, double hgs){
        System.out.println("Bitte geben sie ein Alter zwischen 17 und 24:");

        //0 = gesund
        //1 = gefahr


        if(alter ==17 || alter == 18 || alter == 19){
            System.out.println("Bitte geben sie eine Größe zwischen 150 und 184:");

            if( height ==150 ||height ==151||height ==152||height ==153||height ==154){
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if(hgs <= 21.6){
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==155 ||height ==156||height ==157||height ==158||height ==159) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 22.9) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==160 ||height ==161||height ==162||height ==163||height ==164) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 24.0) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==165 ||height ==166||height ==167||height ==168||height ==169) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 25.0) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==170 ||height ==171||height ==172||height ==173||height ==174) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 26.0) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==175 ||height ==176||height ==177||height ==178||height ==179) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 26.7) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==180 ||height ==181||height ==182||height ==183||height ==184) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 27.6) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }




        }
        if(alter ==20 || alter == 21 || alter == 22 || alter ==23 ||alter ==24){
            System.out.println("Bitte geben sie eine Größe zwischen 150 und 184:");

            if( height ==150 ||height ==151||height ==152||height ==153||height ==154){
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if(hgs <= 23.7){
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==155 ||height ==156||height ==157||height ==158||height ==159) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 24.8) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==160 ||height ==161||height ==162||height ==163||height ==164) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 26.1) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==165 ||height ==166||height ==167||height ==168||height ==169) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 27.1) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==170 ||height ==171||height ==172||height ==173||height ==174) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 28.0) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==175 ||height ==176||height ==177||height ==178||height ==179) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 29.0) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }
            if( height ==180 ||height ==181||height ==182||height ==183||height ==184) {
                System.out.println("Bitte geben sie eine Druckstärke ein:");

                if (hgs <= 29.6) {
                    System.out.println("Passen sie auf, sie sind in Lebensgefahr");
                    return 1;
                }
                else{
                    System.out.println("Sie sind gesund");
                    return 0;
                }
            }


        }

            return 0;







    }
    @Test
    public void Sollgesund(){
        MyTest myTest = new MyTest();
        assertEquals(0,myTest.Testirg(21,175,30));
        assertEquals(0,myTest.Testirg(20,174,31));
        assertEquals(0,myTest.Testirg(17,152,22));
    }
    @Test
    public  void Gefahr(){
        MyTest myTest=new MyTest();
        assertEquals(1,myTest.Testirg(21,175,10));
        assertEquals(1,myTest.Testirg(20,174,5));
        assertEquals(1,myTest.Testirg(17,152,3));
    }
}


