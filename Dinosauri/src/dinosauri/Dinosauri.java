/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dinosauri;

import java.io.IOException;

/**
 *
 * @author pazzagli.angelica
 */
public class Dinosauri {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Gestore g = new Gestore("mazzo.txt");
        
        g.readFile();
        g.distribuisci();
        g.svolgiPartita();
    }
    
}
