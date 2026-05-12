# Laporan Praktikum DOUBLE LINKED LIST

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## 12.2 Percobaan 1: Praktikum Operasi Penambahan pada Double Linked Lis

Hasil running program Percobaan 12.2

<img width="271" height="463" alt="Screenshot 2026-05-12 053513" src="https://github.com/user-attachments/assets/c48cfe67-a767-4640-8969-d10c7a131e42" />

<img width="284" height="479" alt="Screenshot 2026-05-12 053526" src="https://github.com/user-attachments/assets/2139952f-2e2b-4f54-acfa-aacd6f079a22" />


### Pertanyaan Percobaan 12.2

<img width="701" height="399" alt="Screenshot 2026-05-12 120217" src="https://github.com/user-attachments/assets/d9463a8d-568a-4001-ad63-e0e5437bad35" />

### Jawaban Percobaan 12.2
1. Dari segi struktur, single link list hanya memiliki 2 komponen yaitu data serta next namun double link list memiliki komponen yang sama seperti single link list namun dengan tambahan komponen prev. Dari segi traversal, single link list hanya bisa melakukan traversal satu arah (dari head/awal ke node paling terakhir yaitu tail) sedangkan double link list bisa melakukan traversal 2 arah (dari head ke tail / tail ke head).

2. Pada proses traversal nya yaitu digunakan untuk berpindah seperti next untuk berpindah dari depan ke belakang dan prev untuk berpindah dari belakang ke depan. Namun pada proses. sedangkan untuk proses manipulasi node yaitu untuk melink atau menyambungkan node satu dengan lain namun lebih fleksibel. 

3. Konstruktor tersebut digunakan untuk menyiapkan nilai default dari node yang akan diisi.

4. Karena ini menandakan bahwa itu adalah linked list yang pertama, yang pasti itu akan menjadi head(indikator pertama ) sekaligus tail (indikator terakhir)

5. Modifikasi kode program agar menampilkan pesan "Linked lish masih kosong" pada method print.
   Screenshot modifikasi :
   <img width="401" height="223" alt="Screenshot 2026-05-12 054222" src="https://github.com/user-attachments/assets/6742efa6-4f66-4486-b19d-8e49fa9c723c" />

   Hasil run modifikasi kode program :
   <img width="255" height="342" alt="Screenshot 2026-05-12 054730" src="https://github.com/user-attachments/assets/998246ea-8dbd-4f94-8373-061d44345fe8" />

6. Modifikasi kode program dengan menambahkan method printReverse.
   Screenshot modifikasi :
   <img width="403" height="217" alt="Screenshot 2026-05-12 055055" src="https://github.com/user-attachments/assets/1a421621-f23a-40cd-be64-7cf1f6a365b6" />

   Hasil run modifikasi kode program :
   <img width="258" height="411" alt="Screenshot 2026-05-12 054853" src="https://github.com/user-attachments/assets/509336f4-a947-42e1-8425-a08c79be7472" />
   <img width="290" height="637" alt="Screenshot 2026-05-12 054908" src="https://github.com/user-attachments/assets/389b119a-e3dd-4773-b65c-b24c41e09a1e" />



## 12.3 Percobaan 2: Praktikum Operasi Penghapusan pada Double Linked Lis
Hasil running program percobaan 12.3

<img width="264" height="566" alt="Screenshot 2026-05-12 055958" src="https://github.com/user-attachments/assets/35d68421-6f36-48ef-903f-1cda7225335c" />
<img width="263" height="519" alt="Screenshot 2026-05-12 060010" src="https://github.com/user-attachments/assets/7cad8ed1-cd3b-48b5-b84d-5b500af79a18" />




### Pertanyaan Percobaan 12.3

<img width="700" height="161" alt="Screenshot 2026-05-12 120227" src="https://github.com/user-attachments/assets/19d78849-f9b9-4cc8-8ffe-fa22a4fa7151" />


### Jawaban Percobaan 12.3
1. Pada baris pertama terjadi pemindahan nilai head ke nilai sesudahnya(untuk menghilangkan nilai head yang asil) lalu baris kedua membuat prev dari head yang baru agar hilang sambungannya dengan link head yang lama. 

2. Modifikasi kode program agar menampilkan data yang dihapus pada method removeFirst dan removeLast.
   Screenshot modifikasi :
   <img width="531" height="501" alt="Screenshot 2026-05-12 064111" src="https://github.com/user-attachments/assets/7ec07e69-d493-40e6-b0f5-043e9c0d446c" />


   Hasil run modifikasi kode program :
   <img width="258" height="633" alt="Screenshot 2026-05-12 061128" src="https://github.com/user-attachments/assets/8563e158-6ef9-4027-9cd0-d29b70d772c2" />
   <img width="272" height="514" alt="Screenshot 2026-05-12 061140" src="https://github.com/user-attachments/assets/2fd5b61c-0d8f-4d07-8505-576ce301fb62" />



## 12.5 Tugas
### Studi kasus 

<img width="679" height="254" alt="Screenshot 2026-05-12 120237" src="https://github.com/user-attachments/assets/4119572f-e3c4-4481-9c8a-ffc733774ad0" />

### Hasil Running kode program dari studi kasus
   Hasil Run dari beberapa method :
   Method Add : 
   <img width="322" height="358" alt="Screenshot 2026-05-12 115459" src="https://github.com/user-attachments/assets/8acbdf38-adc5-4f52-b605-5e9a40dab3c6" />
   <img width="295" height="593" alt="Screenshot 2026-05-12 115517" src="https://github.com/user-attachments/assets/643a9740-c352-4754-abc9-96ad5fc6f69a" />

   Method removeAfter : 
   <img width="324" height="351" alt="Screenshot 2026-05-12 115359" src="https://github.com/user-attachments/assets/08667cc7-6837-4296-a83d-30aaeb0a8b34" />

   Method remove :
   <img width="307" height="342" alt="Screenshot 2026-05-12 115312" src="https://github.com/user-attachments/assets/81dfb9f7-adb7-44b4-bc88-ba2d1ef4051e" />
   <img width="295" height="606" alt="Screenshot 2026-05-12 115322" src="https://github.com/user-attachments/assets/9a598587-45c1-4dcf-b482-876d7f646487" />



   Method getFirst :
   <img width="306" height="322" alt="Screenshot 2026-05-12 115125" src="https://github.com/user-attachments/assets/120d57c2-0c49-4555-90f0-5e40f41346a4" />


   Method getLast :
   <img width="277" height="320" alt="Screenshot 2026-05-12 115140" src="https://github.com/user-attachments/assets/a06c868a-aaa2-461a-9bdd-c2e8a78edb62" />


   Method getIndex :
   <img width="301" height="347" alt="Screenshot 2026-05-12 115151" src="https://github.com/user-attachments/assets/65321520-d025-4546-99b6-faba14429ff6" />


   Method tampilkan jumlah data linked list :
   <img width="344" height="268" alt="Screenshot 2026-05-12 115112" src="https://github.com/user-attachments/assets/89f12408-129e-4ac0-a467-ec0825dad33e" />

   
