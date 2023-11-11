public class MainTugas2{
    public static void main (String[]args){
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();

        Dosen dosen = new Dosen();
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.bernafas();
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}