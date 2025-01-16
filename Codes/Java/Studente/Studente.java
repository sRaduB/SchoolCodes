import java.time.LocalDate;

public class Studente{
    String nome;
    String cognome;
    String classe;
    LocalDate dataNascita;

    public Studente(){
        nome = "";
        cognome = "";
    }

    public Studente(String nome, String cognome, String classe, LocalDate dataNascita){ //Costruttore, stesso nome della classe.
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
        this.dataNascita = dataNascita; 
    }

    public String toString(){
        return "nome " + nome + " cognome " + cognome + " data di nascita " + dataNascita + " classe " + classe;
    }
}