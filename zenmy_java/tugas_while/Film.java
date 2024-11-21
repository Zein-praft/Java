package tugas_while;

import java.util.Scanner;

public class Film {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean lanjut = true;
    final int DISCOUNT_THRESHOLD = 3;
    final double DISCOUNT_RATE = 0.1; // 10% discount

    // Film dan harga
    String[] films = { "Film A", "Film B", "Film C" };
    double[] prices = { 50000, 60000, 70000 }; // Harga per tiket

    while (lanjut) {
      System.out.println("Selamat datang di Bioskop Marta!");
      System.out.println("Pilih film:");
      for (int i = 0; i < films.length; i++) {
        System.out.println((i + 1) + ". " + films[i] + " - Rp " + prices[i]);
      }
      System.out.println("============================");

      System.out.print("Masukkan pilihan film (1-" + films.length + "): ");
      int filmChoice = scanner.nextInt() - 1;

      if (filmChoice < 0 || filmChoice >= films.length) {
        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        continue;
      }
      System.out.println("==============================");
      System.out.print("Masukkan jumlah tiket: ");
      int ticketCount = scanner.nextInt();

      if (ticketCount <= 0) {
        System.out.println("Jumlah tiket harus lebih dari 0.");
        continue;
      }
      System.out.println("==============================");

      double pricePerTicket = prices[filmChoice];
      double totalPrice = pricePerTicket * ticketCount;

      // Terapkan diskon jika diperlukan
      if (ticketCount > DISCOUNT_THRESHOLD) {
        double discount = totalPrice * DISCOUNT_RATE;
        totalPrice -= discount;
        System.out.println("Diskon 10% diterapkan karna anda membeli lebih dari 3 tiket : Rp " + discount);
      }

      System.out.println("Total harga tiket : Rp " + totalPrice);

      System.out.print("Masukkan jumlah uang yang dibayarkan : Rp ");
      double amountPaid = scanner.nextDouble();
      System.out.println("==============================");

      if (amountPaid < totalPrice) {
        System.out.println("Uang yang dibayarkan kurang. Pembelian dibatalkan.");
      } else {
        double change = amountPaid - totalPrice;
        System.out.println("Pembayaran berhasil. Kembalian: Rp " + change);
      }

      System.out.print("Apakah Anda ingin membeli tiket lagi ? (y/n): ");
      String response = scanner.next();
      System.out.println("==============================");
      if (response.equalsIgnoreCase("n")) {
        lanjut = false;
        System.out.println("Terima kasih telah membeli tiket film di Bioskop Marta!");
        System.out.println("========================================================");
      }
    }

    scanner.close();
  }
}