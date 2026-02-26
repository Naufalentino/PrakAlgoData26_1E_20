public class DataDosen20 {

    void dataSemuaDosen(Dosen20[] arrayofDosen){
        int count = 1;
        for (Dosen20 dosen20 : arrayofDosen) {
            
            System.out.println("Data Dosen ke-"+count);
            System.out.println("Kode          : "+dosen20.kode);
            System.out.println("Nama          : "+dosen20.nama);
            if (dosen20.jenisKelamin==false) {
                System.out.println("Jenis Kelamin : Pria");
            } else {
                System.out.println("Jenis Kelamin : Wanita");
            }
            System.out.println("Usia          : "+dosen20.usia);
            System.out.println("---------------------------------------");
            count++;
        }
    }
    
}