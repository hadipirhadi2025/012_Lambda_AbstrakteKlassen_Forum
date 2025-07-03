package de.schlaukopf.uebung.metropolis.interfaces;

/**
 * Interface FlieWaTuet, das Flieger, Schwimmer und Fahrer kombiniert.
 * Ein Fantasiewesen, das fliegen, schwimmen und fahren kann.
 */
public interface FlieWaTuet extends Flieger, Schwimmer, Fahrer {
    void landen();

    /**
     * Eine zusätzliche Methode für das FlieWaTuet.
     * @return Eine Nachricht über das Tanken von Himbeersaft.
     */
    String himbeerSaftTanken();
}