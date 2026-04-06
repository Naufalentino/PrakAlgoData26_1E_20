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

    
}
