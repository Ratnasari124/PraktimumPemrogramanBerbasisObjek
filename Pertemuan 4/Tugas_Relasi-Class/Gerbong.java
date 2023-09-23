public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    Gerbong(){
    }
    Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    //getter kode
    public String getKode() {
        return kode;
    }
    //setter kode
    public void setKode(String kode) {
        this.kode = kode;
    }
    //getter arrayKursi
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        String info = "";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info() ;
        }
        return info;
    }
    public String infoKode(){
        String infoKode = "";
        infoKode += "Kode " + kode;
        return infoKode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if(this.arrayKursi[nomor-1].getPenumpang() == null){
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }else{
            System.out.println("Mohon maaf kursi sudah terisi!!!");
            System.out.println("Silahkan pilih kursi lain!!!");
        }
        
    }

}