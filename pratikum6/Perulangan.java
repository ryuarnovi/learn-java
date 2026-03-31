package pratikum6;

public class Perulangan {
    void while1_10() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    void doWhile1_10() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }

    void for1_10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
