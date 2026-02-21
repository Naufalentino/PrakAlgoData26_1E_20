package jobsheet2;

class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 mk1 = new MataKuliah20();
        mk1.nama = "KTI";
        mk1.kodeMK ="001";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(1);
        mk1.tampilInformasi();
        mk1.kurangiJam(5);
        mk1.tampilInformasi();

        MataKuliah20 mk2 = new MataKuliah20("Daspro","002",3,5);
        mk2.tampilInformasi();
        mk2.ubahSks(2);
        mk2.tambahJam(1);
        mk2.tampilInformasi();
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
        
}
