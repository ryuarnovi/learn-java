package pratikum1;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        // Membuat object Scanner untuk input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("=== Form Biodata Mahasiswa ===");
        
        System.out.print("Nama Lengkap    : ");
        String nama = input.nextLine();

        System.out.print("NIM             : ");
        String nim = input.nextLine();

        System.out.print("Alamat          : ");
        String alamat = input.nextLine();

        System.out.print("Tempat Lahir    : ");
        String tempatLahir = input.nextLine();

        System.out.print("Tanggal Lahir   : ");
        String tglLahir = input.nextLine();

        System.out.print("No. HP          : ");
        String noHp = input.nextLine();

        System.out.print("Email           : ");
        String email = input.nextLine();

        // Menampilkan hasil input biodata
        System.out.println("\n==================================");
        System.out.println("        BIODATA DIRI ANDA       ");
        System.out.println("==================================");
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Tempat Lahir  : " + tempatLahir);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("No. HP        : " + noHp);
        System.out.println("Email         : " + email);
        System.out.println("==================================");

        // Menutup scanner
        input.close();
    }
}