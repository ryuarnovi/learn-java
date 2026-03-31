# Panduan Detail Pratikum 7: Array & Matriks

Modul tingkat lanjut ini berfokus pada struktur data Array dan pengembangannya menjadi Matriks serta Array of Objects.

## 1. SinggleArray.java
Latihan dasar array satu dimensi.

### 📋 Konsep Utama (Variabel):
- `int[] x`: Pendefinisian variabel array dengan tipe `int`.
- `new int[3]`: Inisialisasi kapasitas (ukuran) array sebanyak 3 kotak memori.

### 🛠 Indeks (Index):
- **Indeks** dimulai dari **0**. Maka, array ukuran 3 memiliki alamat kotak: `x[0]`, `x[1]`, dan `x[2]`.

---

## 2. MatrixExample.java
Latihan dasar array dua dimensi (Baris & Kolom).

### 📋 Konsep Utama:
- `int array[][]`: Pendefinisian array dua dimensi secara statis (`{{1,3,5},{2,4,6}}`).
- `array.length`: Jumlah **Baris** (misal: 2 baris).
- `array[i].length`: Jumlah **Kolom** pada baris ke-`i` (misal: 3 kolom).

---

## 3. DaftarNilai.java
**TINGKAT LANJUT: Array of Objects**. Menggabungkan Class dan Array.

### 📋 Perbedaan Utama:
- `Nilai[] listNilai`: Bukan menyimpan angka (`int`) atau huruf (`char`), tapi menyimpan **Objek** secara utuh (yang berisi `nim, nama, nilaiTugas, dll`).

### 🛠 Logika Instansiasi:
- Perlu melakukan `new Nilai()` untuk **SETIAP** elemen di dalam array sebelum digunakan.
- Method `daftarNilai(Nilai[] array)` digunakan untuk mencetak seluruh data mahasiswa secara massal menggunakan perulangan `for-each` atau manual.

---

## 4. Matrik.java (Matrix Operations)
Operasi matematika pada matriks dua dimensi.

### 📋 Atribut (Matriks):
- `int[][] A, B`: Matriks input.
- `int[][] C`: Hasil Penjumlahan.
- `int[][] D`: Hasil Transpose.
- `int[][] E`: Hasil Perkalian.

### 🛠 Logika Operasi (IF check):
- **Penjumlahan (A+B)**: Ukuran A dan B harus SAMA (Baris A = Baris B, Kolom A = Kolom B).
- **Perkalian (A*B)**: **Kolom** matriks A harus SAMA dengan **Baris** matriks B agar dapat dikalikan secara matematis.
- **Transpose**: Menukar posisi baris menjadi kolom dan sebaliknya (`D[i][j] = C[j][i]`).
