public class Segitiga{
    private int sudut;
    private int keliling;
    private double c;

    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        // c = √(a^2) + √(b^2);
        c = Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
        return c;
    }
}