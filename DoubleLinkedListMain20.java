import java.util.Scanner;

public class DoubleLinkedListMain20 {
    static Maahaasiiswaa20 inputMahasiswa(Scanner tino){
        tino.nextLine();
        System.out.print("Masukkan NIM   : ");
        String nim = tino.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama =tino.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = tino.nextLine();
        System.out.print("Masukkab IPK   : ");
        String dummy = tino.nextLine();
        double ipk = Double.parseDouble(dummy);
        Maahaasiiswaa20 mhs = new Maahaasiiswaa20(nim, nama, kelas, ipk);
        return mhs;
    }
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        DoublelinkedList20 list = new DoublelinkedList20();
        int pilihan = 0;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Sisipkan data di tengah (berdasarkan index)");
            System.out.println("5. Hapus data di awal");
            System.out.println("6. Hapus data di akhir");
            System.out.println("7. Hapus data di tengah (setelah NIM)");
            System.out.println("8. Hapus data di tengah (pada indeks nya)");
            System.out.println("9. Tampilkan data");
            System.out.println("10. Tampilkan data pertama");
            System.out.println("11. Tampilkan data terakhir");
            System.out.println("12. Tampilkan data (berdasarkan index)");
            System.out.println("13. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = tino.nextInt();
            tino.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = tino.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama =tino.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    String kelas = tino.nextLine();
                    System.out.print("Masukkab IPK   : ");
                    String dummy = tino.nextLine();
                    double ipk = Double.parseDouble(dummy);
                    Maahaasiiswaa20 mhsAwal = new Maahaasiiswaa20(nim,nama,kelas,ipk);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    System.out.print("Masukkan NIM   : ");
                    String nim1 = tino.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama1 =tino.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    String kelas1 = tino.nextLine();
                    System.out.print("Masukkab IPK   : ");
                    String dummy1 = tino.nextLine();
                    double ipk1 = Double.parseDouble(dummy1);
                    Maahaasiiswaa20 mhsAkhir = new Maahaasiiswaa20(nim1,nama1,kelas1,ipk1);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = tino.nextLine();
                    System.out.println("Masukkan data baru:");
                    Maahaasiiswaa20 dataBaru = inputMahasiswa(tino);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    System.out.print("Masukkan Index yang ingin dicari: ");
                    int keyIdx = tino.nextInt();
                    System.out.println("Masukkan data baru:");
                    Maahaasiiswaa20 dataIdx = inputMahasiswa(tino);
                    list.add(keyIdx, dataIdx);
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
                case 7:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String key = tino.nextLine();
                    list.removeAfter(key);
                    break;
                case 8:
                    System.out.print("Masukkan index data yang ingin dihapus : ");
                    int idx = tino.nextInt();
                    list.remove(idx);
                    break;
                case 9:
                    list.print();
                    System.out.println();
                    list.printReverse();
                    break;
                case 10:
                    list.getFirst();
                    break;
                case 11:
                    list.getLast();
                    break;
                case 12:
                    System.out.print("Masukkan index data yang ingin ditampilkan : ");
                    int index = tino.nextInt();
                    list.getIndex(index);
                    break;
                case 13:
                    list.jumlahData();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        tino.close();
    }
}
