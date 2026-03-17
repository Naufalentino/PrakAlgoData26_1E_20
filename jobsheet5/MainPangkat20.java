import java.util.Scanner;

public class MainPangkat20 {
    public static void main(String[] args) {
        Scanner tino20 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = tino20.nextInt();

        Pangkat20[] png = new Pangkat20[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = tino20.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = tino20.nextInt();
            png[i]= new Pangkat20(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat20 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF20(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat20 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC20(p.nilai, p.pangkat));
        }
        tino20.close();
    }
}
