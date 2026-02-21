# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 2 Object

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## Percobaan 2.1: Praktikum Deklarasi Class, Atribut dan Method 

Hasil running program Percobaan 2.1

<img width="721" height="83" alt="Screenshot 2026-02-20 132414" src="https://github.com/user-attachments/assets/19bd7ec1-cf3c-4acc-a19a-55a84965ec3a" />
  

### Pertanyaan Percobaan 2.1
1. Sebutkan dua karakteristik class atau object! 
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya! 
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! 
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut? 


### Jawaban Percobaan 2.1
1. Karakteristik dari class atau objek ini yaitu penggunaan konstruktor untuk inisialisasi dan memuat method serta atribut di dalamnya.
2. Ada 4 atribut, yang terdiri dari atribut nama, nim, ipk, dan kelas.
3. ada 4 method, yang terdiri dari method tampilkan informasi, ubah kelas, update ipk, dan nilai kinerja
   
4. Screenshot dibawah ini merupakan modifikasi method berupa penambahan pemilihan pada method updateIpk

 <img width="601" height="145" alt="Screenshot 2026-02-21 161709" src="https://github.com/user-attachments/assets/06132bd2-2a61-44c1-b4ce-4ba37d479276" />
 
   
5. Berawal dari method nilaiKinerja yang akan menggunakan ipk sebagai kriteria pemilihan, lalu di dalam method tersebut akan dilakukan pemilihan berdasarkan kriteria ipk mulai dari apakah ipk berada di rentang 0.0-4.0, lalu melakukan pemilihan yang lebih spesifik apakah ipknya kurang dari 3, kurang dari 2, dan seterusnya. Setelah melakukan pemilihan tersebut, method tersebut akan mengreturn sebuah String.


## Percobaan 2.2: Praktikum Instansiasi Object, serta Mengakses Atribut dan Method 
Hasil running program percobaan 2.2

<img width="314" height="208" alt="Screenshot 2026-02-21 132716" src="https://github.com/user-attachments/assets/bce45b30-8aa5-4754-a991-31d06e5aae76" />


### Pertanyaan Percobaan 2.2
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan? 
2. Bagaimana cara mengakses atribut dan method dari suatu objek? 
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

### Jawaban Percobaan 2.2
1. Dari screenshot baris kode di bawah ini, nama objek yang dihasilkan adalah mhs1.
   
<img width="584" height="137" alt="Screenshot 2026-02-21 144655" src="https://github.com/user-attachments/assets/59e7e525-8ea9-48e8-9caf-3635fcd09a15" />

2. Dengan menambahkan operator titik (.) setelah nama objek dan diikuti nama atribut atau method setelah operator titik.
3. Yang pertama berbeda dikarenakan penginputan atributnya masih belum ada perubahan, lalu yang kedua terjadi perubahan karena sebelum tampilkanInformasi(), terjadi perubahan data dengan pemanggilan nama method.  


## Percobaan 2.3: Praktikum Membuat Konstruktor 
Hasil running program percobaan 2.3

<img width="344" height="339" alt="Screenshot 2026-02-21 144534" src="https://github.com/user-attachments/assets/ec1d1b2e-b27a-49b5-9596-a539d819c62f" />

### Pertanyaan Percobaan 2.3

<img width="533" height="174" alt="Screenshot 2026-02-21 162813" src="https://github.com/user-attachments/assets/9ce3952b-0b5e-48dd-85e7-ed4601c7803e" />
<img width="501" height="125" alt="Screenshot 2026-02-21 162829" src="https://github.com/user-attachments/assets/9fc553a3-c7fa-4989-bb8f-f53f078913c4" />


### Jawaban Percobaan 2.3
1. Screeshot baris kode di bawah ini merupakan baris kode yang berisi pendeklarasian konstruktor.

   <img width="584" height="137" alt="Screenshot 2026-02-21 144655" src="https://github.com/user-attachments/assets/905a9f26-4efa-4a89-84a6-b997796182db" />

2. Melakukan sebuah instansiasi objek berupa mhs2 dengan konstruktor yang berparameter

3. Dari screenshot di bawah ini dapat terlihat, jika kita menghapus baris kode yang berisi konstruktor tanpa parameter maka objek yang memanggil konstruktor tersebut akan error.

   <img width="535" height="124" alt="Screenshot 2026-02-21 144930" src="https://github.com/user-attachments/assets/3834c6ed-c6b8-49d7-929f-807b538b534b" />

4. Tidak, karena pada java sekalipun kita memilih method apa yang dirunning terlebih dahulu maka itu tidak akan menimbulkan error dan method yang dipanggil akan tetap running seperti biasa.
5.  Penambahan objek baru berupa mhs<namaMahasiswa> yang terlihat seperti screenshot dibawah.

<img width="745" height="33" alt="Screenshot 2026-02-21 145251" src="https://github.com/user-attachments/assets/d812c8a2-7eb5-49fc-b313-e4990c936a0e" />


## 2.4 Latihan Praktikum
### Latihan 1

<img width="536" height="544" alt="Screenshot 2026-02-21 163748" src="https://github.com/user-attachments/assets/74d44b64-f502-4aad-b9e6-e3346f9eb584" />
<img width="480" height="262" alt="Screenshot 2026-02-21 163758" src="https://github.com/user-attachments/assets/bf8820b6-ec5b-454f-88db-0bb58da83bfc" />


### Jawaban Latihan 1
Hasil running program latihan 1

<img width="809" height="465" alt="Screenshot 2026-02-21 164444" src="https://github.com/user-attachments/assets/b6b2d6f6-4209-4fb3-ac58-6c1063f56c00" />

## Tugas 2 
<img width="526" height="518" alt="Screenshot 2026-02-21 163813" src="https://github.com/user-attachments/assets/fde8d8e8-a74b-476e-89a9-f925bf61d079" />
<img width="519" height="327" alt="Screenshot 2026-02-21 163823" src="https://github.com/user-attachments/assets/04ac3239-1398-4e84-9193-2d4fae75a7d9" />

   
### Jawaban Latihan 2:
Hasil running program latihan 2

<img width="324" height="378" alt="Screenshot 2026-02-21 164610" src="https://github.com/user-attachments/assets/085d24ee-b9cb-414a-b6e5-07641a45a62b" />


