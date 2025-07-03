package de.schlaukopf.personen;

/**
 * <pre>
 *     Ein Naturphilosoph ist ein Philosof, damit auch ein Schaukopf
 *
 *     Im Forum werden Objekte gebraucht: Diese Klase soll konkret sein:
 *     nicht abstrakt und instanziierbar new NaurPhilosoph();
 *     Darf KEINE abstrakte Methode enthalten
 * </pre>
 */
public class NaturPhilosoph extends Philosoph{

    public NaturPhilosoph() {
        super();//Ruft den Konstruktor von Philosoph auf
        jahreInEinsamkeit++;
    }

    /**
     *
     */
    @Override
    public void rauchen() {
        System.out.println("In der Natur rauch man ab und zu Pilze....");
    }

    /**
     * Abstract Methode aus dem
     * @return
     */
    @Override
    public String redern() {
        String wissen = "In den " + jahreInEinsamkeit + " Jahren der Einsamkeit habe ich beobachtet: "+
                "Der Apfel fällt immer auch unten... AUTSCH";
        return wissen;
    }

    @Override
    public void denken() {
        super.denken();
    }
}
