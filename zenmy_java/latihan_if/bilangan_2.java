package latihan_if;

import java.util.Scanner;

public class bilangan_2 {

  public static void main(String[] args) {
    // Membuat objek Scanner untuk mengambil input dari pengguna
    Scanner scanner = new Scanner(System.in);

    // Meminta pengguna untuk memasukkan sebuah bilangan
    System.out.print("Masukkan sebuah bilangan: ");
    int bilangan = scanner.nextInt();

    // Menentukan apakah bilangan tersebut positif, negatif, atau nol
    if (bilangan > 0) {
      System.out.println("Bilangan tersebut adalah positif.");
    } else if (bilangan < 0) {
      System.out.println("Bilangan tersebut adalah negatif.");
    } else {
      System.out.println("Bilangan tersebut adalah nol.");
    }

    // Menutup Scanner
    scanner.close();
  }
}
