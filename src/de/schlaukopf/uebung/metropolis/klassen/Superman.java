package de.schlaukopf.uebung.metropolis.klassen;

import de.schlaukopf.uebung.metropolis.exceptions.CapeVergessenException;
import de.schlaukopf.uebung.metropolis.interfaces.Flieger;

import java.util.Random;

public class Superman implements Flieger {
    private static int anzahlGeretteterWelten = 0;
    private Random random = new Random();

    @Override
    public void starten() throws CapeVergessenException {
        if (random.nextInt(100) < 30) { // 30% vergessen chance
            throw new CapeVergessenException("Superman hat sein Cape vergessen! Er kann nicht starten.");
        }
        System.out.println("Superman hebt ab! Schneller als eine Kanonenkugel!");
    }

    @Override
    public void landen() {
        System.out.println("Superman landet sicher");
    }

    public void weltRetten() {
        System.out.println("Superman rettet die Welt!");
    }

    public static int getAnzahlGeretteterWelten() {
        return anzahlGeretteterWelten;
    }
}
