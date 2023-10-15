public class TugasMain{
    public static void main (String[]args){
        System.out.println("======================================");
        System.out.println("SISTEM PENGAJIAN DOSEN DAN KEPEGAWAIAN");
        System.out.println("======================================");

        Dosen dosen1 = new Dosen("123", "Ratna", "Jalan Telaga", 8);
        Dosen dosen2 = new Dosen("456", "Zaviyana", "Jalan Sudirman", 5);

        DaftarGaji daftarGaji = new DaftarGaji(10);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        /*Perbaikan di sini: Panggil metode getGaji() pada objek Dosen
        System.out.println("DATA GAJI DOSEN");
        System.out.println("Gaji Dosen 1: " + dosen1.getGaji());
        System.out.println("Gaji Dosen 2: " + dosen2.getGaji());*/

        System.out.println("DATA NAMA DAN GAJI DOSEN");
        System.out.println("======================================");
        daftarGaji.printSemuaGaji();
        System.out.println("======================================");
    }
}