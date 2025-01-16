public class Main {
    public static void main(String[] args){
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(6, 5);
        Rettangolo r1 = new Rettangolo(p1, p2);
        
        System.out.println(r1.area());
        System.out.println(r1.perimetro());
        System.out.println(r1.diagonale());
    }
}
