public class MainPercobaan4{
    public static void main(String[]args){
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());

        Penumpang budi = new Penumpang("12346", "Budi");
        gerbong.setPenumpang(budi, 2);
        System.out.println(gerbong.info());

        Penumpang ratna = new Penumpang("12347", "Ratna");
        gerbong.setPenumpang(ratna, 2);
        System.out.println(gerbong.info());
    }
}