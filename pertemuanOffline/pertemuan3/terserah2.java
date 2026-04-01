package pertemuanOffline.pertemuan3;
import java.util.Scanner;
public class terserah2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jari1, jari2, jari3;
        jari1 = 4;
        jari2 = 5;
        jari3 = 7;
        
        // System.out.print("Masukan jari-jari lingkaran : ");
        // int r = sc.nextInt();
        System.out.println("Luas lingkaran : " + 3.14 * jari1 * jari1);
        System.out.println("Luas lingkaran : " + 3.14 * jari2 * jari2);
        System.out.println("Luas lingkaran : " + 3.14 * jari3 * jari3);
        
        sc.close();
    }
}
