public class MahasiswaMain01 {
    public static void main(String[] args) {

        Mahasiswa01 mhs1 = new Mahasiswa01();

        mhs1.nim   = "1234567890";
        mhs1.nama  = "Adelia Amanta Putri";
        mhs1.kelas = "SIB1D";
        mhs1.ipk   = 4.00;
        System.out.println("===== Informasi Pertama =====");
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB2D");
        mhs1.updateIpk(3.85);
        System.out.println("\n===== Informasi Pertama (setelah update) =====");
        
        mhs1.tampilkanInformasi();
        System.out.println("\nNilai Kinerja: " + mhs1.nilaiKinerja(mhs1.ipk));

        System.out.println("\n===== Informasi Kedua (Konstruktor Default) =====");
        Mahasiswaa01 mhs2 = new Mahasiswaa01();
        mhs2.tampilkanInformasi();

        System.out.println("\n===== Informasi Ketiga (Konstruktor Berparameter) =====");
        Mahasiswaa01 mhs3 = new Mahasiswaa01("0987654321", "Adengg", "TI1D", 4.00);
        mhs3.updateIpk(4.00);
        mhs3.tampilkanInformasi();
    }
}
