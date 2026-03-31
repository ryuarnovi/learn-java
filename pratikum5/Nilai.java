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
    }

    public char getNilHuruf(float nilai) {
        if (nilai >= 85) {
            nHuruf = 'A';
        } else if (nilai >= 70 && nilai < 85) {
            nHuruf = 'B';
        } else if (nilai >= 60 && nilai < 70) {
            nHuruf = 'C';
        } else if (nilai >= 40 && nilai < 60) {
            nHuruf = 'D';
        } else {
            nHuruf = 'E';
        }
        return nHuruf;
    }

    public String getPredikat(char huruf) {
        switch (huruf) {
            case 'A':
                predikat = "Apik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
        }
        return predikat;
    }

    public void cetakNilai() {
        System.out.println("Nim          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Tugas  : " + nilaiTugas + " 20%   : " + (0.20 * nilaiTugas));
        System.out.println("Nilai Uts    : " + nilaiUts + " 35%   : " + (0.35 * nilaiUts));
        System.out.println("Nilai Uas    : " + nilaiUas + " 45%   : " + (0.45 * nilaiUas));
        System.out.println("Nilai Akhir  : " + nilaiAkhir);
        System.out.println("Nilai Huruf  : " + getNilHuruf(nilaiAkhir));
        System.out.println("Predikat     : " + getPredikat(nHuruf));
    }

    public static void main(String[] args) {
        Nilai n = new Nilai();
        n.setData("08982983", "Ghiyatsi", 80.0f, 90.0f, 87.0f);
        n.cetakNilai();
    }
}
