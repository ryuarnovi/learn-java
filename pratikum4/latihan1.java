package pratikum4;

class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    // Konstruktor dengan parameter
    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    // Method untuk mencetak info buku
    void cetakBuku() {
        System.out.println("Judul     : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Penerbit  : " + this.penerbit);
        System.out.println("Tahun     : " + this.tahun);
        System.out.println("--------------------------------------------------");
    }
}

public class latihan1 {
    public static void main(String[] args) {
        // Membuat objek buku dengan konstruktor
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);

        // Menampilkan data buku
        buku1.cetakBuku();
        buku2.cetakBuku();
    }
}