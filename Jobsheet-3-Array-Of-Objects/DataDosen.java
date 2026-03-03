public class DataDosen {

    public void dataSemuaDosen(Dosen01[] arrayOfDosen) {
        System.out.println("===== DATA SEMUA DOSEN =====");
        int no = 1;
        for (Dosen01 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + d.getJenisKelamin());
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen01 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println("------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria   = 0, jmlWanita   = 0;

        for (Dosen01 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        System.out.println("===== RATA-RATA USIA PER JENIS KELAMIN =====");
        System.out.println("Rata-rata Usia Pria   : " +
                (jmlPria   > 0 ? (double) totalPria / jmlPria     : 0));
        System.out.println("Rata-rata Usia Wanita : " +
                (jmlWanita > 0 ? (double) totalWanita / jmlWanita : 0));
        System.out.println("------------------------------");
    }

    public void infoDosenPalingTua(Dosen01[] arrayOfDosen) {
        Dosen01 palingTua = arrayOfDosen[0];
        for (Dosen01 d : arrayOfDosen) {
            if (d.usia > palingTua.usia) palingTua = d;
        }
        System.out.println("===== DOSEN PALING TUA =====");
        System.out.println("Kode          : " + palingTua.kode);
        System.out.println("Nama          : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + palingTua.getJenisKelamin());
        System.out.println("Usia          : " + palingTua.usia);
        System.out.println("------------------------------");
    }

    public void infoDosenPalingMuda(Dosen01[] arrayOfDosen) {
        Dosen01 palingMuda = arrayOfDosen[0];
        for (Dosen01 d : arrayOfDosen) {
            if (d.usia < palingMuda.usia) palingMuda = d;
        }
        System.out.println("===== DOSEN PALING MUDA =====");
        System.out.println("Kode          : " + palingMuda.kode);
        System.out.println("Nama          : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + palingMuda.getJenisKelamin());
        System.out.println("Usia          : " + palingMuda.usia);
        System.out.println("------------------------------");
    }
}
