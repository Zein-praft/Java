package Prosedur_Fungsi;

import java.util.Scanner;

public class BiayaParkir {

  public static int hitungBiaya(String jenisKendaraan, int lamaParkir, boolean isMember) {
    int biaya = 0;
    if (jenisKendaraan.equals("mobil")) {
      biaya = 5000;
      lamaParkir--;
      biaya += lamaParkir * 3000;
    } else if (jenisKendaraan.equals("motor")) {
      biaya = 3000;
      lamaParkir--;
      biaya += lamaParkir * 2000;
    }
    if (isMember) {
      biaya = (int) (biaya * 0.9);
    }
    return biaya;
  }

  public static void tampilanUtama(String jenisKendaraan, int lamaParkir, int biaya, boolean isMember) {
    System.out.println("Rincian parkir");
    System.out.println("============================");
    System.out.println("Jenis kendaraan : " + jenisKendaraan);
    System.out.println("Lama parkir   : " + lamaParkir + " jam");
    System.out.println("Total biaya   : Rp." + biaya);
    if (isMember) {
      System.out.println("Anda mendapat diskon 10%");
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jenis kendaraan : ");
    String jenisKendaraan = input.nextLine();

    System.out.print("Lama parkir                :");
    int lamaParkir = input.nextInt();

    System.out.print("Apakah member (ya/tidak) ? ");
    String userMember = input.nextLine();
    boolean isMember = userMember.equals("ya");

    int BiayaParkir = hitungBiaya(jenisKendaraan, lamaParkir, isMember);

    input.close();
  }
}
