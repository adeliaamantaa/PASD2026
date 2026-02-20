public class Mahasiswa01 {
  
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa01() {
        nim   = "-";
        nama  = "-";
        kelas = "-";
        ipk   = 0.0;
    }

    public Mahasiswa01(String nim, String nama, String kelas, double ipk) {
        this.nim   = nim;
        this.nama  = nama;
        this.kelas = kelas;
        this.ipk   = ipk;
    }
  
    public void tampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }

    public void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    public void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    public String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Cumlaude";
        } else if (ipk >= 3.0) {
            return "Memuaskan";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
}
