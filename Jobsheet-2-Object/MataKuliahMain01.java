public class MataKuliahMain01 {
    public static void main(String[] args) {

        MataKuliah01 mk1 = new MataKuliah01();

        mk1.kodeMK    = "IF101";
        mk1.nama      = "Algoritma dan Pemrograman";
        mk1.sks       = 3;
        mk1.jumlahJam = 6;

        System.out.println("===== Mata Kuliah 1 =====");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.kurangiJam(10);
        System.out.println();

        MataKuliah01 mk2 = new MataKuliah01("IF202", "Pemrograman Berorientasi Objek", 3, 8);

        System.out.println("===== Mata Kuliah 2 =====");
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(4);
        mk2.kurangiJam(2);
    }
}
