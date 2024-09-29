import java.util.Scanner;

public class menghitungkelilinglingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        
        double keliling = 2 * Math.PI * jariJari;
        
        System.out.printf("Keliling lingkaran dengan jari-jari %.2f adalah %.2f\n", jariJari, keliling);
        
        scanner.close();
    }
}
