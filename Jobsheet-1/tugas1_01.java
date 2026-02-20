
import java.util.Scanner;

public class tugas1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Pekalongan"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Purwokerto"}
        };
        
        System.out.println("=======================================================");
        System.out.println("\tPROGRAM KODE PLAT NOMOR KENDARAAN");
        System.out.println("=======================================================");
        
        System.out.print("\nMasukkan kode plat nomor : ");
        char kodePlat = sc.next().toUpperCase().charAt(0);
        
        String namaKota = cariKota(KODE, KOTA, kodePlat);
        
        if (namaKota != null) {
            System.out.println("Kode plat " + kodePlat + " adalah kota " + namaKota);
        } else {
            System.out.println("Kode plat " + kodePlat + " tidak ditemukan!");
        }
        
        System.out.println("=======================================================");
        
        sc.close();
    }
    
    public static String cariKota(char[] kode, String[][] kota, char kodeCari) {
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == kodeCari) {
                return kota[i][0];
            }
        }
        return null;
    }
}
