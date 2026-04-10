public class Mahasiswa01 {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

    public Mahasiswa01() {
    }

    public Mahasiswa01(String nm, String name, String kls, double ip) {
        nim  = nm;
        nama = name;
        ipk  = ip;
        kelas = kls;
    }

    public void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: "  + nim);
        System.out.println("Kelas: "+ kelas);
        System.out.println("IPK: "  + ipk);
        System.out.println("--------------------------");
    }
}
