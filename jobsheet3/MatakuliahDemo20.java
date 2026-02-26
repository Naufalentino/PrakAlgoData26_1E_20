import java.util.Scanner;
public class MatakuliahDemo20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        Matakuliah20 [] arrayOfMatakuliah = new Matakuliah20[3];
        String kode, nama, dummy;
        int sks, jumlahJam;
        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
            System.out.print("Kode : ");
            kode = tino.nextLine();
            System.out.print("Nama : ");
            nama = tino.nextLine();
            System.out.print("Sks : ");
            dummy = tino.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = tino.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");
            arrayOfMatakuliah[i]= new Matakuliah20 (kode, nama, sks, jumlahJam);
        }    
        
        

        tino.close();
    }
}
