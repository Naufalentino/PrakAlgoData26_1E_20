# Laporan Praktikum Tree

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## 14.2 Percobaan 1: Praktikum implementasi Binary Search Tree menggunakan Linked List 

Hasil running program Percobaan 14.2

<img width="444" height="655" alt="Screenshot 2026-05-29 220323" src="https://github.com/user-attachments/assets/6efa4b93-d951-4eaa-84ad-ca39a09454e1" />
<img width="577" height="211" alt="Screenshot 2026-05-29 220334" src="https://github.com/user-attachments/assets/f46e5932-13a0-4b3f-bee8-2eda159a4d21" />

### Pertanyaan Percobaan 14.2

<img width="627" height="365" alt="Screenshot 2026-06-02 220730" src="https://github.com/user-attachments/assets/7fc9e839-faab-435e-a977-ee1cbfcde876" />


### Jawaban Percobaan 14.2
1. Karena dalam binary search tree menggunakan metode divide and conquer yang menyebabkannya lebih cepat dari binary tree biasa.

2. Untuk menyambungkan ke node selanjutnya, seperti yang ada pada node linked list yang berupa next atau prev.

3. a. Root digunakan untuk menyimpan nilai tree paling awal, seperti head pada linked list.
   b. Nilai awal root adalah null.

4. Traverse untuk mencari node atau tempat yang kosong lalu mengisinya dengan data yang baru.

5. Kode tersebut digunakan untuk traverse dan mengecek apakah nilai data lebih besar atau lebih kecil dari data di node posisi sekarang, pengkondisian tersebut digunakan untuk menentukan posisi data serta traversal untuk menentukan penempatan data yang akan membuat binary tree lebih terurut datanya.

6. Pertama yaitu menemukan node yang akan dihapus, lalu identifikasi bahwa node memiliki dua anak, cari pengganti (replacement node), Salin nilai successor ke node yang akan dihapus, hapus node successor dari subtree kanan, dan kembalikan root yang sudah dimodifikasi.





## 14.3 Percobaan 2: Praktikum Operasi Penghapusan pada Double Linked Lis
Hasil running program percobaan 14.3


<img width="447" height="177" alt="Screenshot 2026-05-29 220351" src="https://github.com/user-attachments/assets/41ed6f8a-c49e-4d63-b67a-88aea537a00c" />




### Pertanyaan Percobaan 14.3

<img width="548" height="152" alt="Screenshot 2026-06-02 220741" src="https://github.com/user-attachments/assets/bc0b73f4-37b4-4347-b0a0-fe947699815a" />


### Jawaban Percobaan 14.3
1. Atribut data digunakan untuk menyimpan data yang ada pada array tersebut dan idxLast berfungsi untuk pemberi tanda untuk index data pada array paling akhir.

2. Digunakan untuk memasukkan data arrayofobjek ke datamahasiswa dan untuk mengupdate nilai idxLast.

3. Untuk traversal secara berurutan untuk mengprint data.

4. Jika ada data tree ditaruh pada indeks 2 maka left childnya ada pada indeks 5 dan right child pada indeks 6.

5. Untuk penanda bahwa data yang terisi terakhir, terletak pada indeks 6.

6. Indeks (2 * idxStart + 1) dan (2 * idxStart + 2) digunakan untuk merepresentasikan anak kiri dan kanan dalam struktur pohon biner (binary tree) yang disusun ke dalam array (larik). Sifat Pohon Biner: Dalam pohon biner penuh atau lengkap, setiap simpul (node) maksimal memiliki dua anak: anak kiri dan anak kanan.Pemetaan Array: Jika sebuah simpul berada di indeks i, maka anaknya dapat ditentukan secara matematis dengan rumus: Anak Kiri: (2 * i + 1) Anak Kanan: (2 * i + 2 Sistem Indeks Berbasis 0: Rumus ini berlaku jika array dimulai dari indeks 0. Sebagai contoh, jika simpul akar berada di indeks 0 (idxStart = 0): Anak kiri berada di indeks (2 * 0 + 1 = 1). Anak kanan berada di indeks (2 * 0 + 2 = 2)


## 14.4 Tugas
### Studi kasus 

<img width="547" height="195" alt="Screenshot 2026-06-02 220751" src="https://github.com/user-attachments/assets/5e88d738-4139-4d32-b4b4-230d6e6691c2" />


### Hasil Running kode program dari studi kasus
   Hasil Run dan dokumentasi beberapa method penambahan :
   Hasil Run pada BinaryTreeMain : <br>
   <img width="435" height="632" alt="Screenshot 2026-06-02 224646" src="https://github.com/user-attachments/assets/75a4fab4-c767-472d-87d2-1b97e774854b" />
   <img width="554" height="375" alt="Screenshot 2026-06-02 224655" src="https://github.com/user-attachments/assets/3164cb54-d592-409d-98f0-6204b45d5ac8" />

   Hasil Run pada BinaryTreeArrayMain: <br>
   <img width="431" height="318" alt="Screenshot 2026-06-02 224712" src="https://github.com/user-attachments/assets/610b66a5-63e7-48bb-856e-f31737743cbb" />

   
   Method Addrekursif : <br>
   <img width="555" height="352" alt="Screenshot 2026-06-02 224130" src="https://github.com/user-attachments/assets/054fc54e-2cfc-443c-82b5-3d2ca9c3a614" />


   Method cariMinIPK :<br>
<img width="397" height="196" alt="Screenshot 2026-06-02 224138" src="https://github.com/user-attachments/assets/987fd4a7-59f3-4543-a1bb-133f206cea48" />


   Method cariMaxIPK :<br>
<img width="395" height="192" alt="Screenshot 2026-06-02 224145" src="https://github.com/user-attachments/assets/535feda9-0393-4c41-ab01-6160b80b8e02" />


   Method tampilIPKMahasiswadiAtas : <br>
<img width="563" height="143" alt="Screenshot 2026-06-02 224246" src="https://github.com/user-attachments/assets/917fd3c8-a1f0-47e6-ac9a-93dc98a78ed4" />


   Method add pada binarytreearray : <br>
<img width="506" height="328" alt="Screenshot 2026-06-02 224309" src="https://github.com/user-attachments/assets/57256508-fa37-47be-a114-3e4fb5302001" />


   Method traversePreOrder pada binarytreearray : <br>
<img width="521" height="135" alt="Screenshot 2026-06-02 224315" src="https://github.com/user-attachments/assets/f226b01c-1531-483d-92f4-275029659928" />

