import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa20 {
    List<Mahasiswa2000> mahasiswas = new ArrayList<>();
    
    public void tambah(Mahasiswa2000... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index){
        mahasiswas.remove(index);
    }
    
    public void update(int index, Mahasiswa2000 mhs){
        mahasiswas.set(index, mhs);
    }
    
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    // int linearSeacrch(String nim) {
    //     for (int i = 0; i < mahasiswas.size(); i++) {
    //         if (nim.equals(mahasiswas.get(i).nim)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    int binarySearch(String nim) {
        Comparator<Mahasiswa2000> comp = new Comparator<Mahasiswa2000>() {
            @Override
            public int compare(Mahasiswa2000 m1, Mahasiswa2000 m2) {
                return m1.nim.compareTo(m2.nim);
            }
        };
        
        Collections.sort(mahasiswas, comp);
        
        Mahasiswa2000 key = new Mahasiswa2000(nim, "", "");
        
        return Collections.binarySearch(mahasiswas, key, comp);
    }

    public static void main(String[] args) {
        ListMahasiswa20 lm = new ListMahasiswa20();
        Mahasiswa2000 m = new Mahasiswa2000("201234", "Noureen", "021xx1");
        Mahasiswa2000 m1 = new Mahasiswa2000("201235", "Akhleema", "021xx2");
        Mahasiswa2000 m2= new Mahasiswa2000("201236", "Shannum", "021xx3");
        
        lm.tambah(m, m1, m2);
        
        lm.tampil();
        
        // lm.update(lm.linearSeacrch("201235"), new Mahasiswa2000("201235", "Akhleema Lela", "021xx2"));
        lm.update(lm.binarySearch("201235"), new Mahasiswa2000("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
    
}