public class lingkaran{
    public double phi;
    public double r;
    public double luas;
    public double keliling;

    //tambah nilai phi
    public double setPhi(double newValue){
        phi = newValue;
        return phi;
    }
    //tambah nilai r atau jari-jari
    public double setr(double newValue){
        r = newValue;
        return r;
    }
    //untuk manampilkan phi dan r
    public void tampilLkg(){
        System.out.println("Phi Lingkaran : " +phi);
        System.out.println("Jari-jari Lingkaran : " +r);
    }
    //untuk menghitung luas lingkaran
    public double hitungLuas(double phi,double r){
        luas = phi * r * r;
        return luas;
    }
    //untuk menghitung keliling lingkaran
    public double hitungKeliling(double phi, double r){
        keliling = 2 * phi * r;
        return keliling;
    }
}