public class Motor{
    //access modifier diubah private
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        //menambahkan atribut maksimal atau maks dengan nilai 100
        int maks = 100;
        if(kontakOn == true){ //apabila kontak on akan muncul ini
            //nested if
             if(kecepatan >= maks){ // apabila kecepatan lebih dari maks yaitu 100
                //akan diberi peringatan kemudian akan dinonaktifkan mesinnya
                System.out.println("Mencapai kecepatan Maksimal!!");
                System.out.println("Mesin akan Berhenti!!");
                matikanMesin();
             }else{//jika kecepatan kurang dari 100 maka kecepatan akan terus bertambah 
                //disini saya rubah kecepatannya bertambah 10 bukan 5
                kecepatan += 10;
             }
        }else{ //jika kontak off maka akan muncul ini
             System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }else{
             System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan +"\n");
    }
}