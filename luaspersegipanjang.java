import java.util.Scanner;

public class luaspersegipanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jari-jari dari pengguna
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        // Menghitung keliling
        double luas = panjang * lebar;

        // Menampilkan hasil
        System.out.printf("luas persegi panjang: "+ luas);

        // Menutup scanner
        scanner.close();
    }
}
