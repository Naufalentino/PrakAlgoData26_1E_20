package jobsheet9;

public class StackSurat20 {
    Surat20[] stack;
    int size;
    int top;

    public StackSurat20(int size){
        this.size=size;
        stack = new Surat20[size];
        top = -1;
    }

    public boolean isFull(){
        if (top==size-1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top== -1){
            return true;
        } else {
            return false;
        }
    }

    public void proses_surat_izin(Surat20 srt){
        if (!isFull()){
            top++;
            stack[top]=srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa memproses surat lagi");
        }
    }

    public Surat20 terima_surat_izin(){
        if (!isEmpty()){
            Surat20 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diterima");
            return null;
        }
    }

    public void cari_surat(String kunci){
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(kunci)){
                System.out.println("Surat Ditemukan !");
                String dmy = (stack[i].jenisIzin == 'S') ? "Sakit": "Izin " ;
                System.out.println("id\tnama\tkelas\tketerangan\tdurasi_izin");
                System.out.print(stack[i].idSurat+ "\t"+stack[i].namaMahasiswa + "\t"+stack[i].kelas+ "\t"+dmy+ "\t\t"+stack[i].durasi); 
                break;
            } else {
                System.out.println("Surat tidak ditemukan! ");
            }
        }
    }

    public Surat20 lihat_surat_izin_terakhir(){
        if (!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada Surat yang diproses");
            return null;
        }
    }

    public void print(){
        String dmy;
        for (int i = top; i >= 0; i--) {
            dmy = (stack[i].jenisIzin == 'S') ? "Sakit ": "Izin" ;
            System.out.print(stack[i].idSurat+ "\t"+stack[i].namaMahasiswa + "\t"+stack[i].kelas+ "\t"+dmy+ "\t"+stack[i].durasi); 
        }
        System.out.println();
    }

}
