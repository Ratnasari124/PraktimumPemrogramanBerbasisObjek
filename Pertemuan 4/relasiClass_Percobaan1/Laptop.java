public class Laptop{
    private String merk;
    private Processor proc;
    
    //konstruktor kosongan
    public Laptop(){

    }
    //konstruktor untuk class processor
    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    //getter merk
    public String getMerk(){
        return merk;
    }
    //setter merk
    public void setMerk(String merk){
        this.merk = merk;  
    }
    //getter processor
    public Processor getProcessor(){
        return proc;
    }
    //setter processor
    public void setProcessor(Processor proc){
        this.proc = proc;
    }
     public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}