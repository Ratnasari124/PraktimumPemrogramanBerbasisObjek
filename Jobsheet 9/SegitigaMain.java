public class SegitigaMain{
    public static void main(String[]args){
        Segitiga sgt = new Segitiga();

        System.out.println("=========================================");
        System.out.println("---AYO MENGHITUNG BAGIAN DARI SEGITIGA---");
        System.out.println("=========================================\n");
        System.out.println("---MENGHITUNG SUDUT---");
        System.out.println("Sudut A = 60\nTotal sudut : " +sgt.totalSudut(60));
        System.out.println("----------------------");
        System.out.println("Sudut A = 70\nSudut B = 30\nTotal sudut : " +sgt.totalSudut(70, 30));
        System.out.println("---MENGHITUNG KELILING---");
        System.out.println("Keliling segitiga dengan sisi 4, 6 dan 8 : "+sgt.keliling(4, 6, 8));
         System.out.println("------------------------");
        System.out.println("Keliling segitiga dengan sisi 4 dan 6: "+sgt.keliling(4, 6));
    }
}