package Prosedur_Fungsi;

import java.util.Scanner;

public class Gerbang_tol {
  static int saldo;

  public static void inisialisasi(int saldoAwal) {
    saldo = saldoAwal;
  }

  public static void tapIn(String gerbang) {
    int tarif = 0;

    switch (gerbang) {
      case "1":
        tarif = 28000;
        break;
      case "2":
        tarif = 35000;
        break;
      case "3":
        tarif = 20000;
        break;
      case "4":
        tarif = 28000;
        break;
      default:
        System.out.println("Pilihan nomor gerbang tidak valid.");
        return;
    }

    if (saldo >= tarif) {
      saldo -= tarif;
      System.out.println("Tap-In ke gerbang nomor " + gerbang + " berhasil! Sisa saldo : Rp. " + saldo);
      System.out.println("==================================");
    } else {
      System.out.println("==================================");
      System.out.println("Saldo tidak cukup untuk tap-in ke gerbang nomor " + gerbang + ". Silahkan isi ulang saldo anda.");
      topUp();
    }
  }

  public static void topUp() {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah top-up saldo anda : Rp. ");
    int topUp = input.nextInt();
    saldo += topUp;
    System.out.println("Saldo anda telah bertambah menjadi : Rp. " + saldo);
    System.out.println("==================================");
  }

  public static void main(String[] args) {
    Scanner isi = new Scanner(System.in);
    System.out.print("Masukkan saldo awal anda : Rp. ");
    int saldoAwal = isi.nextInt();
    inisialisasi(saldoAwal);

    while (true) {
      System.out.println("==================================");
      System.out.println("1. Gerbang Palaran");
      System.out.println("2. Gerbang Mahkota");
      System.out.println("3. Gerbang kilo 13 palaran");
      System.out.println("4. Gerbang kilo 13 mahkota");
      System.out.println("5. Keluar ");
      System.out.println("==================================");
      System.out.print("Masukkan angka yang ingin di pilih : ");
      String pilihan = isi.next();

      if (pilihan.equalsIgnoreCase("5")) {
        break;
      }

      tapIn(pilihan);
    }

    System.out.println("- Perjalanan telah selesai. Sisa saldo anda : Rp. " + saldo + " Terima kasih");
  }
}
