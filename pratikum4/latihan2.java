package pratikum4;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Program Konversi Detik ---");
        System.out.print("Masukkan Detik : ");
        long totalDetik = input.nextLong();
        
        // Perhitungan Konversi
        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;
        
        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;
        
        long menit = sisaJam / 60;
        long detik = sisaJam % 60;
        
        // Output sesuai format gambar
        System.out.println("\nrun:");
        System.out.println("Detik   : " + totalDetik);
        System.out.println("Hari    : " + hari);
        System.out.println("Jam     : " + jam);
        System.out.println("Menit   : " + menit);
        System.out.println("Detik   : " + detik);
        
        input.close();
    }
}
