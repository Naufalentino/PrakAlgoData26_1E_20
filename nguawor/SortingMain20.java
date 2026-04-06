public class SortingMain20 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        Sorting20 dataurut1 = new Sorting20(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubleSort();
        System.out.println("Data yang sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println();

        
        int b[] = {30, 20, 2, 8, 14};

        Sorting20 dataurut2 = new Sorting20(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data yang sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        System.out.println();
    }
}
