public class Segitiga extends BangunDatar{
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public float luas(){
        return 0.5f * alas * tinggi;
    }
    //dikarenakan segitiga tidak mempunyai keliling(kecuali segitiga siku-siku)
    //sehingga diisi 0 saja
    public float keliling(){
        return 0;
    }
}