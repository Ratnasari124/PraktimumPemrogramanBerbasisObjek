public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int TARIF_SKS = 30000;

    Dosen(String nip, String nama, String alamat, int jumlahSKS){
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
    }
    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public int getGaji(){
        return jumlahSKS * TARIF_SKS;
    }
}