public class Dosen_20 {
    String kode20;
    String nama20;
    Boolean jenisKelamin20;
    int usia20;

    Dosen_20(String kd, String name, Boolean jk, int age){
        kode20 = kd;
        nama20 = name;
        jenisKelamin20 = jk;
        usia20 = age;
    }

    void tampil_(){
        System.out.println("KODE            :"+ kode20);
        System.out.println("NAMA            :"+ nama20);
        if (jenisKelamin20==true){
            System.out.println("JENIS KELAMIN   :Woman");
        } else {
            System.out.println("JENIS KELAMIN   :Man");
        }
        System.out.println("USIA            :"+ usia20);
    
    }
}
