public class Pelanggan{
    //constructor default
    public Pelanggan(){

    }
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    //getter nama
    public String getNama() {
        return nama;
    }
    //setter merk
    public void setNama(String nama) {
        this.nama = nama;
    }
    //getter Biaya
    public double getHari() {
        return hari;
    }
    //setter Biaya
    public void setHari(int hari ) {
        this.hari = hari;
    }
    //getter mobil
    public Mobil getMobil(){
        return mobil;
    }
    //setter mobil
    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }
    //getter sopir
    public Sopir getSopir(){
        return sopir;
    }
    //setter sopir
    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) +
        sopir.hitungBiayaSopir(hari);
    }
}