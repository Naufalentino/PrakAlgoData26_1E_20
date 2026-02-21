package jobsheet2;

class MataKuliah20 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah20(){
    }

    public MataKuliah20(String namaMatkul, String kodeMK, int sks, int totalJam){
        nama = namaMatkul;
        this.kodeMK = kodeMK;
        this.sks = sks;
        jumlahJam = totalJam;
    }

    void tampilInformasi(){
        System.out.println("Nama Mata Kuliah: "+nama);
        System.out.println("Kode Mata Kuliah: "+kodeMK);
        System.out.println("SKS: "+sks);
        System.out.println("Jumlah jam: "+jumlahJam+" jam");

    }

    void ubahSks (int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam = jumlahJam+jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam < jam||jumlahJam - jam==0) {
            System.out.println("Maaf Pengurangan tidak bisa dilakukan karena jumlah jam yang tersisa lebih kecil dengan jumlah jam yang dikurangi ");
        }else {
            jumlahJam = jumlahJam - jam;
        }
    }
}
