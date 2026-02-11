/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pazzagli.angelica
 */
public class FileManager {
    public static Mazzo readFile(String file) throws FileNotFoundException, IOException {
        Mazzo mazzo = new Mazzo();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                String colore = line;
                Carta c;
                if("Giallo".equals(colore)) {
                    c = new Carta(Colore.Giallo);
                }
                else if("Verde".equals(colore)) {
                    c = new Carta(Colore.Verde);
                }
                else {
                    c = new Carta(Colore.Rosso);
                }
                mazzo.addCarta(c);
            }
        }
        return mazzo;
    }
}
