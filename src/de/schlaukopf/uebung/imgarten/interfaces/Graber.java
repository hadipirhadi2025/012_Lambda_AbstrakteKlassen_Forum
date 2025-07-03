package de.schlaukopf.uebung.imgarten.interfaces;

/**
 * <pre>
 * Ein funktionales Interface, das die Fähigkeit zum Graben definiert.
 *
 * Da es genau eine abstrakte Methode hat, kann dieses Interface
 * mit einem Lambda-Ausdruck implementiert werden.
 *
 * @author Hadi
 * </pre>
 */
@FunctionalInterface
public interface Graber {
    /**
     * Definiert die Aktion des Grabens.
     *
     * @param flaechenGroesse Die Größe der umzugrabenden Fläche (z.B. in Quadratmetern).
     * @param tiefe Die Tiefe, in der gegraben werden soll (z.B. in Metern).
     * @return Eine Nachricht, die beschreibt, was gegraben wurde oder wie der Vorgang verlief.
     */
    String graben(double flaechenGroesse, double tiefe);

}
