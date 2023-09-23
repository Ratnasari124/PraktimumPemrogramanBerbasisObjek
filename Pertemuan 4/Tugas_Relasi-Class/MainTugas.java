public class MainTugas{
    public static void main(String[]args){
        Penumpang ratna = new Penumpang("12345", "Ratna");

        Gerbong gerbong1 = new Gerbong("A", 10);
        gerbong1.setPenumpang(ratna, 1);

        KeretaApi keretaApi = new KeretaApi("Penataran Dhoho", "Eksekutif", gerbong1, "08.15", "11.20");
        System.out.println(keretaApi.info());
        
        Penumpang seli = new Penumpang("12346", "Seli");
        gerbong1.setPenumpang(seli, 2);

        Penumpang riko = new Penumpang("12346", "Riko");
        gerbong1.setPenumpang(riko, 2);

        System.out.println("----------------------------");
        System.out.println("Daftar Penumpang : ");
        System.out.println("----------------------------");
        System.out.println(gerbong1.info());
    }
}