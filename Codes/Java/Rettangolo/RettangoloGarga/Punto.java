package es6compito;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double distanza(Punto p1){
        return Math.sqrt((this.getX() - p1.getX())*(this.getX() - p1.getX()) + (this.getY() - p1.getY())*(this.getY() - p1.getY()));
    }

    public String toString(double distanza){
        return "distanza: " + distanza;
    }
}