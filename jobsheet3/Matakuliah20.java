import java.util.Scanner;

public class Matakuliah20{
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    static Scanner tino = new Scanner(System.in);

    public Matakuliah20(String kode, String nama, int sks, int jumlahJam){
        this.kode=kode;
        this.nama=nama;
        this.sks=sks;
        this.jumlahJam=jumlahJam;
    }

    static Matakuliah20[] tambahData(Matakuliah20[]arrayOfMatakuliah){
        String kode, nama, dummy;
        int sks, jumlahJam;
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
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
        return arrayOfMatakuliah;
    }

    static void cetakInfo(Matakuliah20[]arrayOfMatakuliah){
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-"+(i+1));
            System.out.println("Kode          :"+arrayOfMatakuliah[i].kode);
            System.out.println("Nama          :"+arrayOfMatakuliah[i].nama);
            System.out.println("Sks           :"+arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam    :"+arrayOfMatakuliah[i].jumlahJam);
            System.out.println("---------------------------------------");
        }
    }
}
