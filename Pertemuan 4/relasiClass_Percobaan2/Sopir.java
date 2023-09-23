public class Sopir{
    private String nama;
    private int biaya;

    //Konstruktor Default
    public Sopir(){

    }
    public Sopir(String nama, int biaya){
        this.nama = nama;
        this.biaya = biaya;
    }
    //getter nama
    public String getNama() {
        return nama;
    }
    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //getter Biaya
    public double getBiaya() {
        return biaya;
    }
    //setter Biaya
    public void setBiaya(int biaya ) {
        this.biaya = biaya;
    }
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}