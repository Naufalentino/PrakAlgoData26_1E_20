import java.util.Scanner;

public class Perulangan_20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        

        System.out.print("Masukkan NIM anda: ");
        double nim = tino.nextDouble();

        double n = nim % 100;
        if (n<10) {
            n+=10;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i==10||i==15) {
                continue;
            }
            if (i%3==0) {
                System.out.print("# ");
                continue;
            } if (i%2==0) {
                System.out.print(i+" ");
                continue;
            } if (i%2!=0) {
                System.out.print("* ");
                continue;
            } 
            
        }
        
            
   

        tino.close();
    }

}