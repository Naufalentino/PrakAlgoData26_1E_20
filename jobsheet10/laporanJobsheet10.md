# Laporan Praktikum QUEUE

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Percobaan 1: Praktikum Operasi Dasar Queue 

Hasil running program Percobaan 2.1

<img width="266" height="573" alt="Screenshot 2026-04-29 232838" src="https://github.com/user-attachments/assets/e6165a3b-79fc-4d00-98a3-659e00b66540" />



### Pertanyaan Percobaan 2.1

<img width="700" height="514" alt="Screenshot 2026-05-04 084011" src="https://github.com/user-attachments/assets/b7cd4fb6-e241-4aba-8174-71d968563abc" />



### Jawaban Percobaan 2.1
1. Karena dalam pemrograman, indeks array dimulai dari 0. Oleh karena itu, -1 digunakan untuk menunjukkan posisi yang tidak valid atau di luar batas bawah array, menandakan belum ada data yang masuk. Sedangkan size disini merujuk ke jumlah data kosong/jumlah storage yang kosong.

2. Maksud dari pemilihan ini berfungsi untuk memindahkan nilai rear ke 0 jika nilai dari rear sama dengan max-1 (jumlah panjang array)

3. Maksud dari pemilihan ini berfungsi untuk memindahkan nilai front ke 0 jika nilai dari front sama dengan max-1 (jumlah panjang array)

4. Karena pada kasus ini queue beroperasi dengan prinsip FIFO Setelah beberapa operasi dequeue (penghapusan), elemen terdepan yang sebenarnya (elemen yang masuk paling awal) tidak lagi berada di indeks array 0, melainkan bergeser ke indeks yang lebih tinggi sesuai posisi pointer front.

5. Ini digunakan karena queue berprisnip FIFO yang membuat jika terjadi dequeue maka maka iterasi i bisa terus berputar setelah mencapai max lalu putar lagi ke index 0 sampai habis.

6. Screenshot di bawah ini menunjukkan kode program yang merupakan qeue overflow :
   <img width="326" height="58" alt="Screenshot 2026-05-04 083803" src="https://github.com/user-attachments/assets/e420e216-c203-44e5-beb8-9fb4295fe078" />

7. Hasil modifikasi berupa pengehentian program :
   Screenshot kode program :
   <img width="434" height="265" alt="Screenshot 2026-05-04 085919" src="https://github.com/user-attachments/assets/18c6b1f9-cb6f-4638-aef7-8020461ad6f6" />


   Hasil Run Modifikasi Kode Program:
   <img width="243" height="428" alt="Screenshot 2026-04-30 073916" src="https://github.com/user-attachments/assets/fbe15d10-fe68-46f2-bc9d-f9a1c1e32fd1" />
   <img width="271" height="425" alt="Screenshot 2026-04-30 074025" src="https://github.com/user-attachments/assets/31c5192a-e021-46b0-965a-35179410a5b4" />




## 2.2 Percobaan 2: Praktikum Antrian Layanan Akademik 
Hasil running program percobaan 2.2
<img width="248" height="609" alt="Screenshot 2026-04-30 085735" src="https://github.com/user-attachments/assets/4404f944-c226-4e78-8a1a-423be2d16996" />
<img width="264" height="635" alt="Screenshot 2026-04-30 085748" src="https://github.com/user-attachments/assets/510b9e67-7221-457a-924e-bf73fff5993c" />



### Pertanyaan Percobaan 2.2

<img width="581" height="112" alt="Screenshot 2026-05-04 084044" src="https://github.com/user-attachments/assets/b77056ef-7e8a-43ac-9afb-480f5dd339e2" />



### Jawaban Percobaan 2.2
1. Hasil modifikasi program berupa method dan pemanggilan yang berfungsi untuk melihat data paling terakhir :
   Screenshot modifikasi program pada class AntrianLayanan :
   <img width="403" height="156" alt="Screenshot 2026-05-04 091208" src="https://github.com/user-attachments/assets/474948a3-f375-4c10-8385-d3f74ce577b6" />
   
   Screenshot modifikasi program pada class LayananAkademikSIAKAD :
   <img width="462" height="159" alt="Screenshot 2026-05-04 091142" src="https://github.com/user-attachments/assets/f5d8cdc4-6e19-48af-86d3-0a464e8bf561" />
   <img width="183" height="55" alt="Screenshot 2026-05-04 091150" src="https://github.com/user-attachments/assets/e65573ad-bfb9-4510-a163-60dd1c7c29dc" />

   Screenshot hasil run modifikasi kode program :
   <img width="232" height="644" alt="Screenshot 2026-04-30 091227" src="https://github.com/user-attachments/assets/652e7c47-3734-415d-aefa-fffdf86fb290" />
   <img width="232" height="191" alt="Screenshot 2026-04-30 091237" src="https://github.com/user-attachments/assets/51197dd5-4529-434b-bc9b-e0fe681b65e3" />




## 2.3 Tugas
### Studi kasus 
<img width="585" height="337" alt="Screenshot 2026-05-04 084323" src="https://github.com/user-attachments/assets/72892d29-c2fa-4967-bc18-0421e49b982b" />

### Hasil Running kode program dari studi kasus
1. Gamabar Diagram :
   <img width="617" height="443" alt="Screenshot 2026-04-30 212626" src="https://github.com/user-attachments/assets/ffe619bc-fa71-4d35-9fc2-a18c0250aebf" />

2. Hasil Run dari beberapa method :
   <img width="318" height="684" alt="Screenshot 2026-05-01 214748" src="https://github.com/user-attachments/assets/af94764a-30da-41d5-9101-7568a7299dba" />
   <img width="351" height="627" alt="Screenshot 2026-05-01 214800" src="https://github.com/user-attachments/assets/57d9e462-0616-4c74-b6a5-ed6f1b104cb0" />
   <img width="371" height="246" alt="Screenshot 2026-05-01 214815" src="https://github.com/user-attachments/assets/48bbcc2b-9431-4860-931f-3c0b14ea4ad3" />
   <img width="330" height="304" alt="Screenshot 2026-05-01 214834" src="https://github.com/user-attachments/assets/b873fbf3-0c33-46d5-b94f-647e9c249961" />
   






