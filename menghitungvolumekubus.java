import java.util.Scanner;

public class menghitungvolumekubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        
        double volume = ( sisi * sisi * sisi) ;
        
        System.out.printf("volume kubus : " + volume );
        
        scanner.close();
    }
}
