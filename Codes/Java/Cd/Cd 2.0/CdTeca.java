import java.util.ArrayList;

public class CdTeca {
    private Arraylist<Cd> cdTeca;

    public CdTeca(){
        this.cdTeca = new ArrayList<Cd>(2);
    }

    public ArrayList<Cd> getCdTeca(){
        return cdTeca;
    }

    public void setCdTeca(){
        this.cdTeca = cdTeca;
    }

    public void aggiungiCd(Cd cd){
        cdTeca.add(cd);
    }

    public void aggiungiCd(String titolo, Autore autore, int numeroBrani, double durata){
        cdTeca.add(new Cd(titolo, autore, numeroBrani, durata));
    }

    public int durataTotale(){
        int sum = 0;
        for (Cd cd : this.cdTeca) {
            sum += cd.durata;
        }
        return sum;
    }

    public int numeroBrani(){
        return 0;
    }

    public double durataMediaBrano(){
        return 0;
    }

    public double minCd(){
        return 0;
    }
}
