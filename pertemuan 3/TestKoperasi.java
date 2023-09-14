import java.util.Scanner;
public class TestKoperasi{
    public static void main (String[]args){
        //instansiansi class scanner
        Scanner ratna = new Scanner(System.in);

        int iangsur; //penambahan variabel input angsur (iangsur)

        AnggotaKoperasi donny = new AnggotaKoperasi("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000....");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000....");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        //Soal No 5
        //10% dari peminjaman 4000000 adalah 400000 maka saya coba dengan angka dibawahnya yaitu 200000
        System.out.println("\nMembayar Angsuran 200.000....");
        donny.angsur(200000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar Angsuran 3.000.000....");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        //Soal No 6
        System.out.print("Membayar Angsuran : "); 
        iangsur = ratna.nextInt(); //proses inputan data membayar angsuran
        donny.angsur(iangsur); //pemangilan method angsur yang nilai didalamnya didapatkan dari input nilai iangsur
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    }
}