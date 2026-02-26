public class Mahasiswa20 {
    public String nama;
    public String nim;
    public String kelas;
    public float ipk;


    void cetakInfo(Mahasiswa20[]arrayOfMahasiswa){
        for (Mahasiswa20 mahasiswa : arrayOfMahasiswa) {
            System.out.println("NIM      :"+mahasiswa.nim);
            System.out.println("NAMA     :"+mahasiswa.nama);
            System.out.println("KELAS    :"+mahasiswa.kelas);
            System.out.println("IPK      :"+mahasiswa.ipk);
            System.out.println("-----------------------------------");
        }
        
    }



}