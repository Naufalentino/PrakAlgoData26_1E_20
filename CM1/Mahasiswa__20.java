package CM1;

public class Mahasiswa__20 {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa__20(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // menampilkan data mahasiswa
    void tampilMahasiswa (){
        System.out.print("NIM: "+nim+"  | ");
        System.out.print("Nama: "+nama+"  | ");
        System.out.print("Prodi: "+prodi);
    }
}