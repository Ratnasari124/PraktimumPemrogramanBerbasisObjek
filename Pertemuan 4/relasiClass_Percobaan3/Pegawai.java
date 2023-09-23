public class Pegawai{
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    //getter nip
    public String getNip(){
        return nip;
    }
    //setter nip
    public void setNip(String nip){
        this.nip = nip;  
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
        String info ="";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}