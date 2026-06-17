import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemNilaiMain20 {
    static ArrayList<Mahasiswa2000> listMahasiswa = new ArrayList<>();
    static ArrayList<MataKuliah200> listMataKuliah = new ArrayList<>();
    static ArrayList<Nilai20> listNilai = new ArrayList<>();
    static Queue<Mahasiswa2000> antreanHapusMahasiswa = new LinkedList<>();

    public static void main(String[] args) {
        initData(); 
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Antrean Hapus Mahasiswa (Queue)");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    inputNilai(sc);
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa(sc);
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    menuQueueHapus(sc);
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (menu != 6);
    }

    private static void initData() {
        listMahasiswa.add(new Mahasiswa2000("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new Mahasiswa2000("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new Mahasiswa2000("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new Mahasiswa2000("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new Mahasiswa2000("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new Mahasiswa2000("20006", "Ubaidah", "021xxx"));

        listMataKuliah.add(new MataKuliah200("00001", "Internet of Things", 3));
        listMataKuliah.add(new MataKuliah200("00002", "Algoritma dan Struktur Data", 2));
        listMataKuliah.add(new MataKuliah200("00003", "Algoritma dan Pemrograman", 2));
        listMataKuliah.add(new MataKuliah200("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMataKuliah.add(new MataKuliah200("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    private static void inputNilai(Scanner sc) {
        System.out.println("Masukkan data");
        System.out.print("Nilai : ");
        double nilaiAngka = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nDAFTAR MAHASISWA");
        System.out.printf("%-10s | %-15s | %-10s\n", "NIM", "Nama", "Telf");
        for (Mahasiswa2000 mhs : listMahasiswa) {
            System.out.println(mhs);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = sc.nextLine();
        
        Mahasiswa2000 mhsTerpilih = null;
        for (Mahasiswa2000 mhs : listMahasiswa) {
            if (mhs.nim.equals(nim)) {
                mhsTerpilih = mhs;
                break;
            }
        }

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.printf("%-10s | %-40s | %-5s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah200 mk : listMataKuliah) {
            System.out.println(mk);
        }
        System.out.print("Pilih MK by kode: ");
        String kodeMK = sc.nextLine();

        MataKuliah200 mkTerpilih = null;
        for (MataKuliah200 mk : listMataKuliah) {
            if (mk.kode.equals(kodeMK)) {
                mkTerpilih = mk;
                break;
            }
        }

        if (mhsTerpilih != null && mkTerpilih != null) {
            listNilai.add(new Nilai20(mhsTerpilih, mkTerpilih, nilaiAngka));
            System.out.println("Data nilai berhasil ditambahkan!");
        } else {
            System.out.println("NIM atau Kode MK tidak ditemukan! Transaksi gagal.");
        }
    }

    private static void tampilNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.printf("%-10s | %-15s | %-40s | %-5s | %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai20 n : listNilai) {
            System.out.printf("%-10s | %-15s | %-40s | %-5d | %-5.2f\n", 
                n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilaiAngka);
        }
    }

    private static void cariNilaiMahasiswa(Scanner sc) {
        System.out.print("Masukkan data mahasiswa [nim] : ");
        String searchNim = sc.nextLine();
        
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.printf("%-10s | %-15s | %-40s | %-5s | %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        
        int totalSks = 0;
        boolean ditemukan = false;
        
        for (Nilai20 n : listNilai) {
            if (n.mhs.nim.equals(searchNim)) {
                System.out.printf("%-10s | %-15s | %-40s | %-5d | %-5.2f\n", 
                    n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilaiAngka);
                totalSks += n.mk.sks;
                ditemukan = true;
            }
        }
        
        if (ditemukan) {
            System.out.println("Total SKS " + totalSks + " telah diambil.");
        } else {
            System.out.println("Data nilai mahasiswa dengan NIM " + searchNim + " tidak ditemukan.");
        }
    }

    private static void urutDataNilai() {
        if (listNilai.isEmpty()) {
            System.out.println("Data nilai masih kosong!");
            return;
        }

        Collections.sort(listNilai, new Comparator<Nilai20>() {
            @Override
            public int compare(Nilai20 n1, Nilai20 n2) {
                return Double.compare(n1.nilaiAngka, n2.nilaiAngka);
            }
        });

        System.out.println("\nDAFTAR NILAI MAHASISWA (URUT ASCENDING BERDASARKAN NILAI)");
        System.out.printf("%-10s | %-15s | %-40s | %-5s | %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai20 n : listNilai) {
            System.out.printf("%-10s | %-15s | %-40s | %-5d | %-5.2f\n", 
                n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilaiAngka);
        }
    }

    private static void menuQueueHapus(Scanner sc) {
        System.out.println("\n--- PROSEDUR ANTREAN HAPUS MAHASISWA (QUEUE) ---");
        System.out.println("1. Daftarkan Mahasiswa ke Antrean Hapus");
        System.out.println("2. Eksekusi Hapus Mahasiswa Terdepan (Poll)");
        System.out.println("3. Lihat Antrean Saat Ini");
        System.out.print("Pilih sub-menu: ");
        int subMenu = sc.nextInt();
        sc.nextLine();

        switch (subMenu) {
            case 1:
                System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
                String nimInput = sc.nextLine();
                Mahasiswa2000 target = null;
                for (Mahasiswa2000 mhs : listMahasiswa) {
                    if (mhs.nim.equals(nimInput)) {
                        target = mhs;
                        break;
                    }
                }
                if (target != null) {
                    antreanHapusMahasiswa.add(target);
                    System.out.println(target.nama + " berhasil dimasukkan ke antrean hapus.");
                } else {
                    System.out.println("Mahasiswa tidak ditemukan.");
                }
                break;
            case 2:
                // Menghapus data dengan prinsip FIFO
                Mahasiswa2000 dihapus = antreanHapusMahasiswa.poll();
                if (dihapus != null) {
                    // Hapus dari data master mahasiswa
                    listMahasiswa.remove(dihapus);
                    // Hapus semua relasi nilai yang dimiliki mahasiswa tersebut
                    listNilai.removeIf(nilai -> nilai.mhs.nim.equals(dihapus.nim));
                    System.out.println("BERHASIL: " + dihapus.nama + " telah dihapus dari sistem.");
                } else {
                    System.out.println("Antrean kosong, tidak ada mahasiswa yang didelete.");
                }
                break;
            case 3:
                System.out.println("\nDAFTAR ANTREAN HAPUS:");
                if (antreanHapusMahasiswa.isEmpty()) {
                    System.out.println("[Antrean Kosong]");
                } else {
                    for (Mahasiswa2000 mhs : antreanHapusMahasiswa) {
                        System.out.println("- " + mhs.nama + " (" + mhs.nim + ")");
                    }
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }
    }
}