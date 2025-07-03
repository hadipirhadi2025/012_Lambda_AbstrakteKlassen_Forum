package de.schlaukopf.uebung.imgarten.objects;

/**
 * Eine konkrete Klasse, die von Bagger erbt und die graben()-Methode implementiert.
 */
public class Minibagger extends Bagger{
    public Minibagger(String modell) {
        super(modell);
    }

    @Override
    public String graben(double flaechenGroesse, double tiefe) {
        return "Minibagger " + modell + " hat " + flaechenGroesse +
                " qm umgegraben und " + tiefe +" m tiefer gegangen" +". Ich hätte jetzt gerne eine große Portion Eis!";
    }

    public void kettePruefen() {
        System.out.println(modell + " Ketten werden überprüft.");
    }
}
