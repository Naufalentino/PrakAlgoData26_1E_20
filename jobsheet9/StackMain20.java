package jobsheet9;

import java.util.Scanner;

public class StackMain20 {
    public static void main(String[] args) {
        StackSurat20 stack = new StackSurat20(10);
        Scanner tino = new Scanner(System.in);
        int pilih;
        
        //ini adalah menu
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Memproses Surat Izin");
            System.out.println("2. Menerima Surat izin");
            System.out.println("3. Melihat Surat Izin Terakhir");
            System.out.println("4. Mencari Surat");
            System.out.print("Pilih: ");
            pilih = tino.nextInt();
            tino.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    String nama = tino.nextLine();
                    System.out.print("Id Surat: ");
                    String idSurat  = tino.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = tino.nextLine();
                    System.out.print("Jenis Izin (Sakit/Izin): ");
                    String dummy  = tino.nextLine();
                    char jenisIzin = Character.toUpperCase(dummy.charAt(0));
                    System.out.print("Durasi: ");
                    dummy = tino.nextLine();
                    int durasi = Integer.parseInt(dummy);
                    Surat20 srt = new Surat20 (idSurat, nama, kelas, jenisIzin, durasi);
                    stack.proses_surat_izin(srt);
                    System.out.printf("Surat %s berhasil diproses\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat20 diterima = stack.terima_surat_izin();
                    if (diterima != null) {
                        System.out.println("Berhasil memverifikasi Surat izin dari "+diterima.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat20 lihat = stack.lihat_surat_izin_terakhir();
                    if (lihat != null) {
                        System.out.println("Surat terakhir yang diproses adalah surat milik " + lihat.namaMahasiswa);
                    }
                    break;
                case 4: 
                    String cari;
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    cari = tino.nextLine();
                    stack.cari_surat(cari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
        tino.close();
    }
}
