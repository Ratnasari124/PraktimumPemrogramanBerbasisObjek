Nama : Ratnasari
Kelas : TI 2C
Absen : 21

**Running Program**
<img src="Running_percobaan2.PNG>

**Pertanyaan**

1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class
   Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?
   Jawaban: karena memanggil fungsi dari class mobil dan sopir untuk di relasikan.

2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil.
   Mengapa menurut Anda method tersebut harus memiliki argument hari ?
   Jawaban : karena untuk menghitung biaya yang diperlukan pelanggan, jadi perlu patokan berapa lama untuk mencari biaya yang harus dibayar pelanggan dari biaya sopir maupun biaya mobil dengan segi lama hari.

3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah
   mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?
   Jawaban : perintah mobil.hitungBiayaMobil(hari) untuk memanggil method hitungBiayaMobil dengan input nilai hari, dan perintah mobil.hitungBiayaSopir(hari) untuk memanggil method hitungBiayaSopir dengan input nilai hari.

4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan
   p.setSopir(s) ?
   Jawaban : p merupakan konstruktor pelanggan kemudian ada pemanggilan method setMobil yang nilainya diambil dari m dan setSopir yang nilainya diambil dari s. nah untuk s dan m ini diambil dari hasil data konstruktor s=sopir dan m=mobil.

5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal()
   tersebut ?
   Jawaban : p itu merupakan konstruktor pelanggan yang mana disitu pelanggan memangil method hitungBiayaTotal();

6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main
   dan amati perubahan saat di‑run!
   System.out.println(p.getMobil().getMerk());
   Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main
   tersebut?
   Jawaban : jadi untuk menampilkan merk dari mobil yang memanfaatkan fungsi getter mobil dan merk.
   <img src="ModifikasiPertanyaan2.PNG>
