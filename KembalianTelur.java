import java.util.Scanner;

public class KembalianTelur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Harga per kilogram telur
        final int HARGA_TELUR_PER_KG = 28000;

        // Input jumlah telur yang dibeli (dalam kilogram)
        System.out.print("Masukkan jumlah telur yang dibeli (kg): ");
        double jumlahTelur = scanner.nextDouble();

        // Input uang yang dibayarkan
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        double uangDibayarkan = scanner.nextDouble();

        // Hitung total harga
        double totalHarga = jumlahTelur * HARGA_TELUR_PER_KG;

        // Hitung kembalian
        double kembalian = uangDibayarkan - totalHarga;

        // Cek apakah uang yang dibayarkan cukup
        if (kembalian < 0) {
            System.out.println("Uang yang dibayarkan tidak cukup.");
        } else {
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Uang kembalian: " + kembalian);
        }

        scanner.close();
    }
}
