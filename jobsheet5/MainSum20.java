import java.util.Scanner;

public class MainSum20 {
    public static void main(String[] args) {
        Scanner tino20 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = tino20.nextInt();

        Sum20 sm = new Sum20(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i]=tino20.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.TotalBF20());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.TotalDC20(sm.keuntungan,0,elemen-1));


        tino20.close();
    }
}
