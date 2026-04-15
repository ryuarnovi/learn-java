package pertemuanOffline.pertemuan7;

public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(12312342134L);
        Persegi persegi2 = new Persegi(9);

        System.out.println("=== Aplikasi Luas Persegi ===");
        System.out.println("Persegi 1: sisi = " + persegi1.getSisi() + ", luas = " + persegi1.getLuas());
        System.out.println("Persegi 2: sisi = " + persegi2.getSisi() + ", luas = " + persegi2.getLuas());

        persegi1.output();
        persegi2.output();
    }
}
