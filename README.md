# BANKKRUPT-NeatBeans
![gambar 1](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/1.png)

Nama: Ainnaya Nur Akasah

Kelas: XI RPL 4

No Urut: 02

NIS: 4653/1372.070

Nama Sekolah: SMK Telkom Malang



Disini saya akan membuat bagaimana cara membuat program ATM sederhana berbasis GUI dengan tampilan menarik dan userfriendly menggunakan java (NetBeans IDE8.1). Disini saya membuat 3  tampilan yaitu tampilan awal (berupa ucapan selamat datang), tampilan kedua (login dengan memasukkan pin), dan tampilan 3 (proses transaksi).
Berikut adalah tampilan dari program ATMnya:
- **Tampilan Awal**
  
  ![gambar 2](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/2.png)
  
  Nama Fram: mybank
  Pada tampilan awal program ATM ini terdapat 2 button yaitu button EXIT dan button NEXT, yang apabila kita akan melakukan transaksi maka kita klik button NEXT dan melanjutkan ke halaman/tampilan selanjutnya. Sebaliknya, button EXIT berguna untuk keluar dari program.
  Berikut codingan dari 2 button tersebut pada tampilan awal ini:
    - **BUTTON NEXT:**
    
      ![gambar 3](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/3.png)
      
    - **BUTTON EXIT:**
      
      ![gambar 4](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/4.png)
      
- **Tampilan Kedua**

  ![gambar 5](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/5.png)
  
  Nama Frame: mypin
  Ditampilan ini apabila kita memasukkan PIN, otomatis akan tercover menjadi simbol bintang-bintang (****), dikarenakan field yang dipakai adalah jPasswordField dengan class pin int : 1234. Disini jika kita ingin menginputkan PIN yaitu dengan mengklik button-button angka sesuai PIN. Sebelum kita melanjutkan codingan dari button-button, terlebih dahulu kita mengisi class dari frame mypin ini dengan coding dibawah ini:
  
  ![gambar 6](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/6.png)
  
    - **BUTTON 1-0:**
    
      ![gambar 7](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/7.png)
      ![gambar 8](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/8.png)
      ![gambar 9](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/9.png)
      ![gambar 10](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/10.png)
      ![gambar 11](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/11.png)
      ![gambar 12](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/12.png)
      ![gambar 12](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/13.png)
      ![gambar 14](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/14.png)
      ![gambar 15](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/15.png)
      ![gambar 16](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/16.png)
      
      Dan terdapat 3 layanan button yaitu: correct, batal, dan confirm.
    - **BUTTON CORRECTT:**
    
      ![gambar 17](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/17.png)
      
      Jika salah menuliskan PIN, maka button correct berfungsi menghapus PIN yang telah terisi
      
    - **BUTTON BATAL:**
      Berfungsi untuk membatalkan dan keluar dari tampilan pengisian PIN (frame: mypin) ke tampilan awal (frame: mybank).
      
      ![gambar 18](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/18.png)
      
    - **BUTTON CONFIRM:**
       Pada saat kita klik Confirm ada kondisi dimana apabila PIN benar/salah maka akan keluar msgBox. Berikut codingan kondisi pada button CONFIRM:
       
      ![gambar 19](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/19.png)
      
      Jika pin benar, akan melanjutkan ke tampilan transaksi:
      
      ![gambar 20](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/20.png)
      
      Jika pin salah, akan tetap pada tampilan login:
      
      ![gambar 21](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/21.png)
      
  - **Tampilan Ketiga**
  
    ![gambar 22](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/22.png)
    
    ![gambar 23](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/23.png)
      
    Nama Frame: mylayanan
    Ditampilan ketiga ini terdapat 5 option, yang diman masing-masing options memiliki kondisi masing-masing. Options tersebut yaitu: button saldo, button penarikan, button transfer, button setor, button logout.
    
      - **BUTTON SALDO**

        ![gambar 24](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/24.png)
      
        Apabila kita klik button SALDO, maka program akan memberi tahu berapa jumlah saldo yang tersisa. Berikut codingan button saldo:
      
        ![gambar 25](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/25.png)
      
      - **BUTTON PENARIKAN**
      
        ![gambar 26](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/26.png)
      
        Dan apabila kita ingin melakukan penarikan, masukan jumlah penrikan, kemudian klik button PENARIKAN, dan sisa saldo akan otomatis berkurang, karena dikurangi hasil penarikan.
        Berikut codingan dari button penarikan:
      
        ![gambar 27](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/27.png)
      
      - **BUTTON TRANSFER**
      
        ![gambar 28](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/28.png)
      
        Button ini sama dengan penarikan, apabila kita ingin melakukan transfer, masukkan jumlah transfer dan klik button TRANSFER. Dan sisa saldo akan otomatis berkurang.
        
        ![gambar 29](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/29.png)
        
      -**BUTTON SETOR**
      
        ![gambar 30](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/30.png)
      
         Dan untuk melakukan setoran, masukkan jumlah setoran, dan klik Button SETOR, dan saldo otomatis akan bertambah ke rekening kita. Berikut codingannya:
      
         ![gambar 31](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/31.png)
      
      - **BUTTON LOGOUT**
      
        Dan apabila kita ingin keluar dari akun kita, tinggal klik Button LogOut, dan akan keluar msgBox dan kembali ke menu utama. Setelah di klik OK akan muncul tampilan awal.
      
        ![gambar 32](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/32.png)
      
        Dan untuk keluar dari program tinggal click close di pojok kanan atas program ATM.
        Berikut codingnya dari button LogOut:
        
        ![gambar 33](https://github.com/Ainnaya/BANKKRUPT-NeatBeans/blob/3b95a8d13d85ee09729a3617d98384194f726c6c/33.png)
      
        Sekian tutorial dari saya atas nama AINNAYA NUR AKASAH (02) xi rpl 4 dari SMK TELKOM MALANG. Semoga tutorial inin bermanfaat, aamiin.
        Terimakasih.
