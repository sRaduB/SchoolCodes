package es6compito;

public class Rettangolo {
    private Punto p1;
    private Punto p2;

    public Rettangolo(){
        this.p1 = new Punto();
        this.p2 = new Punto();
    }

    public Rettangolo(double xp1, double xp2, double yp1, double yp2){ 
        this.p1 = new Punto(xp1, yp1);
        this.p2 = new Punto(xp2, yp2);
    }

    public Rettangolo(Punto p, Punto pp){
        this.p1 = p;
        this.p2 = pp;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    double area(){
        Punto b = new Punto(p2.getX(), p1.getY());
        Punto h = new Punto(p1.getX(), p2.getY());
        return ((p1.distanza(b)) * (p1.distanza(h)));
    }

    double perimetro(){
        Punto b = new Punto(p2.getX(), p1.getY());
        Punto h = new Punto(p1.getX(), p2.getY());
        return 2 * ((p1.distanza(b)) + (p1.distanza(h)));
    }

    double diagonale(){
        return Math.sqrt(p1.distanza(p2));
    }
}