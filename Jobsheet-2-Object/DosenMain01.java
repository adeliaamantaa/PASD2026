public class DosenMain01 {
    public static void main(String[] args) {

        Dosen01 d1 = new Dosen01();
        d1.idDosen        = "0987654321";
        d1.nama           = "Dosen 1";
        d1.statusAktif    = true;
        d1.tahunBergabung = 2008;
        d1.bidangKeahlian = "Object-Oriented Programming";

        System.out.println("===== Dosen 1 =====");
        d1.tampilInformasi();
        d1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2026) + " tahun");
        d1.ubahKeahlian("Software Engineering");
        System.out.println();

        Dosen01 d2 = new Dosen01("1234567890", "Dosen 2", true, 2018, "Cloud Computing");

        System.out.println("===== Dosen 2 =====");
        d2.tampilInformasi();
        d2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2026) + " tahun");
        d2.ubahKeahlian("Software Development");
    }
}
