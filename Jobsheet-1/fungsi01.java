
import java.util.Scanner;

public class fungsi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] priceList = {75000, 50000, 60000, 10000};
        
        int[][] stokHarian = {
            {10, 5, 15, 7},   
            {6, 11, 9, 12},   
            {2, 10, 10, 5},   
            {5, 7, 12, 9}     
        };
        
        int totCabang = stokHarian.length;
        int totJenis = bunga.length;
        
        System.out.println("=======================================================");
        System.out.println("\tPROGRAM PENDAPATAN ROYAL GARDEN");
        System.out.println("=======================================================");
        
        System.out.println("\nStock Bunga Setiap Cabang:");
        System.out.println("-------------------------------------------------------");
        System.out.print("Cabang\t\t\t");
        for (int j = 0; j < totJenis; j++) {
            System.out.print(bunga[j] + "\t");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < totCabang; i++) {
            System.out.print("RoyalGarden " + (i+1) + "\t\t");
            for (int j = 0; j < totJenis; j++) {
                System.out.print(stokHarian[i][j] + "\t\t");
            }
            System.out.println();
        }
        
        System.out.println("\n=======================================================");
        System.out.println("\tPENDAPATAN DAN STATUS CABANG");
        System.out.println("=======================================================");
        
        for (int i = 0; i < totCabang; i++) {
            int hasilJual = hitungPemasukan(stokHarian[i], priceList);
            String status = cekStatus(hasilJual);
            
            System.out.println("\nRoyalGarden " + (i+1) + ":");
            System.out.println("Pendapatan\t: Rp " + formatAngka(hasilJual));
            System.out.println("Status\t\t: " + status);
        }
        
        System.out.println("\n=======================================================");
        
        sc.close();
    }
    
    public static int hitungPemasukan(int[] stok, int[] hrg) {
        int sumPemasukan = 0;
        for (int i = 0; i < stok.length; i++) {
            sumPemasukan += stok[i] * hrg[i];
        }
        return sumPemasukan;
    }
    
    public static String cekStatus(int pemasukan) {
        if (pemasukan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    
    public static String formatAngka(int angka) {
        return String.format("%,d", angka).replace(',', '.');
    }
}
