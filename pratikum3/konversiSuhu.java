package pratikum3;

import java.util.Scanner;

public class konversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Program Konversi Suhu (Celsius) ===");
        System.out.print("Masukkan Suhu (°C): ");
        double celsius = input.nextDouble();
        
        System.out.println("\n--- Hasil Konversi ---");
        
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.8) + 32;
        double rankine = (celsius * 1.8) + 491.67;
        double delisle = (100 - celsius) * 1.5;
        double newton = celsius * 33 / 100;
        double reaumur = celsius * 0.8;
        double romer = (celsius * 21 / 40) + 7.5;
        
        System.out.println("Kelvin     : " + kelvin);
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Rankine    : " + rankine);
        System.out.println("Delisle    : " + delisle);
        System.out.println("Newton     : " + newton);
        System.out.println("Réaumur    : " + reaumur);
        System.out.println("Rømer      : " + romer);
        
        input.close();
    }
}
