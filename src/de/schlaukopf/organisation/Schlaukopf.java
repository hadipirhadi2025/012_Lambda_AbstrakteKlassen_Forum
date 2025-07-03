package de.schlaukopf.organisation;

/**
 * <pre>
 *     In einem Forum gibt es jede Menge schlauer Leute:
 *     Deshalb soll jeder, der sich im Schlaukopf Forum äußern möchte, diese Interfacde
 *     implementieren.
 *
 *     Dieses Projekt hat den Schwerpunkt: Lambda Ausdrücke, deshalb soll dieses Interface als
 *     Lambda Ausdruck instanziiert werden können.
 *
 *     Lambda: genau eine abstrakte Methode : Funktionales Interface.
 *
 *     Funktionale Imterface: Annotation @FunctionalInterface
 *
 *     Schlaukopf schlaubi = .....;
 *     schlaubi.reden(); schlaubi.getClass(), schlaubi.toString,...
 *     Wunsch: schlaubi.denken();
 * </pre>
 */
@FunctionalInterface
public interface Schlaukopf {
    /**
     * Ein schlauer Kopf hat wichtiges zu sagen.
     * Das ist die Rückgabe dieser Methode
     * Jedes Objekt, das dieses Interface implementiert hat, erstellt seine eigenen Information die
     * dann hier zurück gegeben werden
     * Für Lambda-Syntax: Eine Methode ohne Parameter, mit Rückgabe
     * Diese Methode MUSS überschrieben werden, auch im Lambda Ausdruck
     * @return das, was der schlaue Kopf zu sagen hat.
     */
    String reden();


    /**
     * Was ist mit denken?
     * Konkrete Methoden habn einen Körper: {....}
     * Eine Methode im Interface kann konkret sein, wenn das Schlüsselwort default verwendet wird.
     * Diese Methode kann überschrieben werden, muss sie aber nicht
     * Im Lambda Ausdruck wird sie nicht überschrieben.
     */
    default void denken(){
        System.out.println("ICH HAB RECHT!");
    }

}
