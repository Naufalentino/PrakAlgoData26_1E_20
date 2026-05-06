public class SLLMain20 {
    public static void main(String[] args) {
        SingleLinkedList20 sll = new SingleLinkedList20();
        Mahasiswa020 mhs1 = new Mahasiswa020("24212200","Alvaro","1A",4.0);
        Mahasiswa020 mhs2 = new Mahasiswa020("23020101","Bimon","2B",3.8);
        Mahasiswa020 mhs3 = new Mahasiswa020("22212202","Cintia","3C",3.5);
        Mahasiswa020 mhs4 = new Mahasiswa020("21212203","Dirga","4D",3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
