public class Main{
    public static void main(String[] args){
        Tapparella t1 = new Tapparella(180.5, 150,5);

        t1.impostaPosizione(20);

        System.out.println(t1.toString());

        t1.OCPosizione();

        System.out.println(t1.toString());

        t1.OCPosizione();

        System.out.println(t1.toString());
    }
}