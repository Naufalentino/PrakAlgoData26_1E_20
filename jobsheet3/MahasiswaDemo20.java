import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        Mahasiswa20 [] arrayOfMahasiswa = new Mahasiswa20 [3];
        String dummy;
        for(int i=0; i < 3; i++) {
            arrayOfMahasiswa [i] = new Mahasiswa20 ();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim =tino.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = tino.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = tino.nextLine();
            System.out.print("IPK     : ");
            dummy = tino.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
        }
        
        Mahasiswa20 ds1 = new Mahasiswa20();
        ds1.cetakInfo(arrayOfMahasiswa);



        tino.close();

    }
}
