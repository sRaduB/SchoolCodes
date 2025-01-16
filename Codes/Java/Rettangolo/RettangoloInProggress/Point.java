public class Point {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public double distanza(Punto p1){
        return Math.sqrt((this.getX() - p1.getX())*(this.getX() - p1.getX()) + (this.getY() - p1.getY())*(this.getY() - p1.getY()));
    }
}
