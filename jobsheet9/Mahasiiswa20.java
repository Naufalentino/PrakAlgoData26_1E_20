package jobsheet9;

public class Mahasiiswa20 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiiswa20(){}
    Mahasiiswa20(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai){
        this.nilai=nilai;
    }
}
