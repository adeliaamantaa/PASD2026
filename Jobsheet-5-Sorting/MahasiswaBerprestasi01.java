public class MahasiswaBerprestasi01 {

    Mahasiswa01[] listMhs;
    public int idx;

    public MahasiswaBerprestasi01() {
        listMhs = new Mahasiswa01[5];
        idx = 0;
    }

    public MahasiswaBerprestasi01(int size) {
        listMhs = new Mahasiswa01[size];
        idx = 0;
    }

    public void tambah(Mahasiswa01 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa01 tmp = listMhs[j];
                    listMhs[j]     = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa01 tmp      = listMhs[idxMin];
            listMhs[idxMin]    = listMhs[i];
            listMhs[i]         = tmp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa01 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    public void insertionSortDesc() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa01 temp = listMhs[i];
            int j = i;
            // Ganti > menjadi < untuk urutan descending
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
