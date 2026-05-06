# Laporan Praktikum LINKED LIST

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Percobaan 1: Praktikum Pembuatan Single Linked List

Hasil running program Percobaan 2.1

<img width="264" height="233" alt="Screenshot 2026-05-06 070829" src="https://github.com/user-attachments/assets/68e86bea-d2da-487b-9c37-7500011fcc3d" />

### Pertanyaan Percobaan 2.1

<img width="650" height="105" alt="Screenshot 2026-05-06 082736" src="https://github.com/user-attachments/assets/1007bfec-19c3-4708-9992-f289a7720190" />


### Jawaban Percobaan 2.1
1. Karena pada saat ada pemanggilan untuk melakukan print isi linked list, pada saat itu masih belum ada data yang disisipkan / ditambahkan di dalam linked listnya.

2. Secara umum dan rata-rata variabel temp ini berfungsi sebagai traverse untuk mengidentifikasi nilai yang ada pada linked list, yang intinya nilai temp ini digunakan untuk bergerak dari satu node ke node lain. Contoh seperti method removeLast, karena kita tidak tahu lokasi nya secara spesifik tentang letak data terakhir, maka dari itu variabel temp ini akan traverse / pindah dari nilai terdepan yaitu head menuju node node yang ada dibelakang nya sampai null / habis.

3. Hasil modifikasi berupa data mahasiswa yang bisa dimasukkan melalui inputan keyboard
   Screenshot modifikasi :
   <img width="433" height="259" alt="Screenshot 2026-05-06 072426" src="https://github.com/user-attachments/assets/69bcd96a-8abe-496b-8a81-03e57bbcf4ff" />


   Hasil run modifikasi kode program :
   <img width="270" height="594" alt="Screenshot 2026-05-06 072650" src="https://github.com/user-attachments/assets/e53e2696-9522-4778-a7db-c98df1c123eb" />

## 2.2 Percobaan 2: Praktikum Modifikasi Elemen pada Single Linked List
Hasil running program percobaan 2.2

<img width="269" height="455" alt="Screenshot 2026-05-06 075810" src="https://github.com/user-attachments/assets/61bae9a1-043b-4a41-989c-93857044fa01" />
<img width="267" height="313" alt="Screenshot 2026-05-06 075824" src="https://github.com/user-attachments/assets/7fdeaa6f-5335-4693-9622-cda0b49a0b7c" />


### Pertanyaan Percobaan 2.2

<img width="504" height="316" alt="Screenshot 2026-05-06 082746" src="https://github.com/user-attachments/assets/5c51f98d-7665-441a-b0bc-007201492a50" />



### Jawaban Percobaan 2.2
1. Break tersebut digunakan untuk menghentikan perulangan tersebut setelah tujuan dari fungsi itu yaitu menghapus sebuah node terpenuhi, karena sekalipun sudah dihapus bisa saja data / node yang sekarang menempati posisi node selanjutnya yang membuat peraturan (while temp!=null) masih terpenuhi dan itu hanya akan membuang-buang waktu, padahal data/node sudah berhasil dihapus.

2. Kode tersebut digunakan untuk menghapus dengan cara memutus node nya. Jika node selanjutnya(misal index 2) ditimpa dengan node selanjutnya lagi(index 3) maka hal tersebut akan membuat data dari node 2 akan terupdate menjadi data node 3(terhapus data 2) yang dalam kasus ini node 2(temp.next) dan node 3(temp.next.next) sedangkan untuk (if temp.next == null) itu untuk mendeteksi apakah node selanjutnya (temp.next )adalah null dan jika iya maka node tersebut (tmp) akan labeli sebagai tail atau data paling belakang



## 2.3 Tugas
### Studi kasus 

<img width="648" height="227" alt="Screenshot 2026-05-06 082753" src="https://github.com/user-attachments/assets/9afd4b12-dcd7-49e5-8040-b65648282f02" />


### Hasil Running kode program dari studi kasus
   Hasil Run dari beberapa method :
   
   Method Menambahkan Antrian: 
   <img width="308" height="597" alt="Screenshot 2026-05-06 221433" src="https://github.com/user-attachments/assets/475bc488-6353-4a0d-864f-24dc848fc35e" />
   <img width="304" height="564" alt="Screenshot 2026-05-06 221447" src="https://github.com/user-attachments/assets/f121b643-6e66-443b-93a4-87b7474d7c9d" />
   
   Method cek Antrian kosong, Antrian penuh, Antrian terdepan : 
   <img width="321" height="648" alt="Screenshot 2026-05-06 221500" src="https://github.com/user-attachments/assets/4cc7d005-e04e-47bd-a531-1e39be7b6772" />

   Method cek Antrian paling belakang, jumlah antrian :
   <img width="311" height="430" alt="Screenshot 2026-05-06 221520" src="https://github.com/user-attachments/assets/b61c20a0-8a46-4c6a-beaf-01c334b5559c" />

   Method tampilkan semua antrian, memanggil antrian :
   <img width="299" height="461" alt="Screenshot 2026-05-06 221534" src="https://github.com/user-attachments/assets/c1d4cae7-d826-4588-a210-4de59987ec9f" />

   Method kosongkan antrian : 
   <img width="316" height="664" alt="Screenshot 2026-05-06 221548" src="https://github.com/user-attachments/assets/3700f766-f6df-4671-b97a-7167dd9b3bd4" />
   <img width="319" height="223" alt="Screenshot 2026-05-06 221556" src="https://github.com/user-attachments/assets/e9386726-454e-4e17-a571-1a168a2a74c8" />






