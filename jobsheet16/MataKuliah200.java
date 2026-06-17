public class MataKuliah200 {
    String kode;
    String nama;
    int sks;

    public MataKuliah200() {
    }

    public MataKuliah200(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-40s | %-5d", kode, nama, sks);
    }
}