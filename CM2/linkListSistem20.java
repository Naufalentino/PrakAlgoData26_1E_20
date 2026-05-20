// package CM2;

public class linkListSistem20 {
    // pembuatan beberapa bagian node untuk data antrian dan pesanan yang terpisah
    nodeSistem20 headAntrian;
    nodeSistem20 headPesanan;
    nodeSistem20 tailAntrian;
    nodeSistem20 tailPesanan;
    int count=1; //untuk nilai auto increment data no pesanan pada antrian
    int size=0; //untuk jumlah data yang ada pada pesanan

    public linkListSistem20(){
        headAntrian = null;
        headPesanan = null;
        tailAntrian = null;
        tailPesanan = null;
    }

    boolean isAntrianKosong(){
        return (headAntrian==null);
    }

    boolean isPesananKosong(){
        return (headPesanan==null);
    }

    // method untuk menambah antrian yang berprinsip addlast / queue 
    public void tambahAntrian(dataSistem20 input){
        nodeSistem20 newNode = new nodeSistem20(input);
        if (isAntrianKosong()) {
            headAntrian = newNode;
            tailAntrian = newNode;
        } else {
            tailAntrian.next = newNode;
            newNode.prev = tailAntrian;
            tailAntrian = newNode;
        }
        System.out.println("Antrian brehasil ditambahkan dengan nomor: "+count);
        count++;
    }

    // method cetakAntrian dari head ke tail khusus antrian
    public void cetakAntrian(){
        if (!isAntrianKosong()) {
            nodeSistem20 tmp = headAntrian;
            System.out.printf("%-16s %-22s %-10s\n", "No Antrian", "Nama", "No HP");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    // method hapus antrian serta melakukan pengisian linked list pesanan yang berprinsip queue
    public void hapusAntrianDanPesan(dataSistem20 input){
        nodeSistem20 tmp = headAntrian;
        nodeSistem20 temp = headPesanan;
        if (!isAntrianKosong()) {
            if (headAntrian == tailAntrian) {
                headAntrian = tailAntrian = null;
            } else {
                headAntrian = headAntrian.next;
                headAntrian.prev = null;
            }
        } 
        nodeSistem20 newNode = new nodeSistem20(input);
        if (isPesananKosong()) {
            headPesanan = newNode;
            tailPesanan = newNode;
            temp = headPesanan;
        } else {
            tailPesanan.next = newNode;
            newNode.prev = tailPesanan;
            tailPesanan = newNode;
            temp = tailPesanan;
        }
        System.out.println(tmp.data.name_or_namaPesanan+" telah memesan "+temp.data.name_or_namaPesanan);
        size++;
    }

    //method yang akan mencetak pesanan yang terurut berdasarkan nama pesanan
    public void cetakLaporanPesanan(){
        nodeSistem20 change1 = headPesanan;
        nodeSistem20 change2 = change1.next;
        for (int i = 0; i < size -1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (change1.next == null) {
                    continue;
                }
                System.out.println(j);
                if (change1.data.name_or_namaPesanan.compareToIgnoreCase(change2.data.name_or_namaPesanan)>0) {
                    if (change1.next.next == null && change1 == headPesanan && change2 == tailPesanan) {
                        change2.prev = change1.prev;
                        change1.next = change2.next;
                        change1.prev = change2;
                        change2.next = change1;
                        headPesanan = change2;
                        tailPesanan = change1;
                    } else if (change1.next.next == null && change1 != headPesanan && change2 == tailAntrian) {
                        change2.prev = change1.prev;
                        change1.prev.next = change2;
                        change1.next = change2.next;
                        change1.prev = change2;
                        change2.next = change1;
                        tailPesanan = change1;
                    } else if (change1.prev == null) {
                        change2.prev = change1.prev;
                        change1.next = change2.next;
                        change1.prev = change2;
                        change2.next = change1;
                        headPesanan = change2;
                        change1.next.data.tampilInformasi();
                    } 
                    else {
                        change2.prev = change1.prev;
                        change1.prev.next = change2;
                        change1.next = change2.next;
                        change1.prev = change2;
                        change2.next = change1;
                    }
                    if (change1.next != null) {
                        change2 = change1.next;
                    }
                }
            }
            change1 = headPesanan;
        }
        if (!isPesananKosong()) {
            nodeSistem20 tmp = headPesanan;
            System.out.printf("%-16s %-22s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Pesanan masih kosong");
        }

    }


}
