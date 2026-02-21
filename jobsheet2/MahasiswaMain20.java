package jobsheet2;

class MahasiswaMain20 {
    public static void main(String[] args) {
        Mahasiswa20 mhs1 = new Mahasiswa20();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas="SI 2J";        
        mhs1.ipk= 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);        
        mhs1.tampilkanInformasi();
        System.out.println(mhs1.nilaiKinerja());

        Mahasiswa20 mhs2 = new Mahasiswa20("Annisa Nabilla","2141720160",3.25,"TI 2L");
        mhs2.tampilkanInformasi();
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
        System.out.println(mhs2.nilaiKinerja());


        Mahasiswa20 mhsNaufal = new Mahasiswa20("Naufal","00000001",4.0,"TI 1E");
        mhsNaufal.tampilkanInformasi();
        System.out.println(mhsNaufal.nilaiKinerja());
    }
}
