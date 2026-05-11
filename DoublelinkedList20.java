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
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
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

    public void removeFirst(){}
    public void removeLast(){} 
}
