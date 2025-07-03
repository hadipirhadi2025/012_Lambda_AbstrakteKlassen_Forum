package de.schlaukopf.foren;

import de.schlaukopf.organisation.Schlaukopf;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     Das Schlaukopfforum nimmt schlaue Köpfe auf und ordnet ihnen einen Nickname zu.
 *
 *     Es startet die Diskussion aller aufgenommenen Schlauköpfe.
 *
 *    Und es regt die schlauen Köpfe zum Nachdenken an
 * </pre>
 */
public class SchlaukopfForum {

    //private List<Schlaukopf> alleSchlauenLeute = new ArrayList<>();
    /**
     * Key: ist ein Objekt vom Tyo Schlaukopf, amöglich ist jeder Typ, der das SchlaukopfInterface implementiert.
     * Value: ist ein String für den Nickname
     */
    private Map<Schlaukopf,String> schlaueKoepfe = new HashMap<>();

    public void aufnehmen(Schlaukopf schlauerKopf, String nick){
        schlaueKoepfe.put(schlauerKopf,nick);
        System.out.println(nick + ", ein schlauer Kopf betritt das Forum");
    }

    /**
     * Alle schlauen Köpfe diskutieren: Schleife über Attribut schlaueKoepfe
     * jeder von denen redet
     * schlaueKoepfe.get(genie) : liefert zum Schlüssel vom Datentyp Schlaukopf den Nickname mit Datentyp String
     */
    public void alleDiskutieren(){
        System.out.println("\nHören wir zu, was die schlauen Köpfe zu sagen haben:\n");

        for(Schlaukopf genie: schlaueKoepfe.keySet()){
            System.out.println(schlaueKoepfe.get(genie) + " sagt: " + genie.reden() +"\n");
        }
    }

    /**
     * SChleife über alle schlauen Köpfe, jeder von denen soll denken.
     * genie.denken(); default Methode aus dem Interface: Sie kann überschreiben werden, muss sie aber nicht
     */
    public void alleDenken(){
        System.out.println("Über das Gehörte muss nachgedacht werden:\n");
        for(Schlaukopf genie : schlaueKoepfe.keySet()){
            System.out.println("\n____________" + schlaueKoepfe.get(genie) + "___________________________");
            System.out.println("Ich kann denken, denn ich bin vom Typ: " + genie.getClass().getName());
            genie.denken();
            System.out.println("________________________________________________________________");
        }
    }
}
