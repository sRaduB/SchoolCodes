import java.time.LocalDate;

public class Autore {
    private String nome;
    private String cognome;
    private LocalDate bDay;

    public Autore(String nome, String cognome, LocalDate bDay){
        this.nome = nome;
        this.cognome = cognome;
        this.bDay = bDay;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public LocalDate getbDay() {
        return bDay;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setbDay(LocalDate bDay) {
        this.bDay = bDay;
    }

    public String toString() {
        return "nome: " + this.nome + "\ncognome: " + this.cognome + "\ndata di nascita: " + this.bDay + "\n";
    }
}