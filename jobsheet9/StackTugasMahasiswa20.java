package jobsheet9;

public class StackTugasMahasiswa20 {
    Mahasiiswa20[] stack;
    int size;
    int top; 

    public StackTugasMahasiswa20(int size){
        this.size=size;
        stack = new Mahasiiswa20[size];
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

    public void push(Mahasiiswa20 mhs){
        if (!isFull()){
            top++;
            stack[top]=mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiiswa20 pop(){
        if (!isEmpty()){
            Mahasiiswa20 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinlai");
            return null;
        }
    }

    public Mahasiiswa20 peek(){
        if (!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan");
            return null;
        }
    }

    
    public Mahasiiswa20 peekbawah(){
        if (!isEmpty()){
            return stack[top-top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 0; i--) {
           System.out.println(stack[i].nama + "\t"+stack[i].nim + "\t"+stack[i].kelas); 
        }
        System.out.println();
    }

    public void totalTugas(){
        int total=0;
        for (int i = top; i >= 0; i--) {
           total += 1; 
        }
        System.out.println(total);
    }
}
