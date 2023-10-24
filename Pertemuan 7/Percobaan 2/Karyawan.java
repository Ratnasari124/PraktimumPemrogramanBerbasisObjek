public class Karyawan{
    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan(){

    }
    
    public void tampilDataKaryawan(){
        System.out.println("Nama            =" +nama);
        System.out.println("Alamat          =" +alamat);
        System.out.println("Jenis Kelamin   =" +jk);
        System.out.println("Umur            =" +umur);
        System.out.println("Gaji            =" +gaji);
    }
}