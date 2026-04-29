# Laporan Praktikum STACK

<h4>Nama : Naufal Valentino Wijaya<h4>
<h4>NIM : 254107020057<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Percobaan 1: Praktikum pembuatan stack dan method yang ada pada stack 

Hasil running program Percobaan 2.1

<img width="272" height="670" alt="Screenshot 2026-04-23 091937" src="https://github.com/user-attachments/assets/eed538af-82c1-42c5-8288-104021611876" />

<img width="253" height="608" alt="Screenshot 2026-04-23 091953" src="https://github.com/user-attachments/assets/cc2718d4-cc01-4bcc-b844-dbb37b772451" />


### Pertanyaan Percobaan 2.1

<img width="627" height="331" alt="Screenshot 2026-04-28 215421" src="https://github.com/user-attachments/assets/37bb1541-f34a-40f6-9411-ee92df4f77c8" />


### Jawaban Percobaan 2.1
1. Melakukan perbaikan pada kode program bagian proses print seluruh tugas seperti screenshot di bawah ini.<br>
Sebelum dirubah:
<img width="646" height="126" alt="Screenshot 2026-04-23 092317" src="https://github.com/user-attachments/assets/6e6ba357-236a-4171-a206-670179225cb6" /> <br>
Sesudah dirubah:
<img width="644" height="125" alt="Screenshot 2026-04-23 092527" src="https://github.com/user-attachments/assets/3cda53c3-dc57-4f55-b37f-ca1298afca97" /> <br>

2. Jumlah nya bisa diatur sendiri pada kode programnya, namun pada kasus ini hanya 5 data saja yang bisa dimasukkan pada stack ini.<br>
Screenshot bagian kode program:
<img width="493" height="25" alt="Screenshot 2026-04-23 092708" src="https://github.com/user-attachments/assets/dcac327d-2528-436a-9fd2-560a365103cf" /> <br>

3. Pengecekan apakah tidak full atau !isFull berfungsi supaya tidak terjadi yang namanya error indexoutofbound saat melakukan proses penambahan data. Jika tidak ada if else nya maka akan rentan atau bisa saja terjadi yang namanya error array indexoutofbound.

4. Melakukan modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah.<br>
Screenshot modifikasi kode program pada class MahasiswaDemo:
<img width="574" height="99" alt="Screenshot 2026-04-23 095054" src="https://github.com/user-attachments/assets/3cf12651-2b8a-4afd-b0bf-bb1685deafc6" /><br>
Screenshot modifikasi kode program pada class StackTugasMaasiswa:
<img width="632" height="165" alt="Screenshot 2026-04-23 095122" src="https://github.com/user-attachments/assets/9b28e022-7060-4a1a-b6a7-9a8a1cf20b4e" /><br>
Screenshot hasil running modifikasi program:
<img width="257" height="607" alt="Screenshot 2026-04-23 095307" src="https://github.com/user-attachments/assets/50834cd0-3004-42e3-891a-7d5ba9130e57" /><br>
<img width="265" height="519" alt="Screenshot 2026-04-23 095319" src="https://github.com/user-attachments/assets/53c51c01-ed08-4396-8c38-3cadb7947f2f" /><br>

5. Penambahan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini. <br>
Screenshot penambahan kode program pada StackTugasMahasiswa:
<img width="288" height="146" alt="Screenshot 2026-04-23 100652" src="https://github.com/user-attachments/assets/3bc7e8e4-d464-46b3-9bda-2980eea82327" /><br>
Screenshot penambahan kode program pada MahasiswaDemo:
<img width="558" height="101" alt="Screenshot 2026-04-23 100644" src="https://github.com/user-attachments/assets/fa3d7cf4-0d1f-47ec-ba1a-92919f55c955" /><br>
Screenshot Hasil running penambahan kode program:
<img width="333" height="392" alt="Screenshot 2026-04-23 100547" src="https://github.com/user-attachments/assets/dadb53e6-5135-4ecd-90d4-5c4cecd80403" /><br>


## 2.2 Percobaan 2: Praktikum konversi ke biner
Hasil running program percobaan 2.2

<img width="313" height="618" alt="Screenshot 2026-04-23 192450" src="https://github.com/user-attachments/assets/222d92e9-44d2-485b-a64c-b9abf31cb78e" />

### Pertanyaan Percobaan 2.2

<img width="621" height="83" alt="Screenshot 2026-04-28 223720" src="https://github.com/user-attachments/assets/18741227-a64b-4840-a346-c045534313df" />


### Jawaban Percobaan 2.2
1. Dimulai dari pembuatan stack untuk tempat konversi tersebut, lalu melakukan perulangan selagi nilai/parameter lebih dari 0 yang di dalam perulangan tersebut ada proses konversi biner seperti nilai dmodulo 2 lalu sisa dari modulo dimasukkan kedalam stack dan melakukan pembagian berupa nilai / 2 supaya makin lama nilai tersebut akan menurun. <br>
Proses itu akan terus berlanjut sampai perulangan selesai atau nilai sudah mencapai 0. Setelah itu menyiapkan tempat/variabel untuk susunan biner yang akan dioutputkan dan pada stack yang berisi biner tersebut dilakukan string+=stack.pop yang membuatnya mengambil nilai teratas dari stack dan menaruhnya satu persatu dalam string yang akan menjadi susunan biner yang benar.
Setelah itu semua barulah mengreturnkan nilai string yang berisi susunan biner yang sudah terurut tersebut.<br>

2. Tetap bisa dijalankan, karena dikasus ini konversi biner yang kondisi terkecil dari nilai/parameter yang diberikan adalah 0 dan tidak mungkin -1 yang membuatnya masih memungkinkan untuk melakukan konversi biner. <br>



## 2.4 Latihan Praktikum
### Studi kasus 
<img width="629" height="518" alt="Screenshot 2026-04-28 223836" src="https://github.com/user-attachments/assets/3939593b-d2aa-46d5-a038-9aabb56975b8" />

### Hasil Running kode program dari studi kasus
<img width="384" height="585" alt="Screenshot 2026-04-29 094949" src="https://github.com/user-attachments/assets/bae58ffa-3097-4b3f-933d-2d16765af7a1" />

<img width="376" height="470" alt="Screenshot 2026-04-29 094959" src="https://github.com/user-attachments/assets/e87fa12f-a9e3-4320-87ae-b949ba5279ac" />


