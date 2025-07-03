package de.schlaukopf.uebung.metropolis.klassen;

import de.schlaukopf.uebung.metropolis.exceptions.NichtVollGetanktException;
import de.schlaukopf.uebung.metropolis.interfaces.Flieger;

import java.util.Random;

public class Batwing implements Flieger {
    // private Superman supermanInstance;
    // public void setSupermanInstance(Superman supermanInstance) { this.supermanInstance = supermanInstance; }
    private Random random = new Random();
    @Override
    public void starten() throws NichtVollGetanktException {
        if (random.nextInt(100) < 40) { // 40% شانس سوخت کم
            throw new NichtVollGetanktException("Batwing hat nicht genug Treibstoff!");
        }
        System.out.println("Batwing hebt mit Style ab!");
    }

    @Override
    public void landen() {
        System.out.println("Batwing landet elegant.");
    }

    public void vestecken(){
        System.out.println("Batwing verschwindet im Schatten");
    }
}
