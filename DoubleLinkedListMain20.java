import java.util.Scanner;

public class DoubleLinkedListMain20 {
    static Maahaasiiswaa20 inputMahasiswa(Scanner tino){
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
            System.out.println("\n===== MENU DOUBLE LINKED LISY =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
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
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    System.out.println();
                    list.printReverse();
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
