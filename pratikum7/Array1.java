package pratikum7;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Data : ");
        int n = input.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Data ke - " + (i + 1) + " = ");
            data[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + data[i]);
        }
        input.close();
    }
}
