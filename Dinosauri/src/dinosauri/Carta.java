/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

/**
 *
 * @author pazzagli.angelica
 */
public class Carta {
    private Colore colore;
    private int punti;
    
    public Carta(Colore c) {
        this.colore = c;
        switch (colore) {
            case Giallo:
                punti = 1;
                break;
            case Verde:
                punti = 3;
                break;
            default:
                punti = 5;
                break;
        }
    }
    
    public Colore getColore() {
        return colore;
    }
    
    public int getPunti() {
        return punti;
    }
}
