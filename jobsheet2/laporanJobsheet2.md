# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 2 Object

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## Percobaan 2.1: Praktikum Deklarasi Class, Atribut dan Method 

Hasil running program Percobaan 2.1

  

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
4. 
5. Berawal dari method nilaiKinerja yang akan menggunakan ipk sebagai kriteria pemilihan, lalu di dalam method tersebut akan dilakukan pemilihan berdasarkan kriteria ipk mulai dari apakah ipk berada di rentang 0.0-4.0, lalu melakukan pemilihan yang lebih spesifik apakah ipknya kurang dari 3, kurang dari 2, dan seterusnya. Setelah melakukan pemilihan tersebut, method tersebut akan mengreturn sebuah String.


## Percobaan 2.2: Praktikum Instansiasi Object, serta Mengakses Atribut dan Method 
Hasil running program percobaan 2.2




### Pertanyaan Percobaan 2.2
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan? 
2. Bagaimana cara mengakses atribut dan method dari suatu objek? 
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

### Jawaban Percobaan 2.2
1. Dari screenshot baris kode di bawah ini, nama objek yang dihasilkan adalah mhs1.
2. Dengan menambahkan operator titik (.) setelah nama objek dan diikuti nama atribut atau method setelah operator titik.
3. Yang pertama berbeda dikarenakan penginputan atributnya masih belum ada perubahan, lalu yang kedua terjadi perubahan karena sebelum tampilkanInformasi(), terjadi perubahan data dengan pemanggilan nama method.  


## Percobaan 2.3: Praktikum Membuat Konstruktor 
Hasil running program percobaan 2.3





### Pertanyaan Percobaan 2.3



### Jawaban Percobaan 2.3
1. 
2. Melakukan sebuah instansiasi objek berupa mhs2 dengan konstruktor yang berparameter
3. 
4. Tidak, karena pada java sekalipun kita memilih method apa yang dirunning terlebih dahulu maka itu tidak akan menimbulkan error dan method yang dipanggil akan tetap running seperti biasa.
5.  



## Tugas 1 
Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. Ilustrasi tampilan array tersebut adalah sebagai berikut: 

<img width="438" height="263" alt="Screenshot 2026-02-17 230119" src="https://github.com/user-attachments/assets/78259d8c-f0ac-463a-b37e-cb986c9d354e" />

### Jawaban Tugas 1

Hasil Running Program tugas 1

<img width="315" height="63" alt="Screenshot 2026-02-17 231212" src="https://github.com/user-attachments/assets/cf352348-398d-4ee2-802c-3fef9308f411" />

## Tugas 2 
Sebuah program digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa. Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan  • Baris menyatakan jadwal ke-i • Kolom menyatakan informasi jadwal: Nama Mata Kuliah, Ruang, Hari Kuliah, , Jam Kuliah. Contoh :  jadwal[0][0] = "Pemrograman Dasar" jadwal[0][1] = "Lab Komputasi 1" jadwal[0][2] = "Senin" jadwal[0][3] = "08.00–10.00" • Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna. 
Buatkan fungsi untuk :
1. Menginput data jadwal kuliah ke dalam array 2 dimensi
2. Menampilkan seluruh jadwal kuliah dalam bentuk tabel
3. Menampilkan jadwal kuliah berdasarkan hari tertentu
4. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu
   
### Jawaban Tugas 2:
Hasil running program tugas 2

<img width="316" height="463" alt="Screenshot 2026-02-18 143936" src="https://github.com/user-attachments/assets/5fe13d99-8a2e-49ec-bc5d-a14ee3fb5a05" />
<img width="590" height="466" alt="Screenshot 2026-02-18 144037" src="https://github.com/user-attachments/assets/11b84d8b-c7fa-40b2-af4f-97a79ff6faef" />
<img width="528" height="262" alt="Screenshot 2026-02-18 144348" src="https://github.com/user-attachments/assets/12e17519-360a-431d-a636-9b41ebf55924" />

