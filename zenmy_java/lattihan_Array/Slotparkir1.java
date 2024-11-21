package lattihan_Array;

import java.util.Scanner;

public class Slotparkir1 {
  public static void main(String[] args) {
    // Inisialisasi slot parkir (false berarti kosong, true berarti terisi)
    boolean[] slotParkir = new boolean[10];

    // Membuat slot parkir untuk simulasi awal (sebagian terisi dan sebagian kosong)
    slotParkir[1] = true;
    slotParkir[4] = true;
    slotParkir[8] = true;

    Scanner scanner = new Scanner(System.in);
    char jawaban;

    do {
      // Menampilkan status slot parkir saat ini
      System.out.println("Slot parkir:");
      for (boolean slot : slotParkir) {
        System.out.print("[" + slot + "] ");
      }
      System.out.println();

      // Cek apakah ada slot kosong
      int slotKosong = -1;
      for (int i = 0; i < slotParkir.length; i++) {
        if (!slotParkir[i]) { // Jika slot kosong ditemukan
          slotKosong = i;
          break;
        }
      }

      // Jika ada slot kosong
      if (slotKosong != -1) {
        System.out.print("Kendaraan ingin parkir (y/n): ");
        jawaban = scanner.next().charAt(0);

        if (jawaban == 'y' || jawaban == 'Y') {
          slotParkir[slotKosong] = true; // Kendaraan parkir di slot kosong
          System.out.println("Kendaraan parkir di slot " + slotKosong);
        } else {
          System.out.println("Kendaraan tidak parkir.");
        }
      } else {
        // Jika tidak ada slot parkir yang kosong
        System.out.println("Slot parkir penuh. Silakan coba lagi.");
        break;
      }
      // Ingin melanjutkan atau tidak
      System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
      jawaban = scanner.next().charAt(0);
    } while (jawaban == 'y' || jawaban == 'Y');

    System.out.println("Terima kasih telah menggunakan sistem parkir.");
    scanner.close();
  }
}