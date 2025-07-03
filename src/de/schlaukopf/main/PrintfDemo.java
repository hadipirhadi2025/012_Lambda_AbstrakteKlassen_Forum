package de.schlaukopf.main;

/**
 * <pre>
 *     Demonstriert printf (PrintStream), format (String)
 *
 *     kleiner Ausflug, kein Bezug zu abstrakten Klassen oder Lambdas
 * </pre>
 */
public class PrintfDemo {
    public static void main(String[] args) {
        String[] sorten = {"Tomate", "Kiwi", "Aubergine"};
        double[] preise = {1.99, 1, 2.5};
        int[] bestellnummern = {1,405,22};

        for (int i = 0; i < sorten.length; i++) {
            System.out.println("Die Sorte " + sorten[i] + " kostet " + preise[i]
                + "€. Bestellnummer " + bestellnummern[i]);
        }
        for (int i = 0; i < sorten.length; i++) {
            System.out.printf("Sorte: %-10s | Preis %5.2f € | Bestellnummer: %4d\n",
                    sorten[i],preise[i], bestellnummern[i]);
        }



    }
}
