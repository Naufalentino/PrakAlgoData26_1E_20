public class BinaryTreeArray20 {
    Mahasiswa200[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray20(){
        this.dataMahasiswa = new Mahasiswa200[10];
    }

    void populateData (Mahasiswa200 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            this.dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2*idxStart+2);
        }
    }
}