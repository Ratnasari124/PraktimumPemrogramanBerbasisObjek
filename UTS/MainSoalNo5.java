public class MainSoalNo5{
    public static void main (String[]args){
        Penulis p = new Penulis();
        p.setNama("Tere Liye");
        p.setAlamat("Sumatra Selatan");
        Buku b = new Buku();
        b.setISBN("09-2345-134");
        b.setJudul("Pulang Pergi");
        b.setHarga(80000);
        b.setPenulis(p);

        //buat nampilin
        System.out.println("-----------------------Data Penulis-----------------------");
        System.out.println("Nama    : " + p.getNama());
        System.out.println("Alamat  : " + p.getAlamat());
        System.out.println();
        System.out.println("-----------------------------Data Buku-----------------------------");
        System.out.println("ISBN                            : " + b.getISBN());
        System.out.println("Judul                           : " + b.getJudul());
        System.out.println("Harga                           : " + b.getHarga());
        System.out.println("Data Penulis (Nama - Alamat)    : " + b.getPenulis().getNama() + " - " + b.getPenulis().getAlamat());

    }
}