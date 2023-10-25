public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
        
        // Inisialisasi variabel untuk menyimpan jumlah total elemen
        int total = 0;
        
        // Menggunakan perulangan nested for untuk mengakses elemen array
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                total += arrayInt[i][j]; // Menambahkan elemen ke total
            }
        }
        
        // Mencetak jumlah total elemen
        System.out.println("Jumlah total elemen array: " + total);
    }
}
