package de.schlaukopf.uebung.metropolis.interfaces;

/**
 * Interface Weltretter.
 * Definiert das Verhalten eines Objekts, das die Welt retten kann.
 */
public interface Weltretter {
    void retteWelt(String gefahr);
    int getAnzahlGeretteterWelten();
}
