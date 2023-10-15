public class DaftarGaji{
    private Pegawai[] listpegawai;
    private int jumlahPegawai;

    DaftarGaji(int maxPegawai) {
        listpegawai = new Pegawai[maxPegawai];
        jumlahPegawai = 0;
    }
    public void addPegawai(Pegawai pegawai){
        if (jumlahPegawai < listpegawai.length) {
            listpegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Daftar gaji sudah penuh");
        }
    }
    public int daftarGaji(int index) {
        if (index >= 0 && index < jumlahPegawai) {
            return listpegawai[index].getGaji();
        } else {
            System.out.println("Index pegawai tidak valid");
            return -1;
        }
    }
    public void printSemuaGaji(){
        for (int i = 0; i < jumlahPegawai; i++) {
            if (listpegawai[i] != null) {
            System.out.println("--------------------------------------");
            System.out.println("Nama Pegawai: " + listpegawai[i].getNama());
            System.out.println("Gaji: " + listpegawai[i].getGaji());
            System.out.println("--------------------------------------");
            System.out.println();
        }
        }
    }
}