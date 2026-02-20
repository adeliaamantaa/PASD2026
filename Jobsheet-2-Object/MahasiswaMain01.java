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

        System.out.println("\n===== Informasi Kedua =====");
        mhs1.tampilkanInformasi();

        System.out.println("\nNilai Kinerja: " + mhs1.nilaiKinerja(mhs1.ipk));
    }
}
