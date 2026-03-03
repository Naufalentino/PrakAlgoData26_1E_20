public class DataDosen20 {

    void dataSemuaDosen(Dosen20[] arrayofDosen){
        int count = 1;
        for (Dosen20 dosen20 : arrayofDosen) {

            System.out.println("Data Dosen ke-"+count);
            System.out.println("Kode                : "+dosen20.kode);
            System.out.println("Nama                : "+dosen20.nama);
            if (dosen20.jenisKelamin==false) {
                System.out.println("Jenis Kelamin       : Pria");
            } else {
                System.out.println("Jenis Kelamin       : Wanita");
            }
            System.out.println("Usia                : "+dosen20.usia);
            System.out.println("---------------------------------------");
            count++;
        }
    }

    void jumlahDosenPerKelamin(Dosen20[] arrayofDosen){
        int jmlPria=0,jmlWanita=0;
        for (Dosen20 dosen20 : arrayofDosen) {
            if (dosen20.jenisKelamin==true) {
                jmlWanita+=1;
            } else {
                jmlPria+=1;
            }
        }
        System.out.println("Jumlah Dosen Wanita : "+jmlWanita);
        System.out.println("Jumlah Dosen Pria   : "+jmlPria);
        System.out.println("---------------------------------------");
    }


    void rerataUsiaDosenPerJenisKelamin(Dosen20[]arrayofDosen){
        double jmlPria=0,jmlWanita=0;
        int count = 0;
        double rata[] = new double[2];
        double[][] dosen = new double[2][arrayofDosen.length];
        for (Dosen20 dosen20 : arrayofDosen) {
            if (dosen20.jenisKelamin==true) {
                jmlWanita+=1;
                dosen[0][count] = dosen20.usia;
            } else {
                jmlPria+=1;
                dosen[1][count] = dosen20.usia;
            }
            count++;
        } 
        for (int i = 0; i < arrayofDosen.length; i++) {
            rata[0]+=dosen[0][i];
            rata[1]+=dosen[1][i];
        }
        System.out.println("Rata-rata usia ");
        System.out.printf("Dosen Wanita        : %-2.1f%n",(rata[0]/jmlWanita));
        System.out.printf("Dosen Pria          : %-2.1f%n",(rata[1]/jmlPria));
        System.out.println("---------------------------------------");
    }

    void infoDosenPalingTua (Dosen20 []arrayofDosen){
        int tua = 0;
        for (Dosen20 dosen : arrayofDosen) {
            if (dosen.usia>tua) {
                tua = dosen.usia;
            }
        }
        System.out.println("Data Dosen paling tua ");
        for (Dosen20 dosen20 : arrayofDosen) {
            if (dosen20.usia==tua) {
                System.out.println("Kode                : "+dosen20.kode);
                System.out.println("Nama                : "+dosen20.nama);
                if (dosen20.jenisKelamin==false) {
                    System.out.println("Jenis Kelamin       : Pria");
                } else {
                    System.out.println("Jenis Kelamin       : Wanita");
                }
                System.out.println("Usia                : "+dosen20.usia);
                System.out.println("---------------------------------------");
            }
        }
    }

    void infoDosenPalingMuda(Dosen20[] arrayofDosen){
        int muda = 1000;
        for (Dosen20 dosen : arrayofDosen) {
            if (dosen.usia<muda) {
                muda = dosen.usia;
            }
        }
        System.out.println("Data Dosen paling muda ");
        for (Dosen20 dosen20 : arrayofDosen) {
            if (dosen20.usia==muda) {
                System.out.println("Kode                : "+dosen20.kode);
                System.out.println("Nama                : "+dosen20.nama);
                if (dosen20.jenisKelamin==false) {
                    System.out.println("Jenis Kelamin       : Pria");
                } else {
                    System.out.println("Jenis Kelamin       : Wanita");
                }
                System.out.println("Usia                : "+dosen20.usia);
                System.out.println("---------------------------------------");
            }
        }
    }
    
}