package pertemuanOffline.pertemuan4;

import java.util.Scanner;

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    private double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public void tampilHasil() {
        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.printf("Jari-jari : %.2f\n", jariJari);
        System.out.printf("Keliling  : %.2f\n", hitungKeliling());
        System.out.println("=============================");
    }
}

public class terserah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai jari-jari : ");
        double r = input.nextDouble();

        Lingkaran bulatan = new Lingkaran(r);

        bulatan.tampilHasil();
        
        input.close();
    }
}

