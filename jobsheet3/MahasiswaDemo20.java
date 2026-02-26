public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Mahasiswa20[] arrayofmahasiswa = new Mahasiswa20[3];
        arrayofmahasiswa[0] = new Mahasiswa20();
        arrayofmahasiswa[0].nim = "244107060033";
        arrayofmahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayofmahasiswa[0].kelas = "SIB-1E";
        arrayofmahasiswa[0].ipk = (float) 3.75;

        arrayofmahasiswa[1] = new Mahasiswa20();
        arrayofmahasiswa[1].nim = "2341720172";
        arrayofmahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofmahasiswa[1].kelas = "TI-2A";
        arrayofmahasiswa[1].ipk = (float) 3.36;

        arrayofmahasiswa[2] = new Mahasiswa20();
        arrayofmahasiswa[2].nim = "244107023006";
        arrayofmahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayofmahasiswa[2].kelas = "TI-2E";
        arrayofmahasiswa[2].ipk = (float) 3.80;


        System.out.println("NIM      :"+arrayofmahasiswa[0].nim);
        System.out.println("NAMA     :"+arrayofmahasiswa[0].nama);
        System.out.println("KELAS    :"+arrayofmahasiswa[0].kelas);
        System.out.println("IPK      :"+arrayofmahasiswa[0].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM      :"+arrayofmahasiswa[1].nim);
        System.out.println("NAMA     :"+arrayofmahasiswa[1].nama);
        System.out.println("KELAS    :"+arrayofmahasiswa[1].kelas);
        System.out.println("IPK      :"+arrayofmahasiswa[1].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM      :"+arrayofmahasiswa[2].nim);
        System.out.println("NAMA     :"+arrayofmahasiswa[2].nama);
        System.out.println("KELAS    :"+arrayofmahasiswa[2].kelas);
        System.out.println("IPK      :"+arrayofmahasiswa[2].ipk);
        System.out.println("-----------------------------------");

    }
}
