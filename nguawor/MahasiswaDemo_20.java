import java.util.Scanner;

public class MahasiswaDemo_20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        for(int i=0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            String nim =tino.nextLine();
            System.out.print("Nama    : ");
            String nama = tino.nextLine();
            System.out.print("Kelas   : ");
            String kelas = tino.nextLine();
            System.out.print("IPK     : ");
            String dummy = tino.nextLine();
            double ipk = Double.parseDouble(dummy);
            System.out.println("-----------------------------------");
            Mahasiswa_20 m = new Mahasiswa_20(nim,nama,kelas,ipk);
            list.tambah(m);
        }

        System.out.println("Data Mahasiswa belum di sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();

        tino.close();
    }
}
