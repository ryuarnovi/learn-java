package pertemuanOffline.pertemuan3;

import java.util.Scanner;
public class terserah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan jenis kelamin anda : ");
        String jenisKelamin = sc.nextLine();

        System.out.print("Masukan alamat anda : ");
        String alamat = sc.nextLine();

        System.out.print("Masukkan cita-cita: ");
        String cita = sc.nextLine();    

        System.err.println("==============================================");
        System.out.println("Nama anda " + nama);
        System.out.println("NIM anda " + nim);
        System.out.println("Jenis kelamin anda " + jenisKelamin);
        System.out.println("Alamat anda " + alamat);
        System.out.println("Cita-cita anda " + cita);
        System.err.println("==============================================");


        sc.close();
    }
    
}
