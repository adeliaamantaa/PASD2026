import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data Dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen01[] arrayOfDosen = new Dosen01[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (P/W): ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("P");

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen01(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen01 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + d.getJenisKelamin());
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
        }

        DataDosen dataDosen = new DataDosen();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
