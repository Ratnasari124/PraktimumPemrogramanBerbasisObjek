public class barang{
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hargaJual;

    //untuk menambah nilai kode
    public void setKode(String newValue){
        kode = newValue;
    }
    //untuk menambah nilai nama barang
    public void setNamaBarang(String newValue){
        namaBarang = newValue;
    }
    //untuk menambah nilai harga dasar
    public int setHargaDasar(int newValue){
        hargaDasar = newValue;
        return hargaDasar;
    }
    //untuk menambah nilai diskon
    public float setDiskon(float newValue){
        diskon = newValue;
        return diskon;
    }
    //untuk menghitung harga jual
    public int hitungHargaJual(int hargaDasar, float diskon){
        hargaJual = (int)(hargaDasar-(diskon * hargaDasar));
        return hargaJual;
    }
    //untuk menampilkan data
    public void tampilData(){
        System.out.println("Kode Barang : "+ kode);
        System.out.println("Nama Barang : "+ namaBarang);
        System.out.println("Harga Dasar: "+hargaDasar);
        System.out.println("Harga Jual : " + hargaJual);
    }
}