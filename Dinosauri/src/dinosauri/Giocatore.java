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
    protected Mazzo mazzo;
    protected Mazzo mazzoPunti;
    
    public Giocatore() {
        mazzo = new Mazzo();
        mazzoPunti = new Mazzo();
    }
    
    public void addCarta(Carta c, Mazzo m) {
        m.addCarta(c);
    }
    
    public Carta tiraCarta() {
            Carta c = mazzo.getPrima();
            System.out.println(c.getColore());
            mazzo.removeCarta(c);
            return c;
        
    }
    
    public int calcolaPunti() {
        return this.mazzoPunti.calcolaPunti();
    }
}
