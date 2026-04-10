
public class MahasiswaDemo01 {
    public static void main(String[] args) {

        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01();

        Mahasiswa01 m1 = new Mahasiswa01("123", "Zidan", "2A", 3.2);
        Mahasiswa01 m2 = new Mahasiswa01("124", "Ayu",   "2A", 3.5);
        Mahasiswa01 m3 = new Mahasiswa01("125", "Sofi",  "2A", 3.1);
        Mahasiswa01 m4 = new Mahasiswa01("126", "Sita",  "2A", 3.9);
        Mahasiswa01 m5 = new Mahasiswa01("127", "Miki",  "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        MahasiswaBerprestasi01 list2 = new MahasiswaBerprestasi01();
        list2.tambah(new Mahasiswa01("123", "Ali",  "2B", 3.9));
        list2.tambah(new Mahasiswa01("124", "ila",  "2B", 3.1));
        list2.tambah(new Mahasiswa01("125", "agus", "2B", 3.6));
        list2.tambah(new Mahasiswa01("126", "tika", "2B", 3.3));
        list2.tambah(new Mahasiswa01("127", "udin", "2B", 3.2));

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list2.selectionSort();
        list2.tampil();

        MahasiswaBerprestasi01 list3 = new MahasiswaBerprestasi01();
        list3.tambah(new Mahasiswa01("111", "ayu",   "2c", 3.7));
        list3.tambah(new Mahasiswa01("222", "dika",  "2c", 3.0));
        list3.tambah(new Mahasiswa01("333", "ila",   "2c", 3.8));
        list3.tambah(new Mahasiswa01("444", "susi",  "2c", 3.1));
        list3.tambah(new Mahasiswa01("555", "yayuk", "2c", 3.4));

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list3.insertionSort();
        list3.tampil();

        MahasiswaBerprestasi01 list4 = new MahasiswaBerprestasi01();
        list4.tambah(new Mahasiswa01("111", "ayu",   "2c", 3.7));
        list4.tambah(new Mahasiswa01("222", "dika",  "2c", 3.0));
        list4.tambah(new Mahasiswa01("333", "ila",   "2c", 3.8));
        list4.tambah(new Mahasiswa01("444", "susi",  "2c", 3.1));
        list4.tambah(new Mahasiswa01("555", "yayuk", "2c", 3.4));

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list4.insertionSortDesc();
        list4.tampil();
    }
}
