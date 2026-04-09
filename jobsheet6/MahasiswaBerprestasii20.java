package jobsheet6;

public class MahasiswaBerprestasii20 {
    Mahasiswaa20 []listMhs = new Mahasiswaa20[5]; 
    int idx;


    void tambah (Mahasiswaa20 m){
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        } else{
            System.out.println("data sudah penuh");
        }
    }


    void tampil(){
        for (Mahasiswaa20 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    int sequentialSearch(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
               posisi=j;
               break; 
            }
        }
        return posisi;
    }

    void tampilPosisi (double x, int pos){
        if (pos!=-1){
            System.out.println("Data mahasiswa dengan IPK : "+x+" ditemukan pada indeks "+pos);
        } else {
            System.out.println("data "+x+" tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos!=-1){
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);            
        } else {
            System.out.println("Data mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }
}
