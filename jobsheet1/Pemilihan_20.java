import java.util.Scanner;

public class Pemilihan_20 {
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        double tugas,kuis,uts,uas,nilai_akhir;
        String nilai_huruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = tino.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = tino.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = tino.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = tino.nextDouble();
        System.out.println("======================");
        System.out.println("======================");

        nilai_akhir = (tugas*0.2)+(kuis*0.2)+(uts*0.3)+(uas*0.4);
        nilai_huruf = (nilai_akhir > 80) ? "A" :
                (nilai_akhir > 73) ? "B+" :
                (nilai_akhir > 65) ? "B" :
                (nilai_akhir > 60) ? "C+" :
                (nilai_akhir > 50) ? "C" :
                (nilai_akhir > 39) ? "D" : "E" ;

        if ((tugas<=100&&tugas>=0)&&(kuis<=100&&kuis>=0)&&(uts<=100&&uts>=0)&&(uas<=100&&uas>=0)) {
            System.out.printf("Nilai akhir: %2.1f%n",nilai_akhir);
            System.out.println("Nilai huruf: "+nilai_huruf);
            System.out.println("======================");
            System.out.println("======================");
            if (nilai_huruf.equals("D")||nilai_huruf.equals("E")) {
                System.out.println("ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        } else {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        }

        tino.close();
    }
}
