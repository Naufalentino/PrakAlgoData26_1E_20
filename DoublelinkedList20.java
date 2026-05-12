public class DoublelinkedList20 {
    Node20 head;
    Node20 tail;

    public DoublelinkedList20(){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return (head==null);
    }

    public void print(){
        if (!isEmpty()) {
            Node20 tmp = head;
            System.out.print("Isi Linked Lists:\t\n");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                System.out.println("-----");
            }
            System.out.println("");
        } else {
            System.out.println("Linked list  masih kosong");
        }
    }

    public void printReverse(){
        if (!isEmpty()) {
            Node20 tmp = tail;
            System.out.print("Linked Lists Reversed:\t\n");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.prev;
                System.out.println("-----");
            }
            System.out.println("");
        } else {
            System.out.println("Linked list  masih kosong");
        }
    }

    public void add(int index,Maahaasiiswaa20 data){
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node20 temp = head;
            Node20 newNode = new Node20(data);
            int i = 0;
            do {
                if (temp.next == null && i==index-1) {
                    addLast(data);
                    System.out.println("Data berhasil disisipkan pada index setelah "+index);
                    break;
                } else if (temp.next != null && i==index-1) {
                    newNode.prev = temp;
                    newNode.next = temp.next;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                    System.out.println("Data berhasil disisipkan pada index setelah "+index);
                    break;
                }
                i++;
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Data dengan index "+index+" tidak ditemukan. ");
                    return;
                }
            }while (i < index -1 );
        }
    }

    public void addFirst(Maahaasiiswaa20 input){
        Node20 newNode = new Node20(input);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Maahaasiiswaa20 input){
        Node20 newNode = new Node20(input);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String key,Maahaasiiswaa20 input){
        Node20 newNode = new Node20(input);
        Node20 temp = head;
        do {
            if (temp.data.nim.equals(key)) {
                if (temp.next == null) {
                    newNode.prev = temp;
                    temp.next = newNode;
                    tail = newNode;
                } else {
                    newNode.prev = temp;
                    newNode.next = temp.next;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                System.out.println("Data berhasil disisipkan setelah NIM "+key);
                break;
            }
            temp = temp.next;
            if (temp == null) {
                System.out.println("Data dengan NIM "+key+" tidak ditemukan. ");
                return;
            }
        }while (temp != null);
    }

    public void removeFirst(){
        Node20 tmp = head;
        if (isEmpty()) {
            System.out.println("Linked list masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Data berhasil dihapus.");
            tmp.data.tampilInformasi();
        } else {
            head = head.next;
            head.prev = null;
            System.out.println("Data berhasil dihapus.");
            tmp.data.tampilInformasi();
        }
    }

    public void removeLast(){
        Node20 tmp = tail;
        if (isEmpty()) {
            System.out.println("Linked list masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Data berhasil dihapus.");
            tmp.data.tampilInformasi();
        } else {
            tail = tail.prev;
            tail.next = null;
            System.out.println("Data berhasil dihapus.");
            tmp.data.tampilInformasi();
        }
    }

    public void removeAfter(String keyNim){
        Node20 temp = head;
        Node20 tmp = temp.next;
        do {
            if (temp.data.nim.equals(keyNim) && temp.next != null) {
                if (temp.next.next == null) {
                    removeLast();
                } else if (temp.next != null) {
                    temp.next = temp.next.next;
                    temp.next.prev = temp;
                    System.out.println("Data berhasil dihapus.");
                    tmp.data.tampilInformasi();
                }
                break;
            } else if (temp.data.nim.equals(keyNim) && temp.next == null) {
                 System.out.println("Data masih kosong setelah "+keyNim);
                 break;
            }
            temp = temp.next;
            tmp = tmp.next;
            if (temp == null) {
                System.out.println("Data dengan NIM "+keyNim+" tidak ditemukan. ");
                return;
            }
        }while (temp != null);
    }

    public void remove(int index){
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 1 && index == 0) {
            removeFirst();
        } else {
            Node20 temp = head;
            Node20 tmp = temp;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
                tmp = temp;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;
                System.out.println("Data berhasil dihapus.");
                tmp.data.tampilInformasi();
            } else {
                removeLast();
            }
        }
    }

    public void getFirst(){
        System.out.println("Data pada node pertama : ");
        head.data.tampilInformasi();
    }

    public void getLast(){
        System.out.println("Data pada node akhir : ");
        tail.data.tampilInformasi();
    }

    public void getIndex(int index){
        Node20 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
        System.out.println("Data pada node dengan indeks "+index+" : ");
        temp.data.tampilInformasi();
    }

    public void jumlahData(){
        Node20 tmp = head;
        int count = 0;
        while (tmp != null) {
            count+=1;
            tmp = tmp.next;
        }
        System.out.println("Jumlah data yang ada pada double linked list adalah "+ count);
    }
}
