package CM1;

public class Peminjaman__20 {
    Mahasiswa__20 mhs;
    Buku__20 buku;
    int lamaPinjam;
    int batasPinjam =5;
    int terlambat;
    int denda; 
    String statusBuku;
    
    
    Peminjaman__20(Mahasiswa__20 mhs, Buku__20 buku, int lamaPinjam, String status){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam= lamaPinjam;
        statusBuku = status;
    }

    //untuk menghitung denda
    void hitungDenda(){
        if (lamaPinjam>5) {
            if (statusBuku.equals("Grade A")){
                lamaPinjam = lamaPinjam - 5;
                denda = 5000 * lamaPinjam;
            }
            else{
                lamaPinjam = lamaPinjam - 5;
                denda = 2000 * lamaPinjam;
            }
        } else {
            denda = 0;
        }
    }

    //menampilkan peminjaman
    void tampilPeminjaman(){
        System.out.print(mhs.nama+" | "+buku.judul+" | ");
        if (denda > 0)
            System.out.print("Lama: "+(lamaPinjam+5)+" | Terlambat: "+(lamaPinjam)+" | "+"Status Buku: "+statusBuku+"  |  "+"Denda: "+denda);
        else {
            System.out.print("Lama: "+lamaPinjam+" | Terlambat: 0"+" | "+"Status Buku: "+statusBuku+"  |  "+"Denda: "+denda);
        }  
        System.out.println();
    }

    
}
