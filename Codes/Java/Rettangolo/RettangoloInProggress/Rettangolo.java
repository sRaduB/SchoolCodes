public class Rettangolo{
    private Point p1;
    private Point p2;

    public Rettangolo(double x1, double y1, double x2, double y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Rettangolo(){
        this.p1 = new Point();
        this.p2 = new Point();
    }

    public Rettangolo(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double area(){
        
    }
    public double perimetro(){
        return (this.y2 - this.y1) * 2 + (this.x2 - this.x1) * 2;
    }
    public double diagonale(){
        return Math.sqrt((this.y2 - this.y1) * (this.y2 - this.y1) + (this.x2 - this.x1) * (this.x2 - this.x1));
    }
}