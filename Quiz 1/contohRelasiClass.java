class Kategori {
    String nama;
    
    Kategori(String nama) {
        this.nama = nama;
    }
}

class Barang {
    String namaBarang;

    Barang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    void kategoriBarang(Kategori kategori) {
        System.out.println(kategori.nama + " ditambahkan ke proyek " + namaBarang);
    }
}