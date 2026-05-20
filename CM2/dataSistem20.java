// package CM2;

public class dataSistem20 {
    int noAntrian_or_kodeAntrian;
    String name_or_namaPesanan;
    String harga_or_noHp;

    public dataSistem20(int no, String name, String desk){
        noAntrian_or_kodeAntrian = no;
        name_or_namaPesanan = name;
        harga_or_noHp = desk;
    }

    public void tampilInformasi(){
        System.out.printf("%-16d %-22s %-10s\n", noAntrian_or_kodeAntrian, name_or_namaPesanan, harga_or_noHp);
    }
}
