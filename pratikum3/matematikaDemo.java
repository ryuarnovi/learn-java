package pratikum3;

import java.util.Scanner;

class matematika {
    void pertambahan(int a, int b) {
        System.out.println("Pertambahan: " + a + " + " + b + " = " + (a + b));
    }
    
    void pengurangan(int a, int b) {
        System.out.println("Pengurangan: " + a + " - " + b + " = " + (a - b));
    }
    
    void perkalian(int a, int b) {
        System.out.println("Perkalian: " + a + " x " + b + " = " + (a * b));
    }
    
    void pembagian(int a, int b) {
        if (b != 0) {
            System.out.println("Pembagian: " + a + " / " + b + " = " + (a / (double)b));
        } else {
            System.out.println("Pembagian: Tidak bisa dibagi nol");
        }
    }
}

public class matematikaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        matematika mtk = new matematika();
        
        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();
        
        System.out.println("\n--- Hasil Operasi Matematika ---");
        mtk.pertambahan(a, b);
        mtk.pengurangan(a, b);
        mtk.perkalian(a, b);
        mtk.pembagian(a, b);
        
        scanner.close();
    }
}
