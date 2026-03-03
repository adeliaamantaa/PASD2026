public class MahasiswaDemo01 {
    public static void main(String[] args) {

        Mahasiswa01[] arrayOfMahasiswa = new Mahasiswa01[3];

        arrayOfMahasiswa[0] = new Mahasiswa01();
        arrayOfMahasiswa[0].nim = "1234567890";
        arrayOfMahasiswa[0].nama = "Aldi";
        arrayOfMahasiswa[0].kelas = "TI-1A";
        arrayOfMahasiswa[0].ipk = (float) 3.5;
        
        arrayOfMahasiswa[1] = new Mahasiswa01();
        arrayOfMahasiswa[1].nim = "0987654321";
        arrayOfMahasiswa[1].nama = "Budi";
        arrayOfMahasiswa[1].kelas = "TI-1B";
        arrayOfMahasiswa[1].ipk = (float) 3.7;
        
        arrayOfMahasiswa[2] = new Mahasiswa01();
        arrayOfMahasiswa[2].nim = "5432167890";
        arrayOfMahasiswa[2].nama = "Ciko";
        arrayOfMahasiswa[2].kelas = "TI-1C";
        arrayOfMahasiswa[2].ipk = (float) 3.9;

        System.out.println("NIM   : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[0].ipk);
        System.out.println("--------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[1].ipk);
        System.out.println("--------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[2].ipk);
        System.out.println("--------------------------");
        
    }
}
