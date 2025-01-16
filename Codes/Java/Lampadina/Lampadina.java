import java.security.Principal;

public class Lampadina {
    private boolean on;
    private boolean broke;
    private int usage;

    public Lampadina(boolean on, boolean broke, int usage){
        this.on = on;
        this.broke = broke;
        this.usage = usage;
    }
    public boolean getOn(){
        return on;
    }
    public boolean getBroke(){
        return broke;
    }
    public int getUsage() {
        return usage;   
    }

    public void setOn(boolean on){
       this.on = on;
    }
    public void setBroke(boolean broke){
        this.broke = broke;
    }
     public void setUsage(int usage){
        this.usage = usage;
    }

    public void check(){
        if(usage <= 0){
            this.broke = true;
        }
    }

    public String stato(){

        check();

        String out;
        
        if(this.broke == true){
            out = "la lampadina e' rotta";
        }
        else if(this.on == true){
            out = "la lampadina e' accesa";
        }
        else{
            out = "la lampadina e' spenta";
        }
        return out;
    }

    public void click(){
        if(this.on == true){
            this.on = false;
        }
        else{
            this.on = true;
        }
        this.usage = this.usage - 1;
    }

    public static void main(String[] args){
        Lampadina l1 = new Lampadina(false, false, 4);

        System.out.println(l1.stato());
        l1.click();
        System.out.println(l1.stato());
        l1.click();
        System.out.println(l1.stato());
        l1.click();
        System.out.println(l1.stato());
        l1.click();
        System.out.println(l1.stato());
        l1.click();
        System.out.println(l1.stato());
        l1.click();
        System.out.println(l1.stato());
    }
}