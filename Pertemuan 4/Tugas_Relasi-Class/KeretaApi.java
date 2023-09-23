public class KeretaApi{
    private String nama;
    private String kelas;
    private String jamBerangkat;
    private String jamSampai;
    private Gerbong gerbong;

    public KeretaApi(String nama, String kelas, Gerbong gerbong, String jamBerangkat, String jamSampai){
        this.nama = nama;
        this.kelas = kelas;
        this.gerbong = gerbong;
        this.jamBerangkat = jamBerangkat;
        this.jamSampai = jamSampai;
    }
    
    //getter nama
    public String getNama(){
        return nama;
    }
    //setter nama
    public void setNama(String nama){
        this.nama = nama;  
    }
    //getter kelas
    public String getKelas(){
        return kelas;
    }
    //setter kelas
    public void setKelas(String kelas){
        this.kelas = kelas;  
    }
    //getter jam berangkat
    public String getBerangkat(){
        return jamBerangkat;
    }
    //setter jam berangkat
    public void setBerangkat(String jamBerangkat){
        this.jamBerangkat = jamBerangkat;
    }
    //getter jam Sampai
    public String getSampai(){
        return jamSampai;
    }
    //setter jam Sampai
    public void setSampai(String jamSampai){
        this.jamSampai = jamSampai;
    }
    //getter gerbong
    public Gerbong getGerbong() {
        return gerbong;
    }  
    //setter gerbong
    public void setGerbong(Gerbong gerbong){
        this.gerbong = gerbong;
    }
    public String info(){
        System.out.println("-----------------------------------");
        System.out.println("--SELAMAT DATANG DI KAI INDONESIA--");
        System.out.println("-----------------------------------");
        System.out.println("");
        String info ="";
        info += "Nama Kereta Api: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Kode Gerbong: " + this.gerbong.infoKode() + "\n";
        info += "Jam Berangkat: " + this.jamBerangkat + "\n";
        info += "Jam Sampai Tujuan: " + this.jamSampai + "\n";
        return info;
    }

}