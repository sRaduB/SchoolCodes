import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args){
        Autore garga = new Autore("Cristian", "Gargano", LocalDate.of(2006, Month.OCTOBER, 29));
        Autore manna = new Autore("Matteo", "Mannarino", LocalDate.of(2007, Month.OCTOBER, 13));

        Cd nduja = new Cd("nduja", garga, 12, 68.6);
        Cd kalabria = new Cd("Kalabria", manna, 20, 76.2);

        CdTeca teca1 = new CdTeca();
        CdTeca.aggiungiCd(nduja);
        CdTeca.aggiungiCd(kalabria);

        // System.out.println(nduja.toString() + "\n");
        // System.out.println(kalabria.toString());

        System.out.println(teca1.durataTotale());
    }
}
