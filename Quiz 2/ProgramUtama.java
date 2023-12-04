public class ProgramUtama {
    public static void main(String[] args) {
        // Program Utama
        // Buat beberapa objek mahasiswa dan mata kuliah
        Mahasiswa mahasiswa1 = new Mahasiswa("Ratnasari", "2241720007", 90);
        Mahasiswa mahasiswa2 = new Mahasiswa("Seli", "2241780101", 85);

        MataKuliah matakuliah1 = new MataKuliah("Praktikum Pemrograman Berbasis Objek", 3, 90);
        MataKuliah matakuliah2 = new MataKuliah("Teori Pemrograman Berbasis Objek", 4, 85);

        // Simulasikan proses perwalian
        Perwalian perwalian = new Perwalian();
        perwalian.tambahMahasiswa(mahasiswa1);
        perwalian.tambahMahasiswa(mahasiswa2);
        perwalian.tambahMataKuliah(matakuliah1);
        perwalian.tambahMataKuliah(matakuliah2);

        // Cetak hasil perwalian
        perwalian.cetakDataPerwalian();
    }
}