import java.util.Scanner;

public class LayananAkademiSIAKAD20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        AntrianLayanan20 antrian = new AntrianLayanan20(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = tino.nextInt();
            switch (pilihan) {
                case 1:
                    tino.nextLine();
                    System.out.print("NIM   : ");
                    String nim = tino.nextLine();
                    System.out.print("Nama  : ");
                    String nama = tino.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = tino.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = tino.nextLine();
                    Maahaasiswa20 mhs = new Maahaasiswa20(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Maahaasiswa20 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: "+antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while(pilihan!=0);

        tino.close();
    }
}
