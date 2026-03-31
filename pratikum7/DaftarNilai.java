package pratikum7;

import java.util.Scanner;

public class DaftarNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = input.nextInt();
        input.nextLine(); // Clear buffer

        Nilai[] listNilai = new Nilai[n];

        for (int i = 0; i < n; i++) {
            listNilai[i] = new Nilai();
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nim         : "); String nim = input.nextLine();
            System.out.print("Nama        : "); String nama = input.nextLine();
            System.out.print("Nilai Tugas : "); float tugas = input.nextFloat();
            System.out.print("Nilai UTS   : "); float uts = input.nextFloat();
            System.out.print("Nilai UAS   : "); float uas = input.nextFloat();
            input.nextLine(); // Clear buffer
            listNilai[i].setData(nim, nama, tugas, uts, uas);
        }

        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        daftarNilai(listNilai);
        input.close();
    }

    public static void daftarNilai(Nilai[] array) {
        for (Nilai n : array) {
            n.cetakNilai();
            System.out.println("-------------------------");
        }
    }
}
