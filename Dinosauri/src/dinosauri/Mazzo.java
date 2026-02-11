/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.util.ArrayList;

/**
 *
 * @author pazzagli.angelica
 */
public class Mazzo {
    private ArrayList<Carta> mazzo;
    
    public Mazzo() {
        mazzo = new ArrayList();
    }
    
    public void addCarta(Carta c) {
        if(c != null) {
            mazzo.add(c);
        }
    }
    
    public void removeCarta(Carta c) {
        if(c != null) {
            mazzo.remove(c);
        }
    }
    
    public Carta getPrima() {
        return mazzo.get(0);
    }
    
    public int calcolaPunti() {
        int punteggio = 0;
        for(Carta c : mazzo) {
            punteggio += c.getPunti();
        }
        return punteggio;
    }
    
    public void stampaMazzo(Mazzo mazzo) {
        /**for(Carta c : mazzo) {
            System.out.println(c.getColore());
        }*/
    }
}
