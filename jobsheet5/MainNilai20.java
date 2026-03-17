import java.util.Scanner;

public class MainNilai20 {
    public static void main(String[] args) {
        Scanner tino20 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int elemen = tino20.nextInt();

        nilai_20 ujian = new nilai_20(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai UTS Mahasiswa ke-"+(i+1)+": ");
            ujian.nilai_uts[i]=tino20.nextDouble();
            System.out.print("Masukkan nilai UAS Mahasiswa ke-"+(i+1)+": ");
            ujian.nilai_uas[i]=tino20.nextDouble();
        }

        System.out.println("Nilai UTS tertinggi menggunakan Divide and Conquer: "+ujian.tertinggiDC20(ujian.nilai_uts,0,elemen-1));
        System.out.println("Nilai UTS terendah menggunakan Divide and Conquer: "+ujian.terendahDC20(ujian.nilai_uts,0,elemen-1));
        System.out.println("Rata-rata nilai UAS menggunakan Bruteforce: "+ujian.rataNilaiBF20(ujian.nilai_uas));

        tino20.close();
    }
}
