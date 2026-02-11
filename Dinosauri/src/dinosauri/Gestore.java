/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.io.IOException;

/**
 *
 * @author pazzagli.angelica
 */
public class Gestore {
    private Mazzo mazzo;
    private Giocatore g1, g2;
    private String file;
    
    public Gestore(String csv) {
        this.file = csv;
        mazzo = new Mazzo();
    }
    
    public void readFile() throws IOException {
        this.mazzo = FileManager.readFile(file);
    }
    
    public void stampaMazzo(Mazzo m) {
        
    }
}
