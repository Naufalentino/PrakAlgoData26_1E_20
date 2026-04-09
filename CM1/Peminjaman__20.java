package CM1;

public class Peminjaman__20 {
    Mahasiswa__20 mhs;
    Buku__20 buku;
    int lamaPinjam;
    int batasPinjam =5;
    int terlambat;
    int denda; 
    
    
    
    Peminjaman__20(Mahasiswa__20 mhs, Buku__20 buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    
    }

    //untuk menghitung denda
    void hitungDenda(){
        if (lamaPinjam>5) {
            lamaPinjam = lamaPinjam - 5;
            denda = 2000 * lamaPinjam;
        } else {
            denda = 0;
        }
    }

    //menampilkan peminjaman
    void tampilPeminjaman(){
        System.out.print(mhs.nama+" | "+buku.judul+" | ");
        if (denda > 0)
            System.out.print("Lama: "+(lamaPinjam+5)+" | Terlambat: "+(lamaPinjam)+" | "+"Denda: "+denda);
        else {
            System.out.print("Lama: "+lamaPinjam+" | Terlambat: 0"+" | "+"Denda: "+denda);
        }  
        System.out.println();
    }

    
}
