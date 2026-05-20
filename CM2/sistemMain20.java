// package CM2;

import java.util.Scanner;

public class sistemMain20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        linkListSistem20 dll = new linkListSistem20();
        int pilih = 0;

        dataSistem20 an1 = new dataSistem20(dll.count, "Ainra", "08224500000");
        dll.tambahAntrian(an1);
        dataSistem20 an2 = new dataSistem20(dll.count, "Danra", "08224511111");
        dll.tambahAntrian(an2);
        dataSistem20 an3 = new dataSistem20(dll.count, "Sanri", "08224522222");
        dll.tambahAntrian(an3);

        System.out.println("\n\n\n\n\n");
        // dataSistem20 ps1 = new dataSistem20(123, "Es Teler", "5000");
        // dll.hapusAntrianDanPesan(ps1);

        do {
            System.out.println("===============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = tino.nextInt();
            tino.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = tino.nextLine();
                    System.out.print("No HP        : ");
                    String no = tino.nextLine();
                    int antri = dll.count;
                    dataSistem20 an = new dataSistem20(antri, nama, no);
                    dll.tambahAntrian(an);
                    break;
                case 2:
                    System.out.println("===============================");
                    System.out.println("Daftar Antrian Pembeli");
                    System.out.println("===============================");
                    dll.cetakAntrian();
                    break;
                case 3:
                    if (!(dll.isAntrianKosong())) {
                        System.out.print("Kode Pesanan : ");
                        String dummy1 = tino.nextLine();
                        int kode = Integer.parseInt(dummy1);
                        System.out.print("Nama Pesanan : ");
                        String name = tino.nextLine();
                        System.out.print("Harga        : ");
                        String harga = tino.nextLine();
                        dataSistem20 ps = new dataSistem20(kode, name, harga);
                        dll.hapusAntrianDanPesan(ps);
                    } else {
                        System.out.println("Antrian pelanggan masih kosong!");
                    }
                    break;
                case 4:
                    dll.cetakLaporanPesanan();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan invalid");
                    break;
            }

        }while(pilih!=0);

        tino.close();
    }
}
