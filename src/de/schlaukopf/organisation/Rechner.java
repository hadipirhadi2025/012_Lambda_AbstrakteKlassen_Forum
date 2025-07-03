package de.schlaukopf.organisation;

/**
 * <pre>
 *     Ein Funktionales Interface, demonstriert, wie
 *     Lambda Ausdrücke aussehen, wenn die abstrakte Methode mehr
 *     als einen Parameter hat
 * </pre>
 */
@FunctionalInterface
public interface Rechner {
    /**
     * <pre>
     *     Verknüpft zwei double Werte.
     *     Gibt das Ergebnis der Verknüpfung zurück
     * </pre>
     * @param d1 der erste double Wert
     * @param d2 der zweite double Wert
     * @return Ergebnis der Verknüpfung
     */
    double berechnen(double d1, double d2);
}
