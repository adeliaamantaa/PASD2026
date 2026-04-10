import java.util.Scanner;

public class MahasiswaDemoDinamis01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.next();
            System.out.print("Nama  : ");
            String nama = sc.next();
            System.out.print("Kelas : ");
            String kelas = sc.next();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            list.tambah(new Mahasiswa01(nim, nama, kelas, ipk));
            System.out.println("------------------------------");
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        sc.close();
    }
}
