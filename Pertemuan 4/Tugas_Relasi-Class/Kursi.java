public class Kursi{
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor){
        this.nomor = nomor;
    }
    //getter nomor
    public String getNomor(){
        return nomor;
    }
    //setter nomor
    public void setNomor(String nomor){
        this.nomor = nomor;  
    }
    //getter penumpang
    public Penumpang getPenumpang(){
        return penumpang;
    }
    //setter penumpang
    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    public String info(){
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if(this.penumpang != null){
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}