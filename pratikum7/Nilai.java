package pratikum7;

public class Nilai {
    public String nim;
    public String nama;
    public float nilaiTugas;
    public float nilaiUts;
    public float nilaiUas;
    public float nilaiAkhir;
    public char nHuruf;
    public String predikat;

    public void setData(String nim, String nama, float tugas, float uts, float uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = tugas;
        this.nilaiUts = uts;
        this.nilaiUas = uas;
        this.nilaiAkhir = (0.20f * tugas) + (0.35f * uts) + (0.45f * uas);
        this.nHuruf = getNilHuruf(this.nilaiAkhir);
        this.predikat = getPredikat(this.nHuruf);
    }

    public char getNilHuruf(float nilai) {
        if (nilai >= 85) return 'A';
        else if (nilai >= 70) return 'B';
        else if (nilai >= 60) return 'C';
        else if (nilai >= 40) return 'D';
        else return 'E';
    }

    public String getPredikat(char huruf) {
        switch (huruf) {
            case 'A': return "Apik";
            case 'B': return "Baik";
            case 'C': return "Cukup";
            case 'D': return "Dablek";
            default: return "Elek";
        }
    }

    public void cetakNilai() {
        System.out.println("Nim          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Akhir  : " + nilaiAkhir);
        System.out.println("Nilai Huruf  : " + nHuruf);
        System.out.println("Predikat     : " + predikat);
    }
}
