import java.util.Scanner;

public class Tugas2_20 {
    static Scanner tino = new Scanner(System.in);
    public static void main(String[] args) {
        int milihMatkul;

        System.out.print("Masukkan jumlah jadwal: ");
        int jumlahJadwal = tino.nextInt();

        String [][]jadwal = isiJadwal(jumlahJadwal);
        int [] kunci = new int[jumlahJadwal];
        String [] hari = {"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
        int pilih = 0;
        String matkul[] = new String[jumlahJadwal];

        do {
            System.out.println();
            System.out.println("Pilih menu: ");
            System.out.println("1. Tampil Jadwal");
            System.out.println("2. Jadwal berdasarkan hari ");
            System.out.println("3. Jadwal berdasarkan matkul");
            System.out.println("4. Keluar");
            System.out.print("pilih 1-4: ");
            pilih = tino.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    tampilJadwal(jadwal);
                    break;
                case 2:
                    System.out.println("Berdasarkan hari apa: ");
                    System.out.println("1. Senin");
                    System.out.println("2. Selasa");
                    System.out.println("3. Rabu");
                    System.out.println("4. Kamis");
                    System.out.println("5. Jumat");
                    System.out.println("6. Sabtu");
                    System.out.println("7. Minggu");
                    System.out.print("Pilih (1-7): ");
                    int milihHari = tino.nextInt();
                    filterHari(jadwal,milihHari,kunci,hari);
                    break;
                case 3: 
                    System.out.println("Mata Kuliah yang tersedia: ");
                    for (int i = 0; i < jadwal.length; i++) {
                        System.out.println((i+1)+". "+jadwal[i][0]);
                    }
                    if (jadwal.length==1) {
                        System.out.print("pilih (1): ");
                        milihMatkul = tino.nextInt();
                    } else
                        System.out.print("pilih (1-"+jumlahJadwal+"): ");
                        milihMatkul = tino.nextInt();
                    filterMatkul(jadwal,milihMatkul,kunci,matkul);
                    break;
            }
        } while (pilih!=4);

    }

    static String [][] isiJadwal (int jumlahJadwal) {
        String[][] jadwal = new String [jumlahJadwal][4] ;
        tino.nextLine();
        for (int i = 0; i < jadwal.length; i++) {
            System.out.print("Mata Kuliah: ");
            jadwal[i][0] = tino.nextLine();
            System.out.print("Tempat: ");
            jadwal[i][1] = tino.nextLine();
            System.out.print("Hari: ");
            jadwal[i][2] = tino.nextLine();
            System.out.print("Jam: ");
            jadwal[i][3] = tino.nextLine();
            System.out.println();
            System.out.println();
        } 

        return jadwal;
    }

    static void tampilJadwal(String[][]jadwal){
        System.out.println("Keseluruhan Jadwal : ");
        System.out.printf("%-14s %-20s %-13s %-13s %-13s %n","","Mata Kuliah","Tempat","Hari","Waktu");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-14s %-20s %-13s %-13s %-11s %n","",jadwal[i][0],jadwal[i][1],jadwal[i][2],jadwal[i][3]);
        }
        System.out.println();
        System.out.println();
    }

    static void filterHari (String jadwal[][], int pilihan, int kunci[],String []hari){
        for (int i = 0; i < jadwal.length; i++) {
            if (hari[pilihan-1].equalsIgnoreCase(jadwal[i][2])) {
                kunci[i]=i;
            }
        }
        if (hari[pilihan-1].equalsIgnoreCase(jadwal[0][2])) {
            System.out.printf("%-14s %-20s %-13s %-13s %-11s %n","",jadwal[kunci[0]][0],jadwal[kunci[0]][1],jadwal[kunci[0]][2],jadwal[kunci[0]][3]);
        }
        for (int i = 1; i < kunci.length; i++) {
            if (kunci[i-1]!=0||kunci[i]!=0)
                System.out.printf("%-14s %-20s %-13s %-13s %-11s %n","",jadwal[kunci[i]][0],jadwal[kunci[i]][1],jadwal[kunci[i]][2],jadwal[kunci[i]][3]);
        }
            
    }
    
    static void filterMatkul (String jadwal[][], int pilihan, int kunci[],String []matkul){
        for (int i = 0; i < matkul.length; i++) {
            matkul[i] = jadwal[i][0];
        }
        
        for (int i = 0; i < jadwal.length; i++) {
            if (matkul[pilihan-1].equalsIgnoreCase(jadwal[i][0])) {
                kunci[i]=i;
            }
        }
        if (matkul[pilihan-1].equalsIgnoreCase(jadwal[0][0])) {
            System.out.printf("%-14s %-20s %-13s %-13s %-11s %n","",jadwal[kunci[0]][0],jadwal[kunci[0]][1],jadwal[kunci[0]][2],jadwal[kunci[0]][3]);
        }
        for (int i = 1; i < kunci.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul[pilihan-1]))
                System.out.printf("%-14s %-20s %-13s %-13s %-11s %n","",jadwal[kunci[i]][0],jadwal[kunci[i]][1],jadwal[kunci[i]][2],jadwal[kunci[i]][3]);
        }
    }  
}

