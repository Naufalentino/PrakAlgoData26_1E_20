public class Mahasiswa_20 {
    String nim20;
    String nama20;
    String kelas20;
    double ipk20;

    Mahasiswa_20(){}

    Mahasiswa_20(String nm, String name, String kls, double ip){
        nim20 = nm;
        nama20 = name;
        kelas20 = kls;
        ipk20 = ip;
    }

    void tampilInformasi(){
        System.out.println("NAMA     :"+ nama20);
        System.out.println("NIM      :"+ nim20);
        System.out.println("KELAS    :"+ kelas20);
        System.out.println("IPK      :"+ ipk20);
    }
}
