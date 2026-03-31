# Panduan Belajar Pemrograman Berorientasi Objek (PBO) dengan Java

Repositori ini berisi kumpulan materi praktikum PBO, mulai dari konsep dasar hingga penggunaan array dan matriks. Gunakan panduan ini untuk belajar secara bertahap dari nol.

## Struktur Modul

### 📂 [Pratikum 1: Dasar-Dasar Java](./pratikum1)
**Konsep Utama:** Pengenalan sintaksis dasar, variabel, dan struktur program Java.
- `latihan1.java`: Penggunaan input/output dasar.
- `latihan2.java`: Operasi aritmatika sederhana.

### 📂 [Pratikum 2: Class dan Object](./pratikum2)
**Konsep Utama:** Pendefinisian Class, pembuatan Object, serta penggunaan atribut dan method.
- `Mobil2.java`: Representasi objek dunia nyata ke dalam kode.
- `DataNilai.java`: Pengelolaan data sederhana menggunakan class.

### 📂 [Pratikum 3: Method dan Logika](./pratikum3)
**Konsep Utama:** Pengolahan data melalui method dan logika matematika.
- `konversiSuhu.java`: Implementasi logika rumus ke dalam method.
- `matematikaDemo.java`: Pendemonstrasian operasi matematika.

### 📂 [Pratikum 4: Dasar Java Lanjut](./pratikum4)
**Konsep Utama:** Penggunaan input/output dasar tingkat lanjut.
- `latihan1.java`: Penggunaan I/O dasar.
- `latihan2.java`: Penggunaan I/O dasar tambahan.

### 📂 [Pratikum 5: Struktur Kendali (Percabangan)](./pratikum5)
**Konsep Utama:** Pengambilan keputusan menggunakan `if`, `else if`, `else`, dan `switch-case`.
- `Nilai.java`: Menentukan nilai huruf (A/B/C) berdasarkan angka.
- `Penjualan.java`: Menghitung bonus belanja menggunakan logika logika `&&` (DAN) dan `||` (ATAU).
- `RumusABC.java`: Menghitung akar kuadrat dengan mempertimbangkan nilai Determinan (D).

### 📂 [Pratikum 6: Perulangan (Looping)](./pratikum6)
**Konsep Utama:** Mengulang eksekusi kode menggunakan `while`, `do-while`, dan `for`.
- `Perulangan.java`: Perbandingan ketiga jenis loop untuk angka 1-10.
- `Faktorial.java`: Implementasi loop untuk menghitung perkalian beruntun (faktorial).
- `DeretAngka.java`: Penggunaan loop untuk mencetak angka dengan format ganti baris dinamis.

### 📂 [Pratikum 7: Array dan Matriks](./pratikum7)
**Konsep Utama:** Penyimpanan kumpulan data dalam satu variabel (Array 1D, 2D, dan Array Object).
- `SinggleArray.java`: Dasar penggunaan array satu dimensi.
- `MatrixExample.java`: Pengenalan baris dan kolom pada array dua dimensi.
- `Array1.java`: Input data ke dalam array menggunakan loop.
- `DaftarNilai.java`: **Konsep Lanjut** - Menggabungkan Class dan Array (Array of Objects) untuk menyimpan data banyak mahasiswa.
- `Matrik.java`: Operasi matematika tingkat lanjut (Penjumlahan, Transpose, dan Perkalian Matriks).

---

## 🚀 Cara Belajar dari Nol
1. **Urutan:** Ikuti dari Modul 1 hingga Modul 7 secara berurutan.
2. **Pahami Class:** Di Java, segalanya adalah Class. Fokuslah pada `pratikum2` untuk mengerti pondasi ini.
3. **Logika:** Kuasai `pratikum5` (Percabangan) dan `pratikum6` (Perulangan) karena ini adalah jantung dari logika pemrograman.
4. **Struktur Data:** Gunakan `pratikum7` untuk memahami bagaimana mengelola data dalam jumlah banyak secara efisien.

## 🛠 Cara Menjalankan Program
Pastikan Anda sudah berada di direktori utama, lalu gunakan perintah berikut di terminal:

```bash
# Kompilasi (Contoh Modul 6)
javac pratikum6/Faktorial.java

# Jalankan
java pratikum6.Faktorial
```

*Selamat Belajar! Jangan ragu untuk mencoba mengubah nilai atau logika di dalam file untuk melihat perbedaannya.*
