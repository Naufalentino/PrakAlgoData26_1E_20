package jobsheet2;

public class Dosen20 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen20(){
    }

    public Dosen20(String namaDosen, String id, String keahlian, int tahunBergabung, boolean status){
        nama = namaDosen;
        idDosen = id;
        bidangKeahlian = keahlian;
        this.tahunBergabung = tahunBergabung;
        statusAktif = status;
    }

    void tampilInformasi(){
        System.out.println("Nama Dosen: "+nama);
        System.out.println("Id Dosen: "+idDosen);
        System.out.println("Tahun Bergabung: "+tahunBergabung);
        System.out.println("Bidang Keahlian: "+bidangKeahlian);
        
    }

    void setStatusAktif (boolean status){
        if (statusAktif) {
            System.out.println("Status Dosen: Aktif");
        } else {
            System.out.println("Status Dosen: Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg){
        int masaKerja = thnSkrg-tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
