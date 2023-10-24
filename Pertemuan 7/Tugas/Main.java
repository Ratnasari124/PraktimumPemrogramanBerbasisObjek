public class Main{
    public static void main (String[]args){
        //Input data dan Menampilkan Leptop
        Leptop L = new Leptop("Asus", 5, 16, "i5", "Li-lon");
        System.out.println("================Data Leptop=====================");
        L.tampilLeptop();

        //Input data dan Menampilkan Pc
        Pc P = new Pc("Acer", 3, 8, "i3", 14);
        System.out.println("================Data PC=====================");
        P.tampilPc();

        //Input data dan Menampilkan Mac
        Mac m = new Mac("Asus", 5, 16, "i5", "Li-lon", "chip apple T2");
        System.out.println("================Data Mac=====================");
        m.tampilMac();

        //Input data dan Menampilkan Windows
        Windows w = new Windows("Asus", 5, 16, "i5", "Li-lon", "voice typing");
        System.out.println("================Data Windows=====================");
        w.tampilWindows();
    }
}