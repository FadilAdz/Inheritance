# Inheritance
<img src=https://raw.githubusercontent.com/bablubambal/All_logo_and_pictures/1ac69ce5fbc389725f16f989fa53c62d6e1b4883/programming%20languages/java.svg width="120px">

## Latihan
• Lengkapi latihan class
Mahasiswa dengan
setter dan getter. <br>
• Implementasikan java
code diagram class
berikut : <br>

![img](P5/assets/soal.png)


1. Kelas Pegawai (Superclass/Parent Class)
Kelas Pegawai adalah kelas dasar (parent class) yang menjadi induk dari kelas Manager dan Programmer. Kelas ini memiliki atribut dasar yang dimiliki oleh semua pegawai, yaitu nama dan gajiPokok. <br>

Atribut :

nama : Tipe data String, digunakan untuk menyimpan nama pegawai.
gajiPokok : Tipe data double, digunakan untuk menyimpan gaji pokok pegawai.


Metode Setter dan Getter :

  Setter :
  setNama(String nama): Digunakan untuk menetapkan nama pegawai.
  setGajiPokok(double gajiPokok): Digunakan untuk menetapkan gaji pokok pegawai.

  Getter :
  getNama(): Mengembalikan (return) nilai nama pegawai.
  getGajiPokok(): Mengembalikan (return) nilai gaji pokok pegawai.
  Metode cetakInfo: Metode ini digunakan untuk mencetak informasi pegawai, seperti nama dan gaji pokoknya. Ini adalah metode umum yang dapat digunakan oleh semua jenis      pegawai.

  ``` java
public void cetakInfo() {
    System.out.println("Nama: " + getNama());
    System.out.println("Gaji Pokok: " + getGajiPokok());
}
```
