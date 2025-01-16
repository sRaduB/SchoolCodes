public class Cd {
    private String titolo;
    private Autore autore;
    private int numeroBrani;
    private double durata;

    public Cd(String titolo, Autore autore, int numeroBrani, double durata){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = numeroBrani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }
    public Autore getAutore() {
        return autore;
    }
    public int getNumeroBrani() {
        return numeroBrani;
    }
    public double getDurata() {
        return durata;
    }
    
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public void setAutore(Autore autore) {        
        this.autore = autore;
    }
    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }
    public void setDurata(double durata) {
        this.durata = durata;
    }

    public String toString(){
        return "titolo: " + this.titolo + "\n" + this.autore + "numero di brani: " + this.numeroBrani + "\ndurata: " + this.durata;
    }
}
