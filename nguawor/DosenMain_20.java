public class DosenMain_20 {
    public static void main(String[] args) {
        DataDosen_20 liss = new DataDosen_20();
        // true = woman
        Dosen_20 dsn1 = new Dosen_20("01","Budi",false,20);
        Dosen_20 dsn2 = new Dosen_20("02","Imyn",false,19);
        Dosen_20 dsn3 = new Dosen_20("03","Wiwy",true,22);
        Dosen_20 dsn4 = new Dosen_20("04","Wowo",false,21);
        Dosen_20 dsn5 = new Dosen_20("05","Wati",true,18);
        Dosen_20 dsn6 = new Dosen_20("06","Lani",true,25);
        Dosen_20 dsn7 = new Dosen_20("07","Bob",false,27);
        Dosen_20 dsn8 = new Dosen_20("08","Mimi",true,44);
        Dosen_20 dsn9 = new Dosen_20("09","Lupyn",true,35);
        Dosen_20 dsn10 = new Dosen_20("10","Owi",false,30);

        liss.tambah(dsn1);
        liss.tambah(dsn2);
        liss.tambah(dsn3);
        liss.tambah(dsn4);
        liss.tambah(dsn5);
        liss.tambah(dsn6);
        liss.tambah(dsn7);
        liss.tambah(dsn8);
        liss.tambah(dsn9);
        liss.tambah(dsn10);
        
        System.out.println("Data Dosen belum di sorting: ");
        liss.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan USIA menggunakan bubble sort (ASC)");
        liss.SortingASC();
        liss.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan USIA menggunakan selection sort (DESC)");
        liss.sortingDSC();
        liss.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan USIA menggunakan insertion sort (DESC)");
        liss.insertionSort();
        liss.tampil();
    }

}