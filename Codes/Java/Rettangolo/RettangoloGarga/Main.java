package es6compito;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 7);
        Punto p2 = new Punto(10, 1);
        Rettangolo ret = new Rettangolo(p1, p2);

        double diagonale = Math.floor(p1.distanza(p2) * 100) / 100;
        double perimetro = Math.floor(ret.perimetro() * 100) / 100;
        double area = Math.floor(ret.area() * 100) / 100;
        System.out.println("la diagonale è uguale a: " + diagonale);
        System.out.println("il perimetro è: " + perimetro);
        System.out.println("l'area è: " + area);
    }
}