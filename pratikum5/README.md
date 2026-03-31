# Panduan Detail Pratikum 5: Struktur Kendali (Decision Making)

Modul ini berfokus pada logika pengambilan keputusan menggunakan `if-else` dan `switch-case`.

## 1. Nilai.java
Class ini digunakan untuk mengolah nilai akademik mahasiswa.

### 📋 Atribut (Variabel):
- `nim`, `nama`: Menyimpan identitas mahasiswa (String).
- `nilaiTugas`, `nilaiUts`, `nilaiUas`: Nilai mentah (float).
- `nilaiAkhir`: Hasil perhitungan bobot (20% Tugas, 35% UTS, 45% UAS).
- `nHuruf`: Karakter grade (A, B, C, D, E) (char).
- `predikat`: Keterangan prestasi (String).

### 🛠 Method (Fungsi):
- `setData(...)`: Mengisi data identitas dan menghitung `nilaiAkhir` secara otomatis.
- `getNilHuruf(float nilai)`: **Logika IF-ELSE**. Mengonversi nilai angka menjadi huruf (85-100 = A, dst).
- `getPredikat(char huruf)`: **Logika SWITCH-CASE**. Memberikan keterangan berdasarkan huruf grade (A = "Apik", dsb).
- `cetakNilai()`: Menampilkan semua informasi ke terminal.

---

## 2. Penjualan.java
Class untuk sistem kasir sederhana dengan bonus belanja.

### 📋 Atribut (Variabel):
- `kode`, `nama`: Identitas barang.
- `harga`, `jumlah`: Data transaksi.

### 🛠 Method (Fungsi):
- `getTotalPembelian()`: Menghitung `harga * jumlah`.
- `getBonus()`: **Logika Kombinasi (AND/OR)**. 
  - Menggunakan `&&` (DAN): Jika total >= 500rb DAN jumlah > 5, dapat "Setrika".
  - Menggunakan `||` (ATAU): Jika total >= 50rb ATAU jumlah > 2, dapat "ballpoint".
- `cetakNota()`: Menampilkan struk belanja beserta bonusnya.

---

## 3. RumusABC.java
Program matematika untuk mencari akar-akar persamaan kuadrat $ax^2 + bx + c = 0$.

### 📋 Konsep Utama:
- Mengambil input pengguna menggunakan `Scanner`.
- Menghitung **Determinan (D)**: $b^2 - 4ac$.

### 🛠 Logika Percabangan:
- **D > 0**: Menghitung dua akar real berbeda ($X_1$ dan $X_2$).
- **D = 0**: Menghitung satu akar kembar.
- **D < 0**: Menghitung akar imajiner (melibatkan simbol 'i').
  - Digunakan fungsi `Math.sqrt()` untuk menghitung akar dan `Math.abs()` jika diperlukan.
