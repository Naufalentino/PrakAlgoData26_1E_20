package jobsheet2;

public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 ds1 = new Dosen20();
        ds1.nama="Pak Bumi";
        ds1.idDosen="01";
        ds1.bidangKeahlian="Makan";
        ds1.tahunBergabung=2001;
        ds1.statusAktif=true;
        

        ds1.tampilInformasi();
        ds1.setStatusAktif(false);
        ds1.ubahKeahlian("Minum");
        System.out.println(ds1.hitungMasaKerja(2026));
        ds1.tampilInformasi();

        Dosen20 ds2= new Dosen20("Pak Rabo","02","Masak",2025,true);
        ds2.tampilInformasi();
        ds2.setStatusAktif(false);
        ds2.ubahKeahlian("Berbagi");
        System.out.println(ds2.hitungMasaKerja(2026));
        ds2.tampilInformasi();

    }
}
