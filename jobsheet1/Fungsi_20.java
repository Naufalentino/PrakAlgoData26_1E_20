import java.util.Scanner;

public class Fungsi_20 {
    public static void main(String[] args) {
        Scanner tino20 = new Scanner(System.in);
        int []hargaBunga = {75000,50000,60000,10000};
        int []total20 = {0,0,0,0};
        String [] status = new String[4];

        int [][] dataCabang = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        int [][] akhir20 = new int [4] [4];

        for (int i20 = 0; i20 < akhir20.length; i20++) {
            for (int j20 = 0; j20 < akhir20[i20].length; j20++) {
                akhir20 [i20][j20] = hargaBunga[j20] * dataCabang[i20][j20];
            }
        }

        for (int i20 = 0; i20 < akhir20.length; i20++) {
            for (int j20 = 0; j20 < akhir20[i20].length; j20++) {
                total20 [i20] += akhir20[i20][j20];
            }
        }
        for (int i = 0; i < status.length; i++) {
            if (total20[i]>1500000) {
                status[i] = "Sangat Baik";
            } else {
                status[i] = "Perlu Evaluasi";
            }
        }

        tampilData(total20, status);
        
        tino20.close();
    }

    static void tampilData (int[]totalPerCabang,String [] statusCabang){
        System.out.println("Total Penjualan tiap cabang pada hari-X: ");
        System.out.printf("%-14s %-13s %-13s %-13s %-13s %n","RoyalGarden","1","2","3","4");
        System.out.printf("%-14s %-13s %-13s %-13s %-13s %n","",totalPerCabang[0],totalPerCabang[1],totalPerCabang[2],totalPerCabang[3]);
        System.out.println();
        System.out.println("Status penjualan tiap cabang: ");
        System.out.printf("%-14s   %-20s%n","RoyalGarden 1",statusCabang[0]);
        System.out.printf("%-14s   %-20s%n","RoyalGarden 2",statusCabang[1]);
        System.out.printf("%-14s   %-20s%n","RoyalGarden 3",statusCabang[2]);
        System.out.printf("%-14s   %-20s%n","RoyalGarden 4",statusCabang[3]);
    }
}

