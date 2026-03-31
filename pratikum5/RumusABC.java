import java.util.Scanner;

public class RumusABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Rumus ABC");
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        double D = (b * b) - (4 * a * c);
        System.out.println("Determinant (D) = " + D);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Akar-akar real berbeda:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Akar-akar real kembar:");
            System.out.println("X1 = X2 = " + x);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Akar-akar imajiner:");
            System.out.println("X1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("X2 = " + realPart + " - " + imaginaryPart + "i");
        }
        input.close();
    }
}
