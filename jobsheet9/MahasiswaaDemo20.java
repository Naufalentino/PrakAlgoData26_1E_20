package jobsheet9;

import java.util.Scanner;

public class MahasiswaaDemo20 {
    public static void main(String[] args) {
        StackTugasMahasiswa20 stack = new StackTugasMahasiswa20(5);
        Scanner tino = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Terbawah(Pertama)");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Melihat Total Tugas");
            System.out.print("Pilih: ");
            pilih = tino.nextInt();
            tino.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = tino.nextLine();
                    System.out.print("NIM: ");
                    String nim  = tino.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = tino.nextLine();
                    Mahasiiswa20 mhs = new Mahasiiswa20 (nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiiswa20 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari "+dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = tino.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiiswa20 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4: 
                    Mahasiiswa20 lihat2 = stack.peekbawah();
                    if (lihat2 != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihat2.nama);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    System.out.print("Total tugas yang telah dikumpulkan sebanyak ");
                    stack.totalTugas();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
        tino.close();
    }
}
