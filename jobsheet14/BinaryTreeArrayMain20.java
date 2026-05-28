public class BinaryTreeArrayMain20 {
    public static void main(String[] args) {
        BinaryTreeArray20 bta = new BinaryTreeArray20();
        Mahasiswa200 mhs1 = new Mahasiswa200("244160121", "Ali", "A", 3.57);
        Mahasiswa200 mhs2 = new Mahasiswa200("244160221", "Candra", "B", 3.85);
        Mahasiswa200 mhs3 = new Mahasiswa200("244160185", "Badar", "C", 3.21);
        Mahasiswa200 mhs4 = new Mahasiswa200("244160220", "Dewi", "B", 3.54);
        
        Mahasiswa200 mhs5 = new Mahasiswa200("244160131", "Devi", "A", 3.72);
        Mahasiswa200 mhs6 = new Mahasiswa200("244160205", "Ehsan", "D", 3.37);
        Mahasiswa200 mhs7 = new Mahasiswa200("244160170", "Fizi", "B", 3.46);
        
        Mahasiswa200[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}