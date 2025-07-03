package de.schlaukopf.personen;

/**
 * <pre>
 *     Ein Naturphilosoph ist ein Philosoph, damit auch ein Schlaukopf.
 *
 *     Im Forum werden Objekte gebraucht: Diese Klasse soll konkret sein:
 *     nicht abstrakt und instanziierbar new NaturPhilosoph();
 *     Darf KEINE abstrakte Methode enthalten
 * </pre>
 */
public class NaturPhilosoph extends Philosoph{

    /**
     * ruft implizit oder oder explizit den Konstruktor der abstrakten Elternklasse auf
     */
    public NaturPhilosoph(){
        super(); //Ruft den Konstruktor von Philosoph auf
        jahreInEinsamkeit++;
    }

    /**
     * Abstrakte Methode aus dem Interface Schlaukopf.
     * Wurde in der Klasse Philosoph nicht überschrieben, muss deshalb hier überschrieben werden
     * @return das was der NaturPhilosoph weiß
     */
    @Override
    public String reden() {
        String wissen = "In den " + jahreInEinsamkeit + " Jahren der Einsamkeit habe ich beobachtet: " +
                "Der Apfel fällt immer nach unten...AUTSCH";
        return wissen;
    }

    /**
     * Abstrakte Methode aus der Philosoph.
     * Muss überschrieben werden.
     */
    @Override
    public void rauchen() {
        System.out.println("In der Natur raucht man ab und zu Pilze....");
    }

//    /**
//     * Konkrete Methode aus dem Interface Schlaukopf (dort default)
//     * kann überschrieben werden, muss sie aber nicht.
//     */
//    @Override
//    public void denken() {
//        System.out.println("Äpfel...überall Äpfel...");
//    }

    /**
     * Nur ein NaturPhilosoph kann beobachten.
     * Nur der Referenztyp NaturPhilosoph kann diese Methode beauftragen.
     */
    public void beobachten(){
        System.out.println("Warten auf die reifen Äpfel....");
        jahreInEinsamkeit++;
    }
}
