import java.util.Scanner;

public class Tugas1_20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        char [] KODE = {'A','B','D','E','F','G','H','L','N','T'};
        char [][] KOTA = {{'B','A','N','T','E','N'},
                        {'J','A','K','A','R','T','A'},
                        {'B','A','N','D','U','N','G'},
                        {'C','I','R','E','B','O','N'},
                        {'B','O','G','O','R'},
                        {'P','E','K','A','L','O','N','G','A','N'},
                        {'S','E','M','A','R','A','N','G'},
                        {'S','U','R','A','B','A','Y','A'},
                        {'M','A','L','A','N','G'},
                        {'T','E','G','A','L'}};


        System.out.print("Masukkan Kode plat nomor anda: ");
        String platNomor = tino.nextLine();  
        platNomor = platNomor.toUpperCase();
        char plat = platNomor.charAt(0);
        int lock=0;
        
        for (int i = 0; i < KODE.length; i++) {
            if (plat == KODE[i]) {
                lock = i;
                System.out.print("Kode plat anda adalah ");
                for (int j = 0; j < KOTA[lock].length; j++) {
                    System.out.print(KOTA[lock][j]);
                }
                break;
            }
            if (i==KODE.length-1) {
                System.out.println("Maaf Kode Plat anda invalid");
            }
        }

        
        
        tino.close();
    }
}