public class Angolo {
    private int g = 0;
    private int p = 0;
    private int s = 0;

    public Angolo(int g, int p, int s){
        this.g = g;
        this.p = p;
        this.s = s;
    }

    public int getg(){
        return g;
    }
    public int getp(){
        return p;
    }
    public int gets(){
        return s;
    }

    public void setg(int g){
        this.g = g;
    }
    public void setp(int p){
        this.p = p;
    }
    public void sets(int s){
        this.s = s;
    }

    static void visualizzaAngolo(Angolo a){
        System.out.println(a.g + "g " + a.p + "p " + a.s + "s ");
    }

    public void aggiungiGradi(int n){
        g = g + n;
    }
    public void aggiungiPrimi(int n){
        p = p + n;
    }
    public void aggiungiSecondi(int n){
        s = s + n;
    }
    
    static int angoloSecondi(Angolo a){
        return ((a.g*60)+a.p)*60+a.s;
    }

    public void secondiAngolo(int sTemp){
        int pTemp = 0;
        int gTemp = 0;
        while(sTemp > 59){
            sTemp -= 60;
            pTemp++;
        }
        while(pTemp > 59){
            pTemp -= 60;
            gTemp++;
        }
        s = sTemp;
        p = pTemp;
        g = gTemp;
    }

    public void sommaAngolo(Angolo a2){
        int sa1 = ((g*60)+p)*60+s;
        int sa2 = ((a2.g*60)+a2.p)*60+a2.s;

        sa1 = sa1 + sa2;

        int sTemp = sa1;
        int pTemp = 0;
        int gTemp = 0;

        while(sTemp > 59){
            sTemp -= 60;
            pTemp++;
        }
        while(pTemp > 59){
            pTemp -= 60;
            gTemp++;
        }

        s = sTemp;
        p = pTemp;
        g = gTemp;

    }

    public static void main(String[] args){
        Angolo a1 = new Angolo(23, 22, 21);
        Angolo a2 = new Angolo(0, 0, 0);

        visualizzaAngolo(a1);

        a1.aggiungiGradi(20);
        visualizzaAngolo(a1);

        a1.aggiungiPrimi(20);
        visualizzaAngolo(a1);

        a1.aggiungiSecondi(20);
        visualizzaAngolo(a1);

        System.out.println("l'angolo equivale adesso a :  " + angoloSecondi(a1) + "s");
        a2.secondiAngolo(7999);

        visualizzaAngolo(a2);
        System.out.println("l'angolo equivale adesso a :  " + angoloSecondi(a2) + "s");

        System.out.println("la differenza tra i due angoli equivale a " + (angoloSecondi(a1) - angoloSecondi(a2)) + "s");

        a1.sommaAngolo(a2);
        visualizzaAngolo(a1);
    }
}