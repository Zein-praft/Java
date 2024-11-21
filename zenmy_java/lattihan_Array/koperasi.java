package lattihan_Array;

import java.util.Scanner;

public class koperasi {

  static String[] namaBarang = { "buku", "Pensil", "Snack" };
  static int[] hargaBarang = { 10000, 3000, 5000 };
  static int[] stokBarang = { 20, 15, 30 };

  public static void tampilkanBarang() {
    System.out.println("Daftar barang fi koperasi : ");
    for (int i = 0; i < namaBarang.length; i++) {
      System.out
          .println((i + 1) + " . " + namaBarang[i] + "\tHarga\t: Rp. " + hargaBarang[i] + "\tStok : " + stokBarang[i]);
    }
  }

  public static void beliBarang() {
    Scanner beli = new Scanner(System.in);

    System.out.println("Masukkan nomor barang yang ingin di beli : ");
    int pilih = beli.nextInt() - 1;
    System.out.println("Masukkan nomor barang yang ingin di beli : ");
    int jumlah = beli.nextInt();

    if (pilih > 0 && pilih < namaBarang.length) {
      if (stokBarang[pilih] >= jumlah) {
        int totalHarga = hargaBarang[pilih] * jumlah;
        stokBarang[pilih] -= jumlah;
        System.out.println(
            "Pembelian berhasil, anda membeli " + jumlah + " = " + namaBarang[pilih] + " Total : Rp. " + totalHarga);
      } else {
        System.out.println("Stok barang habis");
      }
    } else {
      System.out.println("Barang tidak tersedia");
    }
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int pilih;

      do {
        System.err.println("\nKoperasi Sekolah");
        System.err.println("=========================");
        System.err.println("1. Tampilkan barang");
        System.err.println("2. Beli barang");
        System.err.println("3. keluar");
        System.err.println("=========================");
        System.err.println("Pilih menu\t:");
        pilih = input.nextInt();

        switch (pilih) {
          case 1:
            tampilkanBarang();
            break;
          case 2:
            beliBarang();
            break;
          case 3:
            System.out.println("Keluar dari program");
            break;
          default:
            System.out.println("pilihan tidak valid");
            
        }
      }

    tampilkanBarang();
  }
}