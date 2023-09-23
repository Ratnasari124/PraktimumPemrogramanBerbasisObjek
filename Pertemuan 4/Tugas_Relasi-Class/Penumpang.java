public class Penumpang{
    private String ktp;
    private String nama;

    public Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    //getter ktp
    public String getKtp(){
        return ktp;
    }
    //setter ktp
    public void setKtp(String ktp){
        this.ktp = ktp;  
    }
    //getter nama
    public String getNama() {
        return nama;
    }
    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info(){
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}