import java.util.Scanner;

public class QueueMain20 {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        Scanner tino = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = tino.nextInt();
        int pilih = 0;
        Queue20 Q = new Queue20(n);

        do {
            menu();
            pilih = tino.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = tino.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: "+dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while(pilih>0&&pilih<5);
        tino.close();
    }
}
