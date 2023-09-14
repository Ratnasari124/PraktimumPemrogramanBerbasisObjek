public class EncapTest{
    public static void main(String[]args){
        //inisialisasi untuk objek ke 1
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(38);

        System.out.println("Name : "+ encap.getName());
        System.out.println("Age : "+ encap.getAge());

        //inisialisasi untuk objek ke 2
        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Ratna");
        encap2.setAge(20);

        System.out.println("Name : "+ encap2.getName());
        System.out.println("Age : "+ encap2.getAge());
    }
}