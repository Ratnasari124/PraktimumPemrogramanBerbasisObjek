public class peminjaman{
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    
    //untuk mengisi data nama member
    public void setNamaMember(String newValue){
        namaMember = newValue;
    }
    //untuk mengisi data nama game
    public void setNamaGame(String newValue){
        namaGame = newValue;
    }
    //untuk mengisi data id member
    public int setId(int newValue){
        id = newValue;
        return id;
    }
    //untuk menampilkan data peminjaman, tidak termasuk harga
    public void pinjam(){
        System.out.println("ID Member : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
    }
    //untuk nilai harga dari peminjaman 
    // dimana lama sewa saya buat per jam dan peminjaman hanya 1 game saja
    public int hargaPeminjaman(int hargaPinjam1, int lamaSewa){
        harga = hargaPinjam1 * lamaSewa;
        return harga;
    }
}