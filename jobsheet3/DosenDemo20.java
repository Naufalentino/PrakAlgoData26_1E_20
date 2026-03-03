import java.util.Scanner;
public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        Dosen20[] arrayofDosen = new Dosen20[3];
        boolean jenisKelamin;
        String nama,kode,kelamin,dummy;
        int usia;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-"+(i+1));
            System.out.print("Kode          : ");
            kode = tino.nextLine();
            System.out.print("Nama          : ");
            nama = tino.nextLine();
            System.out.print("Jenis Kelamin : ");
            kelamin = tino.nextLine();
            if (kelamin.equalsIgnoreCase("pria")) {
                jenisKelamin = false;
            } else {
                jenisKelamin = true;
            }
            System.out.print("Usia          : ");
            dummy = tino.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");
            arrayofDosen[i]= new Dosen20 (kode, nama, jenisKelamin, usia);
        }    
        
        DataDosen20 ds1 = new DataDosen20();
        ds1.dataSemuaDosen(arrayofDosen);
        ds1.jumlahDosenPerKelamin(arrayofDosen);
        ds1.rerataUsiaDosenPerJenisKelamin(arrayofDosen);
        ds1.infoDosenPalingTua(arrayofDosen);
        ds1.infoDosenPalingMuda(arrayofDosen);


        tino.close();
    }
}
