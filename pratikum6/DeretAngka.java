package pratikum6;

import java.util.Scanner;

public class DeretAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan : ");
        int n = input.nextInt();

        // Output 1: Multiple of 5
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("--------------------");

        // Output 2: Dipecah
        System.out.print("Dipecah : ");
        int split = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i % split == 0) {
                System.out.println();
            }
        }
        System.out.println();
        input.close();
    }
}
