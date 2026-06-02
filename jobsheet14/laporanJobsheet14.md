# Laporan Praktikum Tree

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## 14.2 Percobaan 1: Praktikum implementasi Binary Search Tree menggunakan Linked List 

Hasil running program Percobaan 14.2




### Pertanyaan Percobaan 14.2



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





### Pertanyaan Percobaan 14.3



### Jawaban Percobaan 14.3
1. Atribut data digunakan untuk menyimpan data yang ada pada array tersebut dan idxLast berfungsi untuk pemberi tanda untuk index data pada array paling akhir.

2. Digunakan untuk memasukkan data arrayofobjek ke datamahasiswa dan untuk mengupdate nilai idxLast.

3. Untuk traversal secara berurutan untuk mengprint data.

4. Jika ada data tree ditaruh pada indeks 2 maka left childnya ada pada indeks 5 dan right child pada indeks 6.

5. Untuk penanda bahwa data yang terisi terakhir, terletak pada indeks 6.

6. Indeks (2 * idxStart + 1) dan (2 * idxStart + 2) digunakan untuk merepresentasikan anak kiri dan kanan dalam struktur pohon biner (binary tree) yang disusun ke dalam array (larik). Sifat Pohon Biner: Dalam pohon biner penuh atau lengkap, setiap simpul (node) maksimal memiliki dua anak: anak kiri dan anak kanan.Pemetaan Array: Jika sebuah simpul berada di indeks i, maka anaknya dapat ditentukan secara matematis dengan rumus: Anak Kiri: (2 * i + 1) Anak Kanan: (2 * i + 2 Sistem Indeks Berbasis 0: Rumus ini berlaku jika array dimulai dari indeks 0. Sebagai contoh, jika simpul akar berada di indeks 0 (idxStart = 0): Anak kiri berada di indeks (2 * 0 + 1 = 1). Anak kanan berada di indeks (2 * 0 + 2 = 2)


## 14.4 Tugas
### Studi kasus 


### Hasil Running kode program dari studi kasus
   Hasil Run dari beberapa method :
   Method Addrekursif : 


   Method cariMinIPK : 


   Method cariMaxIPK :


   Method tampilIPKMahasiswadiAtas :


   Method add pada binarytreearray :


   Method traversePreOrder pada binarytreearray :

