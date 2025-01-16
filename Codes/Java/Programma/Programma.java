public class Programma{
    private String nome;
    private String produttore;
    private double version;
    private String sistOp;
    private int anno;

    public Programma(String nome, String produttore, double version, String sistOp, int anno){
        this.nome = nome;
        this.produttore = produttore;
        this.version = version;
        this.sistOp = sistOp;
        this.anno = anno; 
    }

    public String getName(){
        return nome;
    }
    public String getProduttore(){
        return produttore;
    }
    public double getVersion(){
        return version;
    }
    public String getSistOp(){
        return sistOp;
    }
    public int getAnno(){
        return anno;
    }

    public void setName(String nome){
        this.nome = nome;
    }
    public void setProduttore(String produttore){
        this.produttore = produttore;
    }
    public void setVersion(double version){
        this.version = version;
    }
    public void setSistOp(String sistOp){
        this.sistOp = sistOp;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }

    public String toString(){
        return nome + "\n" + produttore + "\n" + version + "\n" + sistOp + "\n" + anno;
    }

    public int compareAnno(Programma prog){
        return this.anno - prog.getAnno();
    }

    public static void main(String[] args){
        Programma photoshop = new Programma("photoshop", "adobe", 24.2, "windows", 2024);
        Programma vscode = new Programma( "Visual Studio Code", "Microsoft", 22.1, "windows", 2022);
        System.out.println(photoshop.toString() + "\n");
        System.out.println(vscode.toString());
        if(photoshop.compareAnno(vscode) > 0){
            System.out.println(vscode.getName() + " è meno recente di " + photoshop.getName());
        }
        else if(photoshop.compareAnno(vscode) < 0){
            System.out.println(vscode.getName() + " è più recente di " + photoshop.getName());
        }
        else{
            System.out.println("i due programmi sono dello stesso anno");
        }
    }
}
