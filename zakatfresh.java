import java.util.Scanner;  

package zakat;

/**
 *
 * @author wildanese
 */
public class ZakatFresh {
    public static final double NISAB = 85 * 1000;  
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double totalWealth = 0;
        while (true) {
            System.out.print("Masukkan total kekayaan Anda(dalam rupiah): ");
            totalWealth = scanner.nextDouble();  

            if (totalWealth < 0) {
                System.out.println("Kekayaan tidak bisa negatif. Silakan masukkan jumlah yang valid.");
            } else {
                break; 
            }
        }
        double zakat = calculateZakat(totalWealth);
        if (totalWealth >= NISAB) {
            System.out.printf("Zakat mall anda adalah: %.2f\n", zakat);  
        } else {
            System.out.println("Hartamu tidak mencapai nishab. Anda tidak wajib membayar Zakat Maal.");
        }

        scanner.close();  
    }
    public static double calculateZakat(double wealth) {
        final double ZAKAT_RATE = 0.025;  
        return wealth * ZAKAT_RATE; 
    }
}
