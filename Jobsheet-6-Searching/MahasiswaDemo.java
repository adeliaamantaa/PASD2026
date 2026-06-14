package minggu6;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------");
            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
        }

        list.tampil();

        System.out.println("-----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        int pss = list.sequentialSearching(cari);
        list.tampilPoisisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        sc.close();
    }
}
