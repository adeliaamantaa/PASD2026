
import java.util.Scanner;

public class perulangan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=======================================================");
        System.out.println("\tPROGRAM DERET BILANGAN");
        System.out.println("=======================================================");
        
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        
        int n = duaDigitTerakhir(nim);
        
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("Nilai n (2 digit terakhir NIM) : " + n);
        System.out.println("-------------------------------------------------------");
        System.out.print("Output : ");
        
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            else {
                System.out.print("* ");
            }
        }
        
        System.out.println("\n=======================================================");
        
        sc.close();
    }
    
    public static int duaDigitTerakhir(String nim) {
        int panjangNim = nim.length();
        String duaDigit = nim.substring(panjangNim - 2);
        return Integer.parseInt(duaDigit);
    }
}
