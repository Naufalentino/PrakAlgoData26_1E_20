public class Maahaasiiswaa20 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Maahaasiiswaa20(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.println(
            "NIM   : " + nim + 
            "\nNama  : " + nama + 
            "\nKelas : " + kelas +
            "\nIPK   : " + ipk
        );
    }

}
