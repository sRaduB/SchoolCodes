import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente();
        s1.nome = "pippo";
        s1.cognome = "pippo";
        System.out.print(s1.toString());

        Studente s2 = new Studente("pluto", "pluto",  "4c2", LocalDate.parse("2007-04-01"));
        System.out.print(s2);
    }
}
