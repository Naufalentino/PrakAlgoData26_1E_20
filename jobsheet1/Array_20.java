import java.util.Scanner;
public class Array_20 {
    static Scanner tino20 = new Scanner(System.in);

    static void menu20 () {
        System.out.println("==========================================");
        System.out.println("      SISTEM SIAKAD SEDERHANA (MENU)");
        System.out.println("=========================================="); 
        System.out.println("1. Input nilai mata kuliah");
        System.out.println("2. Lihat KHS (konversi & IP + status)");
        System.out.println("3. Keluar");
        System.out.println("==========================================");
    }

    static int tampilMahasiswa20 (String[][] listMahasiswa20, int jumlah20) {
        int pilihSiswa20 = 0;
        System.out.println("\nDaftar Mahasiswa: ");
        for (int i20 = 0; i20 < listMahasiswa20.length; i20++) {
            System.out.print((i20+1)+". ");
            if (listMahasiswa20[i20][0] != null) {
                System.out.print(listMahasiswa20[i20][0]+" / ");
            } else {
                System.out.print("(belum diisi) / ");
            } if (listMahasiswa20[i20][1] != null) {
                System.out.print(listMahasiswa20[i20][1]);
            } else {
                System.out.print("-");
            }
            System.out.println();
        }
        if (jumlah20 == 1) {
            System.out.print("Pilih nomor Mahasiswa ("+jumlah20+"): ");
            pilihSiswa20 = tino20.nextInt();
        } else {
            System.out.print("Pilih nomor Mahasiswa (1-"+jumlah20+"): ");
            pilihSiswa20 = tino20.nextInt();
        }
        return pilihSiswa20;
    }

    static String[][] bacaMahasiwa20 (String[][] listMahasiswa20, int kunci20) {
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");
        tino20.nextLine();
        System.out.print("Nama : ");
        listMahasiswa20[kunci20-1][0] = tino20.nextLine();
        System.out.print("NIM  : ");
        listMahasiswa20[kunci20-1][1] = tino20.nextLine();
        System.out.println();
        return listMahasiswa20;
    } 

    static double[][]bacaNilai20 (double [][] dataMahasiswa20, String[] matkul20, int kunci20) {
        System.out.println("Masukkan nilai (0 - 100) untuk mata kuliah berikut: ");
        for (int i20 = 0; i20 < matkul20.length;) {
            System.out.print((i20+1)+". "+matkul20[i20]+": ");
            dataMahasiswa20[kunci20-1][i20] = tino20.nextDouble();
            if (dataMahasiswa20[kunci20-1][i20]<0 || dataMahasiswa20[kunci20-1][i20]>100) {
                System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100.");
                while ((dataMahasiswa20[kunci20-1][i20]<0 || dataMahasiswa20[kunci20-1][i20]>100)) {
                    System.out.print("  "+matkul20[i20]+": ");
                    dataMahasiswa20[kunci20-1][i20] = tino20.nextDouble();
                }
            }
            i20++;
        }
        System.out.println("\n[OK] Semua nilai berhasil dimasukkan.\n");
        return dataMahasiswa20;
    }

    static void tampilKHS20 (double[][] nilaiMahasiswa20, String[][] namaMahasiswa20,int[] listSks20, String[] listMatkul20, int kunci20) {
        String Status20 = "";
        String []nilaiHuruf20 = new String[listMatkul20.length]; 
        nilaiHuruf20 = konversiHuruf20(nilaiMahasiswa20,nilaiHuruf20, kunci20);
        double []nilaiSetara20 = new double[listMatkul20.length];
        nilaiSetara20 = konversiSetara20(nilaiHuruf20, nilaiSetara20);

        double bobot20 = 0;
        int totalsks20=0;
        for (int i20 = 0; i20 < listSks20.length; i20++) {
            totalsks20 += listSks20[i20];
            bobot20 += (nilaiSetara20[i20] * listSks20[i20]);
        }
        double IP20 = bobot20 / totalsks20;

        for (int i20 = 0; i20 < nilaiSetara20.length; i20++) {
            if (nilaiHuruf20[i20].equals("E")){
                Status20 = "TIDAK LULUS (Terdapat Nilai Mata Kuliah yang E)" ;
                break;
            }else {
                if  (nilaiSetara20[0] >= 2 ){
                    if (IP20 >= 2) {
                        Status20 = "LULUS" ;
                    } else {
                        Status20 = "TIDAK LULUS (IP Anda Kurang Dari 2)";
                    }
                } else {
                    Status20 = "TIDAK LULUS (Nilai Pancasila D atau E)";
                    break;
                }
            }
        }

        double terkecil20 = 100;
        for (int j20 = 0; j20 < nilaiMahasiswa20[kunci20-1].length; j20++) {
            if (nilaiMahasiswa20[kunci20-1][j20] < terkecil20) {
                terkecil20 = nilaiMahasiswa20[kunci20-1][j20];
            }
        }

        System.out.println("\n========================================================");
        System.out.println("             HASIL KONVERSI NILAI MAHASISWA");
        System.out.println("========================================================");
        System.out.println("Nama : " + namaMahasiswa20[kunci20-1][0]);
        System.out.println("NIM  : " + namaMahasiswa20[kunci20-1][1]);
        System.out.printf("\n%-3s %-40s %-3s   %-5s  %-5s  %-6s%n","No.","Mata Kuliah","SKS","Nilai","Huruf","Setara");
        System.out.println("--------------------------------------------------------");
        for (int i20 = 0; i20 < listMatkul20.length; i20++) {
            System.out.printf("%-3s %-40s  %-2s   %5.1f   %-5s  %-6s",(i20+1)+".",listMatkul20[i20],listSks20[i20],nilaiMahasiswa20[kunci20-1][i20],nilaiHuruf20[i20],nilaiSetara20[i20]);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Total SKS   : "+totalsks20);
        System.out.printf("Total Bobot : %2.2f%n",bobot20);
        System.out.printf("Indeks Prestasi (IP): %2.2f%n",IP20);
        System.out.println("Status Semester : " + Status20);
        System.out.println("Nilai Terkecil : "+terkecil20);
        System.out.println("========================================================");
    }

    static String [] konversiHuruf20 (double[][] nilaiMahasiswa20, String[] nilaiHuruf20 ,int kunci20) {
        for (int i20 = 0; i20 < nilaiHuruf20.length; i20++) {
            nilaiHuruf20[i20] = (nilaiMahasiswa20[kunci20-1][i20] > 80) ? "A" :
                (nilaiMahasiswa20[kunci20-1][i20] > 73) ? "B+" :
                (nilaiMahasiswa20[kunci20-1][i20] > 65) ? "B" :
                (nilaiMahasiswa20[kunci20-1][i20] > 60) ? "C+" :
                (nilaiMahasiswa20[kunci20-1][i20] > 50) ? "C" :
                (nilaiMahasiswa20[kunci20-1][i20] > 39) ? "D" : "E" ;
        }
        return nilaiHuruf20;
    }

    static double[] konversiSetara20 (String []nilaiHuruf20,double []nilaiSetara20) {
        for (int i20 = 0; i20 < nilaiSetara20.length; i20++) {
            nilaiSetara20[i20] = (nilaiHuruf20[i20].equals("A")) ?  4 :
                  (nilaiHuruf20[i20].equals("B+")) ?  3.5 : 
                  (nilaiHuruf20[i20].equals("B")) ?  3 :
                  (nilaiHuruf20[i20].equals("C+")) ?  2.5 :
                  (nilaiHuruf20[i20].equals("C")) ?  2 :
                  (nilaiHuruf20[i20].equals("D")) ?  1 : 0 ;
        }
        return nilaiSetara20;
    }

    public static void main(String[] args) {
        int pilihSiswa20;
        String[] matkul20 = {"Pancasila",
        "Konsep Teknologi Informasi",
        "Critical thinking dan problem solving",
        "Matematika Dasar",
        "Bahasa Inggris 1",
        "Dasar Pemrograman",
        "Praktikum Dasar Pemrograman",
        "Keselamatan dan Kesehatan Kerja",
        "Fisika"};

        int []sksMatkul20 = {2,2,2,2,2,2,3,2,2};

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlMhswa20 = tino20.nextInt();
        double dataMahasiswa20[][] = new double[jmlMhswa20][matkul20.length]; 
        String listMahasiswa20[][] = new String[jmlMhswa20][2];

    
        menu20();
        
        pilihSiswa20 = tampilMahasiswa20(listMahasiswa20, jmlMhswa20);
        listMahasiswa20 = bacaMahasiwa20(listMahasiswa20, pilihSiswa20);
        dataMahasiswa20 = bacaNilai20(dataMahasiswa20, matkul20, pilihSiswa20);
        pilihSiswa20 = tampilMahasiswa20(listMahasiswa20, jmlMhswa20);
        tampilKHS20(dataMahasiswa20,listMahasiswa20,sksMatkul20,matkul20,pilihSiswa20);
                
            
                
        
    }
    
}

