public class barangMain{
    public static void main(String[]args){
    barang brg = new barang();
    brg.setKode("BBg");
    brg.setNamaBarang("Boneka Bungga");
    brg.setHargaDasar(35000);
    brg.setDiskon(0.15f);
    brg.hitungHargaJual(35000, 0.15f);
    brg.tampilData();
    }
}