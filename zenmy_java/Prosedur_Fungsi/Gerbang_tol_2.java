package Prosedur_Fungsi;

import java.util.Scanner;

public class Gerbang_tol_2 {
  static int saldo;

  public static void inisialisasiSaldo(int saldoAwal) {
    saldo = saldoAwal;
  }

  public static void tapIn(String gerbangAwal, String gerbangAkhir) {
    int tarif = hitungTarif(gerbangAwal, gerbangAkhir);

    if (saldo >= tarif) {
      System.out.println("Tap-In berhasil!, Tarif : Rp. " + tarif);
      System.out.println("Sisa saldo anda : Rp. " + saldo);
    } else {
      System.out.println("saldo anda tidak cukup, silahkan isi ulang saldo");
      topUp();
      tapIn(gerbangAwal, gerbangAkhir);
    }
  }

  public static int hitungTarif(String gerbangAwal, String gerbangAkhir) {
    int tarif = 0;

    if (gerbangAwal.equalsIgnoreCase("Manggar")) {
      if (gerbangAkhir.equalsIgnoreCase("Palaran")) {
        tarif = 28000;
      } else if (gerbangAkhir.equalsIgnoreCase("mahkota")) {
        tarif = 35000;
      }
    } else if (gerbangAwal.equalsIgnoreCase("Kilo13")) {
      if (gerbangAkhir.equalsIgnoreCase("Palaran")) {
        tarif = 20000;
      } else if (gerbangAkhir.equalsIgnoreCase("Mahkota")) {
        tarif = 28000;
      }
    }
    return tarif;
  }

  public static void topUp() {
    Scanner isi = new Scanner(System.in);

    System.out.println("Silahkan isi Top-up kartu tol anda.");
    System.out.println("==========================================");
    System.out.print("Isi nominal saldo Top-up : Rp. ");
    int isiUlang = isi.nextInt();
    saldo += isiUlang;
    System.out.println("==========================================");
    System.out.println("Saldo anda sekarang : Rp. " + saldo);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inputkan saldo awal anda : Rp. ");
    int saldoAwal = input.nextInt();
    inisialisasiSaldo(saldoAwal);

    System.out.print("Pilih gerbang tol awal (Manggar/Kilo 13) : ");
    String gerbangAwal = input.next();
    System.out.print("Pilih gerbang tol akhir (Palaran/Mahkota) : ");
    String gerbangAkhir = input.next();
  }
}