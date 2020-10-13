/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.List;

/**
 *
 * @author melissa.a.lopez
 */
public class Card {

    public String palo;
    public String color;
    public String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

   
    @Override
    public String toString() {
        return "Card{" + "palo=" + palo + ", color=" + color + ", valor=" + valor + '}';
    }

}
