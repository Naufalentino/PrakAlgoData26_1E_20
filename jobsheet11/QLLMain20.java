import java.util.Scanner;

public class QLLMain20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimal antrian: ");
        int capacity = tino.nextInt();
        tino.nextLine();
        QueueLinkedList20 antrian = new QueueLinkedList20(capacity);
        int pilih;
        do {
            System.out.println("\n=== Menu Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilih = tino.nextInt();
            tino.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama    : ");
                    String nama = tino.nextLine();
                    System.out.print("NIM     : ");
                    String nim =tino.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = tino.nextLine();
                    System.out.print("IPK     : ");
                    String dummy = tino.nextLine();
                    double ipk = Double.parseDouble(dummy);
                    System.out.println("-----------------------------------");
                    antrian.enqueue(new AntrianLayanan020(nim,nama,kelas,ipk));
                    break;
                case 2:
                    AntrianLayanan020 dipanggil = antrian.dequeue();
                    if (dipanggil != null) {
                        System.out.println("Memanggil mahasiswa: " + dipanggil.nama);
                    }
                    break;
                case 3:
                    System.out.println("Apakah antrian kosong? " + (antrian.isEmpty() ? "Ya" : "Tidak"));
                    break;
                case 4:
                    System.out.println("Apakah antrian penuh? " + (antrian.isFull() ? "Ya" : "Tidak"));
                    break;
                case 5:
                    antrian.peekFront();
                    break;
                case 6:
                    antrian.peekRear();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa mengantre: " + antrian.getSize());
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    antrian.displayAll();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        tino.close();
    }
}

