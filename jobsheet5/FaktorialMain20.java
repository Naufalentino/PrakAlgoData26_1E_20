import java.util.Scanner;

public class FaktorialMain20 {
    public static void main(String[] args) {
        Scanner tino20 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = tino20.nextInt();

        Faktorial20 fk = new Faktorial20();
        System.out.println("Nilai faktorial "+nilai+" menggunakan BF: "+fk.FaktorialBF20(nilai));
        System.out.println("Nilai faktorial "+nilai+" menggunakan DC: "+fk.FaktorialDC20(nilai));

        tino20.close();
    }
    
}