import java.util.Scanner;

public class  KonversiSuhu.java
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input suhu dalam Celsius
        System.out.print("Masukkan suhu dalam Celsius: ");
        double suhuCelsius = scanner.nextDouble();

        // Menghitung suhu dalam Fahrenheit
        double suhuFahrenheit = (suhuCelsius * 9 / 5) + 32;

        // Menampilkan hasil
        System.out.printf("Suhu dalam Fahrenheit: %.2f\n", suhuFahrenheit);

        // Menutup scanner
        scanner.close(); 
    }
}
