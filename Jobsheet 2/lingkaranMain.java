public class lingkaranMain{
    public static void main(String[]args){
        lingkaran lkg = new lingkaran();
        lkg.setPhi(3.14);
        lkg.setr(7);
        lkg.tampilLkg();
        System.out.println("Luas Lingkaran : " + lkg.hitungLuas(3.14, 7));
        System.out.println("Keliling Lingkaran : " + lkg.hitungKeliling(3.14, 7));
    }
}