package jobsheet6;
public class DataDosen_20 {
    Dosen_20[]dataDosen = new Dosen_20[10];
    int idx;


    void tambah (Dosen_20 dsn){
        if (idx<dataDosen.length){
            dataDosen[idx]=dsn;
            idx++;
        } else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (Dosen_20 d : dataDosen) {
            d.tampil_();
            System.out.println("--------------------------");
        }
    }

    void SortingASC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia20<dataDosen[j-1].usia20) {
                    Dosen_20 tmp = dataDosen[j];
                    dataDosen[j]=dataDosen[j-1];
                    dataDosen[j-1]=tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia20>dataDosen[idxMin].usia20) {
                    idxMin=j;
                }
            }
            Dosen_20 tmp=dataDosen[idxMin];
            dataDosen[idxMin]=dataDosen[i];
            dataDosen[i]=tmp;
        }
    }

    void insertionSort (){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen_20 temp = dataDosen[i];
            int j=i;
            while (j>0 && dataDosen[j-1].usia20<temp.usia20) {
                dataDosen[j]=dataDosen[j-1];
                j--;
            }
            dataDosen[j]=temp;
        }
    }
}