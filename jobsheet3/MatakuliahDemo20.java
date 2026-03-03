import java.util.Scanner;
public class MatakuliahDemo20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);

        System.out.print("Jumlah Matakuliah: ");
        int jumlah=tino.nextInt();
        Matakuliah20 [] arrayOfMatakuliah = new Matakuliah20[jumlah];
        
        arrayOfMatakuliah=Matakuliah20.tambahData(arrayOfMatakuliah);
        Matakuliah20.cetakInfo(arrayOfMatakuliah);
        
        

        tino.close();
    }
}
