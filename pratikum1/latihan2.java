package pratikum1;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Penghitung Luas dan Keliling ===");
        
        // 1. Segitiga
        System.out.println("\n--- Segitiga ---");
        System.out.print("Masukkan Alas   : ");
        double alas = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan Sisi A : ");
        double sisiA = input.nextDouble();
        System.out.print("Masukkan Sisi B : ");
        double sisiB = input.nextDouble();
        System.out.print("Masukkan Sisi C : ");
        double sisiC = input.nextDouble();
        
        double luasSegitiga = 0.5 * alas * tinggi;
        double kelilingSegitiga = sisiA + sisiB + sisiC;
        
        System.out.println("Luas Segitiga     : " + luasSegitiga);
        System.out.println("Keliling Segitiga : " + kelilingSegitiga);

        // 2. Lingkaran
        System.out.println("\n--- Lingkaran ---");
        System.out.print("Masukkan Jari-jari : ");
        double r = input.nextDouble();
        
        double luasLingkaran = Math.PI * r * r;
        double kelilingLingkaran = 2 * Math.PI * r;
        
        System.out.println("Luas Lingkaran     : " + luasLingkaran);
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);

        // 3. Kubus
        System.out.println("\n--- Kubus ---");
        System.out.print("Masukkan Sisi Kubus : ");
        double s = input.nextDouble();
        
        double luasPermukaanKubus = 6 * (s * s);
        double volumeKubus = s * s * s;
        double kelilingKubus = 12 * s;
        
        System.out.println("Luas Permukaan Kubus : " + luasPermukaanKubus);
        System.out.println("Keliling Kubus (Rusuk): " + kelilingKubus);
        System.out.println("Volume Kubus         : " + volumeKubus);

        input.close();
    }
}
