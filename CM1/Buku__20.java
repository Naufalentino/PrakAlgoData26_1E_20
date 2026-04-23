package CM1;

public class Buku__20 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String statusBuku;
    
    public Buku__20(String kode, String judul, int tahun, String status){
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit = tahun;
        statusBuku = status;
    }

    //menampilkan data buku
    void tampilBuku(){
        System.out.print("Kode: "+kodeBuku+"  | ");
        System.out.print("Judul: "+judul+"  | ");
        System.out.print("Tahun: "+tahunTerbit);
    }
    
}