/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.Scanner;

/**
 *
 * @author melissa.a.lopez
 */
public class PokerGame {

    static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        boolean resInvalida = false; 
        Deck.makeDeck();
        System.out.println("Bienvenido a Poker!");

        while (!resInvalida) {
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("0 Salir");
            System.out.println("Que opcion deseas? (Inserta el numero del menu)");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":

                    System.out.println("-----------------------------------------------------------");
                    Deck.shuffle();
                    System.out.println("-----------------------------------------------------------");
                    break;

                case "2":
                    try {

                        System.out.println("-----------------------------------------------------------");
                        Deck.head();
                        System.out.println("-----------------------------------------------------------");
                    } catch (Exception ex) {
                        System.out.println("Ya no hay cartas, se acabo el juego!");
                        resInvalida = true;

                    }
                    break;
                case "3":
                    try {

                        System.out.println("-----------------------------------------------------------");
                        Deck.pick();
                        System.out.println("-----------------------------------------------------------");
                    } catch (Exception ex) {
                        System.out.println("Ya no hay cartas, se acabo el juego!");
                        resInvalida = true;

                    }
                    break;
                case "4":
                    try {

                        System.out.println("-----------------------------------------------------------");
                        Deck.hand();
                        System.out.println("-----------------------------------------------------------");
                    } catch (Exception ex) {
                        System.out.println("Ya no hay cartas, se acabo el juego!");
                        resInvalida = true;

                    }
                    break;

                case "0":
                    resInvalida = true;
                    break;
                default:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("**Opcion NO valida**");
                    System.out.println("Introduzca un numero del 0 al 4");
                    System.out.println("-----------------------------------------------------------");

            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokerGame.showMenu();
    }

}
