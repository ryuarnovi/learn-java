# Panduan Detail Pratikum 6: Perulangan (Looping)

Modul ini berfokus pada pengulangan tugas (loop) menggunakan `for`, `while`, dan `do-while`.

## 1. Perulangan.java
Class laboratorium untuk membandingkan tiga jenis loop.

### 🛠 Method (Fungsi):
- `while1_10()`: **While Loop**. Diulang "selama" kondisi (i <= 10) benar. Kondisi dicek di AWAL.
- `doWhile1_10()`: **Do-While Loop**. Jalankan kode sekali, baru cek kondisi. Pasti tereksekusi MINIMAL SATU KALI.
- `for1_10()`: **For Loop**. Terstruktur dengan inisialisasi, kondisi, dan inkrementasi dalam satu baris. Paling sering digunakan.

---

## 2. Faktorial.java
Menghitung faktorial ($n!$) dengan memperlihatkan prosesnya.

### 📋 Konsep Utama (Variabel):
- `n`: Bilangan yang ingin difaktorkan (System input).
- `result`: Hasil perkalian yang diakumulasi (tipe `long` agar dapat menampung angka besar).

### 🛠 Logika Loop (Step-by-Step):
- Memulai loop dari 1 hingga `n`.
- Mengalikan `result` dengan angka berikutnya (`i + 1`).
- Mencetak proses di setiap langkah (misal: "1 x 2 = 2").

---

## 3. DeretAngka.java
Mencetak kumpulan angka dengan kontrol letak ganti baris.

### 📋 Konsep Utama (Input):
- `n`: Berapa angka yang ingin ditampilkan (misal 1-20).
- `split`: Setiap berapa angka harus ada ganti baris (`System.out.println()`).

### 🛠 Logika Modulo (%):
- Digunakan operator `%` (Modulo/Sisa bagi).
- Jika `i % split == 0`, artinya urutan ke-`i` adalah kelipatan `split`, maka program memanggil `println()` untuk turun baris.
- **Contoh**: Jika split = 5, baris baru dibuat setelah angka 5, 10, 15, dan 20.
