# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## Percobaan 6.2: Praktikum Mengimplementasikan Sorting menggunakan object
#### A. Sorting - BUBBLE SORT
Hasil running program Percobaan 6.2 bagian A

<img width="320" height="105" alt="Screenshot 2026-04-06 113329" src="https://github.com/user-attachments/assets/cb3ef5da-360b-477b-8a97-1ec62eabdc13" />


#### B. Sorting - SELECTION SORT
Penambahan pada class Sorting.java berupa method Selection sort

<img width="306" height="208" alt="Screenshot 2026-04-06 113713" src="https://github.com/user-attachments/assets/a86bc7da-4a2e-4228-8017-3aceac98c7d8" />

Penambahan Pada class SortingMain.Java berupa deklarasi array dan objek baru

<img width="497" height="168" alt="Screenshot 2026-04-06 113728" src="https://github.com/user-attachments/assets/1d8870e8-3d29-4048-8099-eec8c5aa8441" />

Hasil running program Percobaan 6.2 bagian B

<img width="331" height="156" alt="Screenshot 2026-04-06 113907" src="https://github.com/user-attachments/assets/27cc9f24-56ed-4893-bc3f-316401715f96" />

#### C. Sorting - INSERTION SORT
Penambahan pada class Sorting.java berupa method Insertion sort

<img width="294" height="186" alt="Screenshot 2026-04-06 114829" src="https://github.com/user-attachments/assets/cbca8f2f-b7a9-4343-944f-8bb67b15adb8" />

Penambahan Pada class SortingMain.Java berupa deklarasi array dan objek baru

<img width="494" height="153" alt="Screenshot 2026-04-06 114836" src="https://github.com/user-attachments/assets/22e954c0-eab6-4f6a-91ac-64d133fd52c8" />

Hasil running program Percobaan 6.2 bagian C

<img width="350" height="230" alt="Screenshot 2026-04-06 114951" src="https://github.com/user-attachments/assets/028cc73b-d94f-4cdf-b575-06dac4d5b163" />

### Pertanyaan Percobaan 5.2

<img width="349" height="143" alt="Screenshot 2026-04-07 215522" src="https://github.com/user-attachments/assets/08bda47a-367d-4182-8c5d-2e48c84c99e8" />

<img width="421" height="114" alt="Screenshot 2026-04-07 215529" src="https://github.com/user-attachments/assets/56f4f211-4faf-4ffe-9479-167f7ece3f58" />


### Jawaban Percobaan 5.2
1. Fungsi dari kode tersebut adalah untuk mengecek apakah nilai data pertama (yang kiri) apakah lebih besar dari yang kedua (yang kanan) jika iya maka kode tersebut akan menukar posisi dari nilai data tersebut.

2. Screenshot di bawah menunjukkan pencarian nilai minimum pada selection sort

<img width="250" height="98" alt="Screenshot 2026-04-08 120000" src="https://github.com/user-attachments/assets/e1d84eaf-e5d6-42f1-91f7-d56a2bc56bf1" />

3. Maksud dari kondisi dalam perulangan tersebut ialah menggeser elemen-elemen yang lebih besar ke kanan guna mencari posisi yang tepat bagi nilai elemen yang sedang diproses (key) dalam bagian array yang sudah terurut. 

4. Fungsi nya yaitu menyimpan nilai index (j) yang belakang/sebelah kiri kedalam nilai index (j+1) yang depan/ sebelah kanan.




## Percobaan 6.3: Praktikum Sorting Menggunakan Array of Object
### Percobaan 6.3
Hasil running program percobaan 6.3 (Mengurutkan Data Mahasiswa Berdasarkan IPK (Bubble Sort))

<img width="375" height="631" alt="Screenshot 2026-04-06 115341" src="https://github.com/user-attachments/assets/d563efa5-d71a-41c1-b105-4009b61a87c0" />
<img width="263" height="176" alt="Screenshot 2026-04-06 115353" src="https://github.com/user-attachments/assets/e19e5338-e4af-4ae0-8261-41c6d2bc01b7" />




### Pertanyaan Percobaan 6.3

<img width="564" height="249" alt="Screenshot 2026-04-08 120455" src="https://github.com/user-attachments/assets/709909f2-0e56-4874-acc9-658dc802dc2b" />

### Jawaban Percobaan 6.3
1.  a. Agar iterasi nya tidak membuatnya keluar dari jumlah array / mencegah terjadi nya array outofbound.
    b. Agar setiap iterasi j yang selesai semakin lama semakin berkurang karena setiap kali satu iterasi j selesai, pasti nilai yang paling belakang sudah tentu posisinya benar dan tidak perlu melakukan pengecekan, dan itu berlanjut sampai iterasi terakhir
    c. 49 langkah 

2.  Scrennshot Modifikasi program berupa data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!

<img width="425" height="273" alt="Screenshot 2026-04-06 121701" src="https://github.com/user-attachments/assets/18306d54-9e73-42ac-8b0e-ab9506d25277" />

Hasil Running dari perubahan kode program di atas

<img width="317" height="681" alt="Screenshot 2026-04-06 171943" src="https://github.com/user-attachments/assets/2ba18702-c20d-4699-8ad1-c7c764cebd6b" />
<img width="381" height="566" alt="Screenshot 2026-04-06 171955" src="https://github.com/user-attachments/assets/f6cb5804-ec3a-457c-bcda-ac2207f7ca35" />


### Percobaan 6.3.5
Penambahan pada class MahasiswaBerprestasi.java berupa method selection sort

<img width="378" height="210" alt="Screenshot 2026-04-06 193916" src="https://github.com/user-attachments/assets/18941418-438e-43e4-8564-99d96f86e88c" />

Penambahan Pada class MahasiswaDemo.java berupa menambahkan baris program untuk memanggil method selectionSort() tersebut, kemudian panggil method tampil()

<img width="515" height="63" alt="Screenshot 2026-04-06 193928" src="https://github.com/user-attachments/assets/6dd6489a-f55d-4a7e-96e0-f704570b666e" />

Hasil running program percobaan 6.3.5 (Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort))

<img width="279" height="457" alt="Screenshot 2026-04-06 194521" src="https://github.com/user-attachments/assets/6579de68-0ee1-43c9-803a-2d7a307f8596" />
<img width="331" height="633" alt="Screenshot 2026-04-06 194542" src="https://github.com/user-attachments/assets/43afefe7-a092-467d-ad3f-1b4e8a152e67" />
<img width="389" height="563" alt="Screenshot 2026-04-06 194554" src="https://github.com/user-attachments/assets/47991cf4-a22d-49c9-b0de-3275a5c70cd6" />


### Pertanyaan Percobaan 6.3.5

<img width="495" height="206" alt="Screenshot 2026-04-08 122140" src="https://github.com/user-attachments/assets/b2721c9f-3cab-458e-b968-72362a05208f" />



### Jawaban Percobaan 6.3.5
1. Di dalam kode itu pertama ada idxmin yang akan berisi index terkecil sebelum dimulai pencarian index yang lebih kecil daripada index awal, lalu perulangan akan mulai scan / iterasi satu demi satu untuk mencari index terkecil mulai dari index awal lalu +1 dan terus menerus sampai index terakhir. jika ditemukan index yang lebih kecil dari index awal maka idxmin akan menyimpan nilai terkecil yang baru, jika tidak ada maka idxmin tidak akan menyimpan nilai baru dan perulangan akan terus berlanjut sampai index terakhir.


### Percobaan 6.4
Penambahan pada class MahasiswaBerprestasi.java berupa method selection sort

<img width="364" height="180" alt="Screenshot 2026-04-06 194830" src="https://github.com/user-attachments/assets/1344d94d-652b-422b-8e68-69e3ae51fc98" />

Penambahan Pada class MahasiswaDemo.java berupa menambahkan baris program untuk memanggil method insertionSort() dan tampil () 

<img width="525" height="63" alt="Screenshot 2026-04-06 194838" src="https://github.com/user-attachments/assets/8889f33b-677d-43b0-989b-ffa1b5b9dc18" />

Hasil running program percobaan 6.4 (Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort)

<img width="277" height="683" alt="Screenshot 2026-04-06 195401" src="https://github.com/user-attachments/assets/68f101ff-af40-4a90-97fa-7c661d39d050" />
<img width="369" height="649" alt="Screenshot 2026-04-06 195435" src="https://github.com/user-attachments/assets/3a4f1e13-c690-493c-9b05-1eed1e8b7435" />
<img width="379" height="681" alt="Screenshot 2026-04-06 195447" src="https://github.com/user-attachments/assets/f608729e-1f5f-4ff7-870c-e77ffb165869" />

### Pertanyaan Percobaan 6.4

Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.


### Jawaban Percobaan 6.4
Screenshot perubahan method Insertion dari ascending menjadi descending

<img width="376" height="186" alt="Screenshot 2026-04-07 055455" src="https://github.com/user-attachments/assets/3621460c-b14e-4ec2-a1c8-80ca401bdf03" />


Screnshot hasil running dari perubahan kode tersebut

<img width="282" height="683" alt="Screenshot 2026-04-07 055920" src="https://github.com/user-attachments/assets/ee426415-4444-470a-9fbc-75a5bd5ba1ac" />
<img width="376" height="649" alt="Screenshot 2026-04-07 055943" src="https://github.com/user-attachments/assets/a8db40cf-68d9-4077-b0cc-d5ac26088665" />
<img width="393" height="685" alt="Screenshot 2026-04-07 060010" src="https://github.com/user-attachments/assets/ddf9be79-8c29-47a1-a925-50c8811e7dd0" />


## 5.5 Latihan Praktikum
### Tugas 1

<img width="538" height="451" alt="Screenshot 2026-04-08 124647" src="https://github.com/user-attachments/assets/602c3dda-19b5-42d4-97b2-a2629e786862" />
<img width="603" height="224" alt="Screenshot 2026-04-08 124656" src="https://github.com/user-attachments/assets/bba3442f-19cb-4d90-98d0-a04619d22ad8" />


### Jawaban Tugas 1
Hasil running program tugas 1

<img width="212" height="680" alt="Screenshot 2026-04-08 125001" src="https://github.com/user-attachments/assets/1c74a0cb-16ad-475f-9270-239e72833765" />
<img width="455" height="631" alt="Screenshot 2026-04-08 125022" src="https://github.com/user-attachments/assets/f4e09349-539a-4560-914e-7b38c27611ec" />
<img width="503" height="685" alt="Screenshot 2026-04-08 125143" src="https://github.com/user-attachments/assets/d4a33645-bbb0-4256-8d0c-7767ef65228b" />
<img width="482" height="687" alt="Screenshot 2026-04-08 125444" src="https://github.com/user-attachments/assets/d34931e7-bfa7-4101-9207-932197b3d09d" />
<img width="271" height="409" alt="Screenshot 2026-04-08 130032" src="https://github.com/user-attachments/assets/90552a0d-2ff3-4ba7-9409-eb5f1e5832f1" />

