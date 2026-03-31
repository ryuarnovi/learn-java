package pratikum6;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan : ");
        int n = input.nextInt();
        
        long result = 1;
        for (int i = 1; i < n; i++) {
            System.out.println(result + " x " + (i + 1) + " = " + (result * (i + 1)));
            result *= (i + 1);
        }
        input.close();
    }
}
