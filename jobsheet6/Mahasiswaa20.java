package jobsheet6;
public class Mahasiswaa20{
    String nim;    
    String nama;
    String kelas;
    double ipk;

    public Mahasiswaa20(){}

    public Mahasiswaa20(String nm, String name, String kls, double ip){
        nim    = nm;
        nama    = name;
        kelas    = kls;
        ipk    = ip;       
    }

    void tampilInformasi(){
        System.out.println("NIM      :"+ nim);
        System.out.println("NAMA     :"+ nama);
        System.out.println("KELAS    :"+ kelas);
        System.out.println("IPK      :"+ ipk);
    }

}
    



    