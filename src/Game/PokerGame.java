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
        boolean resValida = false;
        Deck.makeDeck();
        while (!resValida) {
            System.out.println("Bienvenido a Poker!");
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("0 Salir");
            System.out.println("Que opcion deseas? (Inserta el numero del menu)");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------------------------------");
                    Deck.shuffle();
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------");
                    Deck.head();
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------");
                    Deck.pick();
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------");
                    Deck.hand();
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 0:
                    resValida = true;
                    break;
                default:
                    System.out.println("**Opcion NO valida**");
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
