/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pazzagli.angelica
 */
public class Gestore{
    private Mazzo mazzo;
    private ArrayList<Carta> tavola;
    private Giocatore g1, g2;
    private String file;
    
    public Gestore(String csv) {
        this.file = csv;
        mazzo = new Mazzo();
        g1 = new Giocatore();
        g2 = new Giocatore();
        tavola = new ArrayList();
    }
    
    public void readFile() throws IOException {
        this.mazzo = FileManager.readFile(file);
    }
    
    public void distribuisci() {
        int i = 1;
        for(Carta c : mazzo.mazzo) {
            if(i % 2 != 0) {
                g1.addCarta(c, g1.mazzo);
            }
            else {
                g2.addCarta(c, g2.mazzo);
            }
            i++;
        }
    }
    
    public void checkTavola(Giocatore g) {
        if(!tavola.isEmpty()) {
            for(Carta c : tavola) {
                g.addCarta(c, g.mazzoPunti);
            }
            tavola = new ArrayList();
        }
    }
    
    public void svolgiPartita() {
        int i = 0;
        while(i < mazzo.getLunghezza() / 2) {
            i++;
            System.out.println("Mano n." + i);
            Carta c1 = g1.tiraCarta();
            Carta c2 = g2.tiraCarta();
            if(c1.getPunti() == c2.getPunti()) {
                tavola.add(c1);
                tavola.add(c2);
                System.out.println("Mano nulla.");
            }
            else if(c1.getPunti() > c2.getPunti()) {
                g1.addCarta(c1, g1.mazzoPunti);
                g1.addCarta(c2, g1.mazzoPunti);
                checkTavola(g1);
                System.out.println("Mano vinta dal Giocatore1.");
            }
            else {
                g2.addCarta(c1, g2.mazzoPunti);
                g2.addCarta(c2, g2.mazzoPunti);
                checkTavola(g2);
                System.out.println("Mano vinta dal Giocatore2.");
            }
            System.out.println("Punteggio Giocatore1: " + g1.calcolaPunti());
            System.out.println("Punteggio Giocatore2: " + g2.calcolaPunti() + "\n");
        }
        stampaVincitore();
    }
    
    public void stampaVincitore() {
        if(g1.calcolaPunti() == g2.calcolaPunti()) {
            System.out.println("Partita finita in pareggio! Con punteggio: " + g1.calcolaPunti());
        }
        else if(g1.calcolaPunti() > g2.calcolaPunti()) {
            System.out.println("Giocatore1 vince la partita! Con punteggio: " + g1.calcolaPunti());
        }
        else {
            System.out.println("Giocatore2 vince la partita! Con punteggio: " + g2.calcolaPunti());
        }
    }
}
