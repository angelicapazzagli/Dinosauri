/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

/**
 *
 * @author pazzagli.angelica
 */
public class Giocatore {
    private Mazzo mazzo;
    private Mazzo mazzoPunti;
    
    public Giocatore() {
        mazzo = new Mazzo();
        mazzoPunti = new Mazzo();
    }
    
    public void addCarta(Carta c) {
        mazzo.addCarta(c);
    }
}
