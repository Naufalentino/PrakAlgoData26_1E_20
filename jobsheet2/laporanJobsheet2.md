# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 2 Object

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## Percobaan 2.1: Praktikum Deklarasi Class, Atribut dan Method 

Hasil running program Percobaan 2.1

<img width="721" height="83" alt="Screenshot 2026-02-20 132414" src="https://github.com/user-attachments/assets/490b9e27-d5ff-4331-8dc8-a655e767587f" />


### Pertanyaan Percobaan 2.1
1. Sebutkan dua karakteristik class atau object! 
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
   

### Jawaban Percobaan 2.1
1. Karakteristik class berupa cetak biru atau template fundamental yang mendefinisikan struktur dan memiliki atribut di dalamnya, dan karakteristik dari object berupa identitas dan behaivor.
2. Ada 4 atribut yang terdiri dari nama, nim, kelas, dan ipk.
3. Ada 4 method yaitu method tampilkanInformasi, updateIpk, ubahKelas, dan nilaiKinerja.
4. Screenshot modifikasi method updateIpk dibawah ini:

   <img width="519" height="272" alt="Screenshot 2026-02-20 154846" src="https://github.com/user-attachments/assets/fbab9d44-95b7-47ba-894f-1f02f43e0257" />

5. Pertama method nilaiKinerja akan memakai atribut ipk untuk menghasilkan nilai return berupa string melalui pemilihan.


## Percobaan 2.2: Praktikum instansiasi Object, serta Mengakses Atribut dan Method 
Hasil running program percobaan 2.2

<img width="818" height="107" alt="Screenshot 2026-02-17 222429" src="https://github.com/user-attachments/assets/66acf669-de66-4ac1-9d1f-c6a7a36104d8" />


### Pertanyaan Percobaan 2.2
1. Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n,  dengan n = 2-digit terakhir NIM Anda. Berikut Adalah ketentuan untuk mencetak deretnya a. Bilangan kelipatan 3 dicetak dengan simbol # b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya c. Bilangan ganjil dicetak dengan simbol * d. Bilangan 10 dan 15 tidak dicetak *bila n<10 maka tambahkan 10 (n+=10) Contoh 1: Input NIM: 2541720102 maka n=12 Output: * 2 # 4 * # * 8 # * # Contoh 2: Input NIM: 2541720120 maka n=20 Output: * 2 # 4 * # * 8 # * # * 14 16 * # * 20 

### Jawaban Percobaan 2.2
1. Hasil running:

  <img width="312" height="68" alt="Screenshot 2026-02-17 222753" src="https://github.com/user-attachments/assets/65d9d71e-1f38-46de-8943-8cdd522b1a34" />
  <img width="301" height="68" alt="Screenshot 2026-02-17 222759" src="https://github.com/user-attachments/assets/4e0cfd37-d2c6-4a77-a761-dcf43e9edeca" />


## Percobaan 2.3: Praktikum Membuat Konstruktor 
Hasil running program percobaan 2.3

<img width="380" height="509" alt="Screenshot 2026-02-18 145625" src="https://github.com/user-attachments/assets/b2b92296-28a4-4406-bb22-b480aa2f6d5b" />
<img width="516" height="515" alt="Screenshot 2026-02-18 145634" src="https://github.com/user-attachments/assets/6c23c3b7-0bf6-4abb-82f3-d51eea26cdd7" />



### Pertanyaan Percobaan 2.3
<img width="455" height="580" alt="Screenshot 2026-02-18 150515" src="https://github.com/user-attachments/assets/83a0e388-fd5b-4b56-bf71-e2597ee05ceb" />


### Jawaban Percobaan 2.3
1. Hasil running program menghitung IP semester

<img width="380" height="509" alt="Screenshot 2026-02-18 145625" src="https://github.com/user-attachments/assets/b2b92296-28a4-4406-bb22-b480aa2f6d5b" />
<img width="516" height="515" alt="Screenshot 2026-02-18 145634" src="https://github.com/user-attachments/assets/6c23c3b7-0bf6-4abb-82f3-d51eea26cdd7" />

## Percobaan 2.4: Praktikum Fungsi
Hasil running program percobaan 2.4

<img width="473" height="199" alt="Screenshot 2026-02-17 224514" src="https://github.com/user-attachments/assets/d84bdc21-7830-46de-94b0-109ac1c93492" />

### Pertanyaan Percobaan 2.4
<img width="505" height="294" alt="Screenshot 2026-02-17 224728" src="https://github.com/user-attachments/assets/23e64563-1c9a-4da4-9e5d-f3b0f7a5ec08" />

### Jawaban Percobaan 2.4
1. Fungsi untuk menampilkan pendapatan cabang

  <img width="1106" height="233" alt="Screenshot 2026-02-17 225455" src="https://github.com/user-attachments/assets/41368c90-7590-4bf6-ad83-4b6a7a5bd582" />

2. Tampilan Status tiap cabang berupa (Perlu evaluasi/Sangat Baik)

  <img width="1106" height="233" alt="Screenshot 2026-02-17 225455" src="https://github.com/user-attachments/assets/0e8f5696-6090-404d-9696-288e7959bf52" />


## Tugas 1 
Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. Ilustrasi tampilan array tersebut adalah sebagai berikut: 

<img width="438" height="263" alt="Screenshot 2026-02-17 230119" src="https://github.com/user-attachments/assets/78259d8c-f0ac-463a-b37e-cb986c9d354e" />

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
1. Fungsi untuk menginputkan jadwal kuliah
  <img width="476" height="366" alt="Screenshot 2026-02-18 082231" src="https://github.com/user-attachments/assets/15628222-84d3-4163-815b-0d0b9d571546" />
  
2. Fungsi untuk menampilkan seluruh jadwal
<img width="1047" height="185" alt="Screenshot 2026-02-18 082512" src="https://github.com/user-attachments/assets/aa4a3858-378c-4853-928b-872ff73a1da1" />

3. Fungsi untuk menampilkan jadwal kuliah berdasarkan hari tertentu
<img width="1130" height="300" alt="Screenshot 2026-02-18 082531" src="https://github.com/user-attachments/assets/2eb91721-be9d-4d31-84cc-c0925353061d" />

4. Fungsi untuk menampilkan seluruh jadwal kuliah berdasarkan mata kuliah tertentu
<img width="1097" height="336" alt="Screenshot 2026-02-18 143801" src="https://github.com/user-attachments/assets/672687e3-3049-4765-b6f2-d241c95d443c" />


Hasil running program tugas 2

<img width="316" height="463" alt="Screenshot 2026-02-18 143936" src="https://github.com/user-attachments/assets/5fe13d99-8a2e-49ec-bc5d-a14ee3fb5a05" />
<img width="590" height="466" alt="Screenshot 2026-02-18 144037" src="https://github.com/user-attachments/assets/11b84d8b-c7fa-40b2-af4f-97a79ff6faef" />
<img width="528" height="262" alt="Screenshot 2026-02-18 144348" src="https://github.com/user-attachments/assets/12e17519-360a-431d-a636-9b41ebf55924" />





