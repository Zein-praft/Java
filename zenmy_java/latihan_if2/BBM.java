package latihan_if2;

import java.util.Scanner;

public class BBM {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double HARGA_PERTAMAX = 10.000;
    double HARGA_PERTALITE = 7.000;
    double hargaPerLiter = 0;
    double diskon = 0;

    System.out.println("Pilih jenis BBM:");
    System.out.println("1. Pertamax");
    System.out.println("2. Pertalite");

    System.out.print("Masukkan pilihan jenis BBM : ");
    int pilihan = scanner.nextInt();

    switch (pilihan) {
      case 1:
        hargaPerLiter = HARGA_PERTAMAX;
        System.out.println("Anda memilih Pertamax.");
        break;
      case 2:
        hargaPerLiter = HARGA_PERTALITE;
        System.out.println("Anda memilih Pertalite.");
        break;
      default:
        System.out.println("Maaf pilihan anda tidak sesuai.");
        scanner.close();
        return;
    }
    System.out.println("========================");

    System.out.print("Masukkan jumlah liter yang ingin dibeli: ");
    double jumlahLiter = scanner.nextDouble();

    double totalHarga = hargaPerLiter * jumlahLiter;

    // Menghitung diskon jika jumlah liter lebih dari 25
    if (jumlahLiter > 25) {
      diskon = 0.05; // Diskon 5%
    }

    // Menghitung total harga setelah diskon
    double totalHargaSetelahDiskon = totalHarga * (1 - diskon);

    // Menampilkan hasil
    System.out.printf("-Total harga sebelum diskon: Rp %.2f%n", totalHarga);
    System.out.printf("-Diskon: %.0f%%%n", diskon * 100);
    System.out.printf("-Total harga setelah diskon: Rp %.2f%n", totalHargaSetelahDiskon);
    System.out.println("============================================");

    scanner.close();

    // Mencari refrensi AI
  }
}