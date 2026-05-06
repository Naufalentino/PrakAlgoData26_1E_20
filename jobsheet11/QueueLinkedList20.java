public class QueueLinkedList20 {
    NodeAntrianLayanan20 front;
    NodeAntrianLayanan20 rear;
    int size;
    int maxCapacity;

    public QueueLinkedList20(int maxCapacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.maxCapacity = maxCapacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxCapacity;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(AntrianLayanan020 mhs) {
        if (isFull()) {
            System.out.println("Gagal menambahkan: Antrian sudah penuh!");
            return;
        }
        NodeAntrianLayanan20 newNode = new NodeAntrianLayanan20(mhs);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk antrian.");
    }

    public AntrianLayanan020 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        AntrianLayanan020 mhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return mhs;
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan: ");
            front.data.tampilInformasi();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terakhir: ");
            rear.data.tampilInformasi();
        }
    }

    public int getSize() {
        return size;
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        NodeAntrianLayanan20 temp = front;
        System.out.println("Daftar Antrian:");
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }
    }
}
