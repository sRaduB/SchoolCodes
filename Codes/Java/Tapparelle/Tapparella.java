public class Tapparella{
    private double h;
    private double l;
    private double posizione;

    public Tapparella(double h, double l){
        this.h = h;
        this.l = l;
        this.posizione = 0;
    }

    public double getH(){
        return this.h;
    }
    public double getL(){
        return this.l;
    }
    public double getPosizione(){
        return this.posizione;
    }

    public void setH(double h){
        this.h = h;
    }
    public void setL(double l){
        this.l = l;
    }
    public void setPosizione(double posizione){
        this.posizione = posizione;
    }

    public void impostaPosizione(double posizione){
        if(posizione < 0 || posizione > 100){
            System.out.println("inserire un valore valido!");
        }
        else{
            setPosizione(posizione);
        }
    }

    public void OCPosizione(){
        if(getPosizione() != 100){
            setPosizione(100);
        }
        else{
            setPosizione(0);
        }
    }

    public void toString(){
        return "l'apertura della tapparella è a:\t" + getPosizione();
    }
}