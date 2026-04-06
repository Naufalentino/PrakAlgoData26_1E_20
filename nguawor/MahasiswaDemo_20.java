public class MahasiswaDemo_20 {
    public static void main(String[] args) {
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        Mahasiswa_20 m1 = new Mahasiswa_20("123", "Zidan", "2A", 3.2);
        Mahasiswa_20 m2 = new Mahasiswa_20("124", "Ayu", "2A", 3.5);
        Mahasiswa_20 m3 = new Mahasiswa_20("125", "Sofi", "2A", 3.1);
        Mahasiswa_20 m4 = new Mahasiswa_20("126", "Sita", "2A", 3.9);
        Mahasiswa_20 m5 = new Mahasiswa_20("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa belum di sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();
    }
}
