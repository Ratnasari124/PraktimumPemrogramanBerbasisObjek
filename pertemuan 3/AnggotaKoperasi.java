public class AnggotaKoperasi{
    private String nama;
    private String nomorKtp;
    private int limitPeminjaman;
    private int pinjaman;

    AnggotaKoperasi(String nomorKtp, String nama, int limitPeminjaman){
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.pinjaman = 0;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNomorKtp(String nomorKtp){
        this.nomorKtp = nomorKtp;
    }
    public int pinjaman(){
        return pinjaman;
    }
    public int getLimitPinjaman(){
        return limitPeminjaman;
    }
    public String getNama(){
        return nama;
    }
    public int getJumlahPinjaman(){
        if(pinjaman <= limitPeminjaman){
             pinjaman = 0 + pinjaman;
        }else if(pinjaman >= limitPeminjaman){
            pinjaman = 0;
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }else{

        }
        return pinjaman;
    }
    public int angsur(int uang){
        //mencari nilai angsuran yang harus 
        //dibayar dengan minimal pembayaran 10% dari peminjaman
        //menggunakan rumus limitPeminjaman * 10% 
        //yang hasilnya merupakan minimal pembayaran angsuran
        float angsuran = (limitPeminjaman * 0.10f);
        //jika uang angsuran kurang dari angsuran minimum yaitu 10% 
        //akan mucul pesan dan tidak ada pengurangan angsuran
        if(uang <= angsuran){  
            System.out.println("Maaf, angsuran harus 10% dari jumlah peminjaman.");
        }else{ // jika nominal angsuran sesuai(10% atau lebih dari pinjman) maka pinjaman akan berkurang
             pinjaman -=uang;
        }
        return pinjaman;
    }
    public void pinjam(int uang){
        pinjaman +=uang;
    }
}