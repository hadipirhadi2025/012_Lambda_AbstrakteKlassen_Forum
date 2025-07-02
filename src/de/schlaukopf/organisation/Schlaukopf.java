package de.schlaukopf.organisation;

/**
 * <pre>
 *     In einem Forum gibt es jede Menge schlauer Leute:
 *     Deshalb soll jeder, der sich im Schlaukopf Forum äußern möchte, diese Interface Implementieren.
 *
 *     Diese Projekt hat den Schwerpunkt: Lamba Ausdrücke, deshalb soll dieses Interface als
 *     Lambda Ausdruck instantiate werden können.
 *
 *     Lambda: genau eine abstrakte Methode: Funktionales Interface
 *
 *     Funktionale Interface: Annotation @FunktionalInterface
 *
 *     Schlaukopf schlaubi = ...;
 *     schlaubi.reden(); schlaubi.getclass(), schlaubi.tostring, .... *
 *     Wunsch: schlaubi.denken();
 * </pre>
 */
public interface Schlaukopf {
    /**
     * Ein schlauer Kopf hat wichtiges u sagen.
     * Das ist die Rückgaebe dieser Methode
     * jedes Objekt , das dieses Interface implementiert hat, erstellt seine eigene Information, die
     * dann die zurückgegeben werden
     * Für Lambda-Syntax: Eine Methode ohne Parameter, mit Rückgabe
     *
     * @return das, was der schlaue Kopf zu sagen hat.
     */
    String redern();

    /**
     * Was ist mit denken?
     */
}
