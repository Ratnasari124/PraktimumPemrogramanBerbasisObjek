public class Mobil{
    private String merk;
    private int biaya;

    //Konstruktor kosong
    public Mobil(){

    }
    //Konstruktor Berisi
    public Mobil(String merk, int biaya){
        this.merk = merk;
        this.biaya = biaya;
    }
    //getter merk
    public String getMerk() {
        return merk;
    }
    //setter merk
    public void setMerk(String merk) {
        this.merk = merk;
    }
    //getter Biaya
    public double getBiaya() {
        return biaya;
    }
    //setter Biaya
    public void setBiaya(int biaya ) {
        this.biaya = biaya;
    }
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}