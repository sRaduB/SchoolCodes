public class point {

    private double x;
    private double y;

    public point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public point(){
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
}
