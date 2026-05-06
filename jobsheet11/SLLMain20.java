import java.util.Scanner;

public class SLLMain20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        SingleLinkedList20 sll = new SingleLinkedList20();
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
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
            Mahasiswa020 m = new Mahasiswa020(nim,nama,kelas,ipk);
            sll.addFirst(m);
        }

        tino.close();
    }
}
