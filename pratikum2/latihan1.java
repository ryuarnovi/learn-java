package pratikum2;

class Mobil2 {
    String warna;
    int tahunProduksi;

    void hidupkanMobil() {
        System.out.println("Hidupkan Mobil : " + warna);
    }

    void matikanMobil() {
        System.out.println("Matikan Mobil : " + warna);
    }

    void ubahGigi() {
        System.out.println("Ubah Gigi      : " + warna);
    }
}

public class latihan1 {
    public static void main(String[] args) {
        // Membuat object
        Mobil2 mobilku = new Mobil2();
        Mobil2 mobilmu = new Mobil2();

        // memanggil atribut dan memberi nilai
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        mobilmu.warna = "Hijau";
        mobilmu.tahunProduksi = 2010;

        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun: " + mobilku.tahunProduksi);
        System.out.println("Warna: " + mobilmu.warna);
        System.out.println("Tahun: " + mobilmu.tahunProduksi);

        // Memanggil method
        mobilku.hidupkanMobil();
        mobilku.ubahGigi();
        mobilku.matikanMobil();
    }
}
