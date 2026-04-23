package CM1;

import java.util.Scanner;

public class pusatMain20 {

    static void sortbyName (Peminjaman__20 []pnjm){
        for (int i = 1; i < 5; i++) {
            Peminjaman__20 temp = pnjm[i];
            int j=i;
            while (j>0 && 0==(pnjm[j-1].mhs.nama).compareTo(temp.mhs.nama)) {
                pnjm[j]=pnjm[j-1];
                j--;
            }
            pnjm[j]=temp;
        }
    }

    //insertion sort untuk sorting sberdasarkan denda (DESC)
    static void insertionSort (Peminjaman__20 []pnjm){
        for (int i = 1; i < 5; i++) {
            Peminjaman__20 temp = pnjm[i];
            int j=i;
            while (j>0 && pnjm[j-1].denda<temp.denda) {
                if (pnjm[j-1].denda==temp.denda){
                    sortbyName(pnjm);
                    break;
                } else {
                    pnjm[j]=pnjm[j-1];
                j   --;
                }
                
            }
            pnjm[j]=temp;
        }
    }

    static void sortNIM(Peminjaman__20[] arr) {
        // Insertion sort berdasarkan nim untuk mengurutkan data (ascending)
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Peminjaman__20 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void binarySearchNIM(Peminjaman__20[] arr, String nimCari) {
        // Buat salinan array
        Peminjaman__20[] sorted = arr.clone();
        sortNIM(sorted);

        // Binary search: cari posisi awal NIM
        int low = 0, high = sorted.length - 1;
        int found = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = sorted[mid].mhs.nim.compareTo(nimCari);
            if (cmp == 0) {
                found = mid;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found == -1) {
            System.out.println("Data dengan NIM " + nimCari + " tidak ditemukan.");
            return;
        }

        // Tampilkan semua peminjaman dengan NIM tersebut
        System.out.println("Hasil pencarian NIM: " + nimCari);
        // Cari ke kiri
        int i = found;
        while (i >= 0 && sorted[i].mhs.nim.equals(nimCari)) i--;
        i++;
        // Tampilkan dari i ke kanan selama NIM sama
        boolean ada = false;
        while (i < sorted.length && sorted[i].mhs.nim.equals(nimCari)) {
            sorted[i].tampilPeminjaman();
            ada = true;
            i++;
        }
        if (!ada) {
            System.out.println("Data dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        
        //arrayofObject :
        Mahasiswa__20 [] mhs = new Mahasiswa__20[3];
        mhs[0] = new Mahasiswa__20("22001", "Andi", "Teknik Informasi");
        mhs[1] = new Mahasiswa__20("22002", "Budi", "Teknik Informasi");
        mhs[2] = new Mahasiswa__20("22003", "Citra", "Sistem Informasi Bisnis");   
    

        Buku__20 [] buku = new Buku__20[4];
        buku[0]=new Buku__20("B001", "Algoritma", 2020, "Grade A");
        buku[1]=new Buku__20("B002", "Basis Data", 2019, "Grade B");
        buku[2]=new Buku__20("B003", "Pemrograman", 2021, "Grade A");
        buku[3]=new Buku__20("B004", "Fisika", 2024, "Grade B");
        
        
        Peminjaman__20 [] pnjm = new Peminjaman__20[5];
        pnjm[0] = new Peminjaman__20(mhs[0], buku[0], 7, buku[3].statusBuku);
        pnjm[1] = new Peminjaman__20(mhs[1], buku[1], 3, buku[1].statusBuku);
        pnjm[2] = new Peminjaman__20(mhs[2], buku[2], 10, buku[2].statusBuku);
        pnjm[3] = new Peminjaman__20(mhs[2], buku[3], 6, buku[0].statusBuku);
        pnjm[4] = new Peminjaman__20(mhs[0], buku[3], 6, buku[0].statusBuku);

        //untuk menghitung berapa denda
        for (Peminjaman__20 pn : pnjm) {
            pn.hitungDenda();
        }
        
        int pilih=99;
        while (pilih!=0) {
            //ini menu
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = tino.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    //untuk menampilkan data Mahasiswa
                    for (Mahasiswa__20  m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 2:
                    //untuk menampilkan data Buku
                    for (Buku__20  b : buku) {
                        b.tampilBuku();
                    }
                    break;
                case 3:
                    //untuk menampilkan data peminjaman
                    for (Peminjaman__20 pn : pnjm) {
                        pn.tampilPeminjaman();
                    }
                    break;
                case 4:
                    //untuk mengurutkan data peminjaman berdasarkan denda
                    insertionSort(pnjm);
                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    for (Peminjaman__20 pn : pnjm) {
                        pn.tampilPeminjaman();
                    }
                    break;
                case 5:
                    //untuk mencari data peminjaman berdasarkan NIM
                    System.out.print("Masukkan NIM: ");
                    String cari = tino.next();
                    binarySearchNIM(pnjm, cari);
                    break;
                case 0:
                    
                    break;
                default:
                    break;
            }
        }
        tino.close();
    }
}
