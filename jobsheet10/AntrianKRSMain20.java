import java.util.Scanner;
public class AntrianKRSMain20 {

    static void tampilkanMenu() {
        System.out.println("\n===== Menu Antrian KRS - Persetujuan DPA =====");
        System.out.println("1.  Tambah Mahasiswa ke Antrian");
        System.out.println("2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)");
        System.out.println("3.  Tampilkan Semua Antrian");
        System.out.println("4.  Tampilkan 2 Antrian Terdepan");
        System.out.println("5.  Lihat Antrian Paling Akhir");
        System.out.println("6.  Cek Antrian Kosong");
        System.out.println("7.  Cek Antrian Penuh");
        System.out.println("8.  Kosongkan Antrian");
        System.out.println("9.  Cetak Jumlah Antrian");
        System.out.println("10. Cetak Jumlah yang Sudah Proses KRS");
        System.out.println("11. Cetak Jumlah Mahasiswa Belum Proses KRS");
        System.out.println("0.  Keluar");
        System.out.println("----------------------------------------------");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        int MAX_ANTRIAN = 10;
        int BATAS_DPA = 30;
        AntrianKRS20 antrian = new AntrianKRS20(MAX_ANTRIAN, BATAS_DPA);

        System.out.println("============================================");
        System.out.println("  Sistem Antrian KRS - Dosen PA (DPA)");
        System.out.println("  Kapasitas antrian : " + MAX_ANTRIAN + " mahasiswa");
        System.out.println("  Batas per DPA     : " + BATAS_DPA + " mahasiswa");
        System.out.println("============================================");
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = tino.nextInt();
            tino.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = tino.nextLine();
                    System.out.print("Nama  : ");
                    String nama = tino.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = tino.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = tino.nextLine();
                    Mahasiswaaaa20 mhs = new Mahasiswaaaa20(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian dalam keadaan KOSONG.");
                    } else {
                        System.out.println("Antrian TIDAK kosong. Jumlah antrian: " + antrian.getJumlahAntrian());
                    }
                    break;
                case 7:
                    if (antrian.isFull()) {
                        System.out.println("Antrian dalam keadaan PENUH.");
                    } else {
                        System.out.println("Antrian BELUM penuh. Sisa slot: " + (10 - antrian.getJumlahAntrian()));
                    }
                    break;
                case 8:
                    antrian.kosongkanAntrian();
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + antrian.getTotalDilayani());
                    break;
                case 11:
                    System.out.println("Jumlah mahasiswa dalam antrian (belum proses KRS): " + antrian.getBelumKRS());
                    System.out.println("Sisa kuota DPA: " + (30 - antrian.getTotalDilayani()) + " mahasiswa");
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 0);
        tino.close();
    }
}
