public class MahasiswaBerprestasi20{
    Mahasiswa_20[] listMhs = new Mahasiswa_20[5];
    int idx;

    void tambah (Mahasiswa_20 m){
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        } else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa_20 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk20>listMhs[j-1].ipk20) {
                    Mahasiswa_20 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk20<listMhs[idxMin].ipk20) {
                    idxMin=j;
                }
            }
            Mahasiswa_20 tmp=listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

    void insertionSort (){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa_20 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk20>temp.ipk20) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

}
