
import java.util.Scanner;

public class pemilihan01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilTugas, nilKuis, nilUts, nilUas, nilAkhir;
        String konvHuruf, ketLulus;
        System.out.println("==================================");
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==================================");
        
        System.out.print("Masukkan nilai tugas : ");
        nilTugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis  : ");
        nilKuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS   : ");
        nilUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS   : ");
        nilUas = sc.nextDouble();
        
        if (nilTugas < 0 || nilTugas > 100 ||
            nilKuis < 0 || nilKuis > 100 ||
            nilUts < 0 || nilUts > 100 ||
            nilUas < 0 || nilUas > 100) {
            
            System.out.println("==============================");
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            return;
        }

        nilAkhir = (nilTugas * 0.2) + (nilKuis * 0.2) + (nilUts * 0.3) + (nilUas * 0.3);
        konvHuruf = konversiHuruf(nilAkhir);

        ketLulus = (nilAkhir >= 60) ? "LULUS" : "TIDAK LULUS";
        
        System.out.println("------------------------------");
        System.out.println("Nilai akhir : " + nilAkhir);
        System.out.println("Nilai huruf : " + konvHuruf);
        System.out.println("==============================");
        System.out.println("Mahasiswa dinyatakan " + ketLulus);
        
        sc.close();
    }


    public static String konversiHuruf(double nilAkhir) {
        if (nilAkhir > 80 && nilAkhir <= 100) {
            return "A";
        } else if (nilAkhir > 73 && nilAkhir <= 80) {
            return "B+";
        } else if (nilAkhir > 65 && nilAkhir <= 73) {
            return "B";
        } else if (nilAkhir > 60 && nilAkhir <= 65) {
            return "C+";
        } else if (nilAkhir > 50 && nilAkhir <= 60) {
            return "C";
        } else if (nilAkhir > 39 && nilAkhir <= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
