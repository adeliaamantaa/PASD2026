
import java.util.Scanner;

public class tugas2_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=======================================================");
        System.out.println("\tPROGRAM JADWAL KULIAH MAHASISWA");
        System.out.println("=======================================================");
        
        System.out.print("Masukkan jumlah jadwal kuliah : ");
        int jmlJadwal = sc.nextInt();
        sc.nextLine();
        
        String[][] jadwalKuliah = new String[jmlJadwal][4];
        
        inputJadwal(jadwalKuliah, sc);
        
        int pilihan;
        do {
            System.out.println("\n=======================================================");
            System.out.println("\tMENU JADWAL KULIAH");
            System.out.println("=======================================================");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.println("-------------------------------------------------------");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(jadwalKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari : ");
                    String hari = sc.nextLine();
                    tampilkanJadwalByHari(jadwalKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah : ");
                    String matkul = sc.nextLine();
                    tampilkanJadwalByMatkul(jadwalKuliah, matkul);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
        
        sc.close();
    }
    
    public static void inputJadwal(String[][] jadwal, Scanner sc) {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("Input Data Jadwal Kuliah:");
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Jadwal ke-" + (i+1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }
    
    public static void tampilkanSemuaJadwal(String[][] jadwal) {
        System.out.println("\n=======================================================");
        System.out.println("\tDAFTAR JADWAL KULIAH");
        System.out.println("=======================================================");
        System.out.println("No\tMata Kuliah\t\t\tRuang\t\t\tHari\t\tJam");
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%d\t%-30s\t%-20s\t%-10s\t%s%n", 
                (i+1), 
                jadwal[i][0], 
                jadwal[i][1], 
                jadwal[i][2], 
                jadwal[i][3]);
        }
        System.out.println("=======================================================");
    }
    
    public static void tampilkanJadwalByHari(String[][] jadwal, String hari) {
        System.out.println("\n=======================================================");
        System.out.println("\tJADWAL KULIAH HARI " + hari.toUpperCase());
        System.out.println("=======================================================");
        System.out.println("No\tMata Kuliah\t\t\tRuang\t\t\tJam");
        System.out.println("-------------------------------------------------------");
        
        boolean ditemukan = false;
        int no = 1;
        
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%d\t%-30s\t%-20s\t%s%n", 
                    no, 
                    jadwal[i][0], 
                    jadwal[i][1], 
                    jadwal[i][3]);
                ditemukan = true;
                no++;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        }
        System.out.println("=======================================================");
    }
    
    public static void tampilkanJadwalByMatkul(String[][] jadwal, String matkul) {
        System.out.println("\n=======================================================");
        System.out.println("\tINFORMASI JADWAL MATA KULIAH");
        System.out.println("=======================================================");
        
        boolean ditemukan = false;
        
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mata kuliah " + matkul + " tidak ditemukan!");
        }
        System.out.println("=======================================================");
    }
}
