public class Dosen01 {
    public String  kode;
    public String  nama;
    public Boolean jenisKelamin;
    public int     usia;

    public Dosen01(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode         = kode;
        this.nama         = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia         = usia;
    }

    public String getJenisKelamin() {
        return jenisKelamin ? "Pria" : "Wanita";
    }
}
