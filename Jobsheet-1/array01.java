
import java.util.Scanner;

public class array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "CTPS",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        double[] nilaiAngka = new double[8];
        String[] huruf = new String[8];
        double[] bobot = new double[8];
        
        System.out.println("==============================================");
        System.out.println("\tPROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("==============================================");
        System.out.println("Masukkan nilai angka untuk tiap mata kuliah");
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < namaMK.length; i++) {
            System.out.print((i+1) + ". " + namaMK[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();
        }
        
        double totalBobot = 0;
        
        for (int i = 0; i < nilaiAngka.length; i++) {
            huruf[i] = konversiHuruf(nilaiAngka[i]);
            bobot[i] = konversiBobot(nilaiAngka[i]);
            totalBobot += bobot[i];
        }
        
        double ip = totalBobot / nilaiAngka.length;
        
        System.out.println("\n========================================================================");
        System.out.println("Mata Kuliah                         Nilai Angka   Nilai Huruf   Bobot");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-35s %-14.0f %-13s %.2f%n",
                    namaMK[i],
                    nilaiAngka[i],
                    huruf[i],
                    bobot[i]);
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("IP : %.2f%n", ip);
        
        sc.close();
    }
    
    public static String konversiHuruf(double nilai) {
    if (nilai > 80 && nilai <= 100) {
        return "A";
    } else if (nilai > 73 && nilai <= 80) {
        return "B+";
    } else if (nilai > 65 && nilai <= 73) {
        return "B";
    } else if (nilai > 60 && nilai <= 65) {
        return "C+";
    } else if (nilai > 50 && nilai <= 60) {
        return "C";
    } else if (nilai > 39 && nilai <= 50) {
        return "D";
    } else {
        return "E";
    }
}

public static double konversiBobot(double nilai) {
    if (nilai > 80 && nilai <= 100) {
        return 4.0;
    } else if (nilai > 73 && nilai <= 80) {
        return 3.5;
    } else if (nilai > 65 && nilai <= 73) {
        return 3.0;
    } else if (nilai > 60 && nilai <= 65) {
        return 2.5;
    } else if (nilai > 50 && nilai <= 60) {
        return 2.0;
    } else if (nilai > 39 && nilai <= 50) {
        return 1.0;
    } else {
        return 0.0;
    }
}

}
