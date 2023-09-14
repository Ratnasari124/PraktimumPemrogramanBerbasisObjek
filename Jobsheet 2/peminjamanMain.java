public class peminjamanMain{
    public static void main(String[]args){
        peminjaman pmj = new peminjaman();
        pmj.setId(20);
        pmj.setNamaMember("Ratna");
        pmj.setNamaGame("Tamia");
        pmj.pinjam();
        System.out.println("Harga sewa gama : " + pmj.hargaPeminjaman(10000, 4));
    }
}