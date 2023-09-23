public class KeretaApi{
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
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
    //getter masinis
    public Pegawai getMasinis(){
        return masinis;
    }
    //setter masinis
    public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }
    //getter asisten
    public Pegawai getAsisten(){
        return asisten;
    }
    //setter asisten
    public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }

    public String info(){
        String info ="";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        //info += "Asisten: " + this.asisten.info() + "\n";
        if(this.asisten != null){
            info += "Asisten: " + this.asisten.info() + "\n";
        }
        return info;
    }
}