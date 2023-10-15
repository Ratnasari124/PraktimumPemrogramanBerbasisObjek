public class Main{
    public static void main(String[]args){
        PersegiPanjang pp = new PersegiPanjang(8, 4);
        Lingkaran lkg = new Lingkaran(5);
        Segitiga sgt = new Segitiga(6, 8);

        System.out.println("======================================");
        System.out.println("\tPersegi Panjang");
        System.out.println("======================================");
        System.out.println("Luas Persegi Panjang: " + pp.luas());
        System.out.println("Keliling Persegi Panjang: " + pp.keliling());
        System.out.println("======================================");

        System.out.println("======================================");
        System.out.println("\tLingkaran");
        System.out.println("======================================");
        System.out.println("Luas Lingkaran: " + lkg.luas());
        System.out.println("Keliling Lingkaran: " + lkg.keliling());
        System.out.println("======================================");

        System.out.println("======================================");
        System.out.println("\tSegitiga");
        System.out.println("======================================");
        System.out.println("Luas Segitiga: " + sgt.luas());
        System.out.println("Keliling Segitiga: " + sgt.keliling());
        System.out.println("======================================");
    }
}