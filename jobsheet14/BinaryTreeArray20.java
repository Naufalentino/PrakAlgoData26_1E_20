public class BinaryTreeArray20 {
    Mahasiswa200[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray20(){
        dataMahasiswa = new Mahasiswa200[30];
    }

    void populateData (Mahasiswa200 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast && dataMahasiswa[idxStart]!=null) {
            traverseInOrder(2*idxStart+1);
            this.dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2*idxStart+2);
        }
    }
    
    public void add(Mahasiswa200 data) {
        if (dataMahasiswa[0]==null) {
            dataMahasiswa[0]=data;
            return;
        } else {
            int count=0;
            while (count+1<dataMahasiswa.length) {
                if (dataMahasiswa[count]==null) {
                    dataMahasiswa[count]=data;
                    idxLast=Math.max(idxLast, count);
                    return;
                } else if (dataMahasiswa[count].ipk>data.ipk) {
                    count=2*count+1;
                } else if (dataMahasiswa[count].ipk<data.ipk) {
                    count=2*count+2;
                }
            }
        }
    }
        
    void traversePreOrder(int idxStart){
        if (idxStart <= idxLast && dataMahasiswa[idxStart]!=null) {
            this.dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }
}