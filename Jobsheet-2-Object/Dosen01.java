public class Dosen01 {

    String  idDosen;
    String  nama;
    boolean statusAktif;
    int     tahunBergabung;
    String  bidangKeahlian;

    public Dosen01() {
        idDosen        = "-";
        nama           = "-";
        statusAktif    = false;
        tahunBergabung = 0;
        bidangKeahlian = "-";
    }

    public Dosen01(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen        = idDosen;
        this.nama           = nama;
        this.statusAktif    = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif) {
            System.out.println(nama + " sekarang berstatus Aktif.");
        } else {
            System.out.println(nama + " sekarang berstatus Tidak Aktif.");
        }
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}
