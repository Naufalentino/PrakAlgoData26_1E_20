public class AntrianLayanan020 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public AntrianLayanan020(){}
    public AntrianLayanan020(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    public void tampilInformasi(){
        System.out.printf("%-15s %-15s %-5s %-2.1f%n" , nama, nim, kelas, ipk);
    }
}
