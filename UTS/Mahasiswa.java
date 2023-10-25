public class Mahasiswa{
    String nim, nama, alamat;
    char jenisKelamin;

    // a. Tambahkan constructor
    // Gunakan constructor untuk
    // mengisi atribut nim, nama, alamat, jenisKelamin
    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    public void tampilData(){
        System.out.println("NIM            = " + nim);
        System.out.println("Nama           = " + nama);
        System.out.println("Alamat         = " + alamat);
        System.out.println("Jenis Kelamin  = " + jenisKelamin);
    }
 
    public static void main(String[] args) {
    // b. Buat objek mahasiswa
    // Isi atribut nim, nama, alamat, jenisKelamin
    // lewat constructor
    Mahasiswa m = new Mahasiswa("224172007", "Ratnasari", "Malang", 'P');
    m.tampilData();
    }
}