/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author melissa.a.lopez
 */
public class Deck {

    public static Random random = new Random();
    public static final List valor = new ArrayList(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9,
            10, "Ace", "Jack", "Queen", "King"));
    public static final List palo = new ArrayList(Arrays.asList("Corazones", "Tréboles", "Diamantes", "Picas"));

    public static final List color = new ArrayList(Arrays.asList("Rojo", "Negro"));
    public static List myDeck = new ArrayList<>();

    public static List makeDeck() {

        for (int i = 0; i < palo.size(); i++) {
            for (int k = 0; k < valor.size(); k++) {

                if (palo.get(i) == "Corazones" || palo.get(i) == "Diamantes") {
                    myDeck.add(Arrays.asList(palo.get(i), color.get(0), valor.get(k)));
                } else {
                    myDeck.add(Arrays.asList(palo.get(i), color.get(1), valor.get(k)));

                }
            }

        }

        return myDeck;
    }

    public static void shuffle() {
        System.out.println("Se mezclo el deck");

    }

    public static void head() {

        System.out.println("Primer carta del deck: " + myDeck.get(0));
        myDeck.remove(0);
        System.out.println("Quedan " + myDeck.size() + " cartas.");

    }

    public static void pick() {

        int randromCard = random.nextInt(myDeck.size());

        System.out.println("Random card: " + myDeck.get(randromCard));
        myDeck.remove(randromCard);
        System.out.println("Quedan " + myDeck.size() + " cartas.");

    }

    public static void hand() {

        for (int i = 0; i < 5; i++) {
            
            System.out.println("Carta" + (i + 1) + " " + myDeck.get(i));
        }
        for (int i = 0; i < 5; i++) {
            myDeck.remove(i);
        }

        System.out.println("Quedan " + myDeck.size() + " cartas.");

    }

}
