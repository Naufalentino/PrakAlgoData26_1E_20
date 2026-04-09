package jobsheet6;

import java.util.Scanner;

public class MahasiswaDemoo20 {
    public static void main(String[] args) {
        MahasiswaBerprestasii20 list = new MahasiswaBerprestasii20(); 
        Scanner tino = new Scanner(System.in); 
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) {
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
            Mahasiswaa20 m = new Mahasiswaa20(nim,nama,kelas,ipk);
            list.tambah(m);
        }
        list.tampil();
        System.out.println("-------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = tino.nextDouble();
        System.out.println("---------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("---------------------------------");
        double posisi2 = list.findBinarySearch(cari,0,jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        tino.close();
    }
}
