package Prosedur_Fungsi;

import java.util.Scanner;

public class Soal_1 {

  // Kelas SistemPenjualanTiket untuk mengelola penjualan tiket
  public static class SistemPenjualanTiket {
    private String namaTim; // Menyimpan nama tim yang bertanding
    private String tanggalPertandingan; // Menyimpan tanggal pertandingan
    private int jumlahTiketTersedia; // Menyimpan jumlah tiket yang tersedia untuk dijual

    // konstruktor
    public SistemPenjualanTiket() {
      this.jumlahTiketTersedia = 200; // Jumlah tiket yang tersedia
    }

    // untuk memasukkan data pertandingan
    public void masukkanDataPertandingan() {
      Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input
      System.out.print("Masukkan nama tim : ");
      this.namaTim = scanner.nextLine(); // Menyimpan nama tim
      System.out.print("Masukkan tanggal pertandingan (dd/MM/yyyy) : ");
      this.tanggalPertandingan = scanner.nextLine(); // Menyimpan tanggal pertandingan
    }

    // untuk membeli tiket
    public void beliTiket() {
      Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input
      System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
      int tiketYangDibeli = scanner.nextInt(); // Membaca jumlah tiket yang ingin dibeli

      // Memeriksa apakah tiket yang diminta tersedia
      if (tiketYangDibeli > jumlahTiketTersedia) {
        System.out.println("Maaf, tiket tidak cukup. Sisa tiket : " + jumlahTiketTersedia);
      } else {
        jumlahTiketTersedia -= tiketYangDibeli; // Mengurangi jumlah tiket yang tersedia
        System.out.println("Pembelian berhasil! Jumlah tiket yang dibeli : " + tiketYangDibeli);
      }
    }

    // untuk menampilkan informasi pertandingan
    public void tampilkanInfoPertandingan() {
      System.out.println("=== Informasi Pertandingan ===");
      System.out.println("- Nama Tim : " + namaTim); // Menampilkan nama tim
      System.out.println("- Tanggal Pertandingan : " + tanggalPertandingan); // Menampilkan tanggal pertandingan
      System.out.println("- Tiket Tersedia : " + jumlahTiketTersedia); // Menampilkan sisa tiket
    }

    // untuk menampilkan sisa tiket yang tersedia
    public void tampilkanSisaTiket() {
      System.out.println("Sisa tiket yang tersedia : " + jumlahTiketTersedia);
    }

    // utama untuk menjalankan program
    public static void main(String[] args) {
      SistemPenjualanTiket sistem = new SistemPenjualanTiket(); // Membuat objek sistem penjualan tiket
      Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input
      int pilihan; // Variabel untuk menyimpan pilihan menu

      // Loop untuk menampilkan menu
      do {
        // Menampilkan menu pilihan
        System.out.println("\n=== Menu ===");
        System.out.println("1. Masukkan Data Pertandingan");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Tampilkan Informasi Pertandingan");
        System.out.println("4. Tampilkan Sisa Tiket");
        System.out.println("5. Keluar");
        System.out.println("====================================");
        System.out.print("Pilih menu : ");
        pilihan = scanner.nextInt(); // Membaca pilihan menu dari pengguna

        // switch case untuk menentukan berdasarkan pilihan dari pengguna
        switch (pilihan) {
          case 1:
            sistem.masukkanDataPertandingan(); // Memasukkan data pertandingan
            break;
          case 2:
            sistem.beliTiket(); // Proses pembelian tiket
            break;
          case 3:
            sistem.tampilkanInfoPertandingan(); // Menampilkan informasi pertandingan
            break;
          case 4:
            sistem.tampilkanSisaTiket(); // Menampilkan sisa tiket yang sesudah dibeli atau sebelum dibeli
            break;
          case 5:
            System.out.println("Terima kasih telah membeli tiket disini, selamat menikmati pertandingan!!");
            break;
          default:
            System.out.println("Pilihan tidak valid. Silakan coba lagi."); // Memungkinkan pengguna jika memilih lewat
                                                                           // dari 5
        }
      } while (pilihan != 5); // meneruskan pilihan hingga pengguna memilih untuk keluar

      scanner.close(); // Menutup scanner setelah selesai
    }
  }
}
