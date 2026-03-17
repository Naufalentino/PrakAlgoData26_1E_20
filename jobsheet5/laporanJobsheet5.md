# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 5 Brute Force dan Divide Conquer  

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## Percobaan 5.2: Praktikum Membuat Array dari Object, Mengisi dan Menampilkan 

Hasil running program Percobaan 5.2

<img width="323" height="303" alt="Screenshot 2026-02-26 075147" src="https://github.com/user-attachments/assets/205aea84-93a4-43da-8cb0-c55ca43b4442" />

  

### Pertanyaan Percobaan 5.2

<img width="657" height="235" alt="Screenshot 2026-03-03 100654" src="https://github.com/user-attachments/assets/92137dd2-5789-4a41-8cf0-976b0c9bb942" />



### Jawaban Percobaan 5.2
1. Pada bagian if dia merupakan base case dari fungsi tersebut atau batas dari iterasi kode tersebut, sedangkan untuk bagian kode di dalam else dia melakukan rekursif atau pemanggilan fungsi itu lagi sampai mendekati base case.
2. Memungkinkan, yaitu dengan menggunakan perulangan while seperti yang ada pada screenshot di bawah 
3. Kode (faktor *= i) cenderung digunakan pada perulangan for yang melakukan perkalian dari 1 hingga n, sedangkan (fakto = n * faktorialDC(n-1)) cenderung ada pada fungsi rekursif yang memiliki kesamaan penggunaan namun beda dalam hal iterasi nya.
4. Fungsi (faktorialBF) adalah fungsi yang menggunakan brute force alias melakukan pengoperasian satu demi satu secara terus menerus, sedangkan (faktorialDC) membagi pengoperasian yang ada didalamnya untuk menghasilkan hasil yang serupa.




## Percobaan 5.3: Praktikum Menerima Input Isian Array Menggunakan Looping 
Hasil running program percobaan 5.3

<img width="314" height="597" alt="Screenshot 2026-02-26 104436" src="https://github.com/user-attachments/assets/529ae131-834c-4851-8bfb-1b032874b507" />



### Pertanyaan Percobaan 5.3
<img width="480" height="295" alt="Screenshot 2026-03-03 100639" src="https://github.com/user-attachments/assets/0effc92f-270c-4ae6-a03f-de6f2c0ad6c5" />


### Jawaban Percobaan 5.3
1. Method pangkatBF melakukan perkalian variabel n diulangi sebanyak i, sedangkan pangkatDC melakukan rekursif dengan i nya dipecah menjadi beberapa bagian hingga i tersebut bernilai 1.

   

2. Sudah termasuk namun tidak terlihat.

3. Tetap relevan, dan masih bisa dilakukan meskipun tidak ditambahkan parameter. Contoh nya seperti screenshot di bawah ini.


4. Method pangkatBF melakukan perkalian variabel n diulangi sebanyak i menggunakan perulangan for, sedangkan pangkatDC melakukan rekursif dengan i nya dipecah menjadi beberapa bagian hingga i tersebut bernilai 1.



## Percobaan 5.4: Praktikum Constructor Berparameter 
Hasil running program percobaan 5.4 sebelum modfifikasi.

<img width="347" height="346" alt="Screenshot 2026-02-26 080851" src="https://github.com/user-attachments/assets/df5bc9c2-7e53-4106-ad6e-21482e75ae18" />

Hasil running program sesudah modifikasi berupa menampilkan hasil inputan array of objects pada langkah terakhir

<img width="323" height="648" alt="Screenshot 2026-02-26 081408" src="https://github.com/user-attachments/assets/5e6f522f-46d5-409e-af24-64a629628913" />




### Pertanyaan Percobaan 5.4
<img width="657" height="235" alt="Screenshot 2026-03-03 100654" src="https://github.com/user-attachments/assets/25075e1c-13c2-4502-84b5-af46cfc025f2" />




### Jawaban Percobaan 5.4
1. Untuk menentukan index tengah dari array tersebut supaya bisa dibagi menjadi dua bagian.

  <img width="568" height="321" alt="Screenshot 2026-03-03 101802" src="https://github.com/user-attachments/assets/13d50882-ba06-4d94-9762-0839b7f3c957" />

2. Untuk melakukan proses divide atau membagi operasi menjadi bagian-bagian tertentu, namun jika kasusnya melibatkan array maka diperlukan dua baris kode seperti yang ada pada soal, dikarenakan array tersebut perlu dibagi menjadi dua bagian.

<img width="603" height="392" alt="Screenshot 2026-03-03 105524" src="https://github.com/user-attachments/assets/79ad7e29-cd6b-4fc9-b5e0-00d0a1abed44" />

<img width="521" height="24" alt="Screenshot 2026-03-03 103049" src="https://github.com/user-attachments/assets/6d12e381-a809-4208-873c-b3d75551bce7" />



3. Karena fungsi itu dibuat untuk mengetahui total keseluruhan yang membuat nilai returnnya berupa lsum+rsum.

<img width="613" height="199" alt="Screenshot 2026-03-03 105537" src="https://github.com/user-attachments/assets/a4609c64-08ea-4ac3-b5cf-32711bdc682a" />

<img width="377" height="19" alt="Screenshot 2026-03-03 103104" src="https://github.com/user-attachments/assets/f98e7d48-1ff4-4ffb-b8b6-547b2bb3426f" />

4. ketika parameter left dan right nya sama.

<img width="516" height="103" alt="Screenshot 2026-03-03 110023" src="https://github.com/user-attachments/assets/3bb2849b-9120-41f7-9195-ecca61d2d497" />

5. Dimulai dari mengecek base case (left apakah sama dengan right) lalu jika tidak dia akan lanjut mencari nilai variabel mid ((left+mid)/2) setelah itu mereka akan dipisah menjadi bagian kanan(rsum) dan bagian kiri (lsum) yang akan melakukan proses rekursif yang berulang ulang mulai dari mengecek base case. Sesaat setelah mencapai base case maka nilai trsbut disimpan pada rsum dan lsum dan setelah itu di return dengan nilai rsum + lsum.


## 5.5 Latihan Praktikum
### Tugas 1

<img width="643" height="378" alt="Screenshot 2026-03-03 110453" src="https://github.com/user-attachments/assets/13195de0-ad77-4e09-b2f2-317284f731ea" />


### Jawaban Tugas 1
Hasil running program tugas 1

<img width="323" height="648" alt="Screenshot 2026-02-26 081408" src="https://github.com/user-attachments/assets/3f7827ae-cfd6-4244-9b3e-82b0ae7dc610" />

