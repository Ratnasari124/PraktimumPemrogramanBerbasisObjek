public class Processor{
    private String merk;
    private double cache;
    
    //konstruktor kosongan
    public Processor() {
    
    }
    //konstruktor berisi
    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }
    //getter merk
    public String getMerk() {
        return merk;
    }
    //setter merk
    public void setMerk(String merk) {
        this.merk = merk;
    }
    //getter cache
    public double getCache() {
        return cache;
    }
    //setter cache
    public void setCache(double cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}