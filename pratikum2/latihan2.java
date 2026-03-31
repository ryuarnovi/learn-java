package pratikum2;

class DataNilai {
    String nim;
    String nama;
    float nilaiUts, nilaiTugas, nilaiUas;
    float pNilaiUts, pNilaiTugas, pNilaiUas, nilaiAkhir;

    void hitungNilai() {
        // Mengikuti output screenshot: Tugas 20%, UTS 35%, UAS 45%
        pNilaiTugas = nilaiTugas * 0.20f;
        pNilaiUts = nilaiUts * 0.35f;
        pNilaiUas = nilaiUas * 0.45f;
        nilaiAkhir = pNilaiTugas + pNilaiUts + pNilaiUas;
    }

    void cetakNilai() {
        System.out.println("Nim           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Nilai Tugas   : " + nilaiTugas + " 20%   : " + pNilaiTugas);
        System.out.println("Nilai Uts     : " + nilaiUts + " 35%   : " + pNilaiUts);
        System.out.println("Nilai Uas     : " + nilaiUas + " 45%   : " + pNilaiUas);
        System.out.println("Nilai Akhir   : " + nilaiAkhir);
    }
}

public class latihan2 {
    public static void main(String[] args) {
        DataNilai mhs = new DataNilai();
        mhs.nim = "08982983";
        mhs.nama = "Ghiyatsi";
        mhs.nilaiTugas = 80.0f;
        mhs.nilaiUts = 90.0f;
        mhs.nilaiUas = 87.0f;

        mhs.hitungNilai();
        mhs.cetakNilai();
    }
}
