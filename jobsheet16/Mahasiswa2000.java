public class Mahasiswa2000 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa2000(){}

    public Mahasiswa2000(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    
    @Override
    public String toString(){
        return String.format("%-10s | %-15s | %-10s", nim, nama, notelp);
    }
}