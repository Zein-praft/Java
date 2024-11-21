package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Peralatan {
  private String nama;
  private String merk;
  private int jumlah;
  private String kondisi;

  public Peralatan(String nama, String merk, int jumlah, String kondisi) {
    this.nama = nama;
    this.merk = merk;
    this.jumlah = jumlah;
    this.kondisi = kondisi;
  }

  public String getNama() {
    return nama;
  }

  public String getMerk() {
    return merk;
  }

  public int getJumlah() {
    return jumlah;
  }

  public String getKondisi() {
    return kondisi;
  }

  public void setJumlah(int jumlah) {
    this.jumlah = jumlah;
  }

  public void setKondisi(String kondisi) {
    this.kondisi = kondisi;
  }

  @Override
  public String toString() {
    return "Nama: " + nama + ", Merk: " + merk + ", Jumlah: " + jumlah + ", Kondisi: " + kondisi;
  }
}

public class InventarisSmkAirlangga {
  private static ArrayList<Peralatan> inventaris = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int pilihan;

    do {
      System.out.println("\nMenu Peralatan inventaris :");
      System.out.println("--------------------------------");
      System.out.println("|1. Tambah Peralatan           |");
      System.out.println("|2. Tampilkan Daftar Peralatan |");
      System.out.println("|3. Ubah Informasi Peralatan   |");
      System.out.println("|4. Hapus Peralatan            |");
      System.out.println("|5. Keluar                     |");
      System.out.println("--------------------------------");
      System.out.print("Pilih menu (1-5): ");
      pilihan = scanner.nextInt();
      scanner.nextLine();
      switch (pilihan) {
        case 1:
          tambahPeralatan();
          break;
        case 2:
          tampilkanPeralatan();
          break;
        case 3:
          ubahPeralatan();
          break;
        case 4:
          hapusPeralatan();
          break;
        case 5:
          System.out.println("Keluar dari program.");
          break;
        default:
          System.out.println("Pilihan tidak valid. Silakan coba lagi.");
      }
    } while (pilihan != 5);
  }

  private static void tambahPeralatan() {
    System.out.print("Masukkan Nama Peralatan : ");
    String nama = scanner.nextLine();
    System.out.print("Masukkan Merk Peralatan : ");
    String merk = scanner.nextLine();
    System.out.print("Masukkan Jumlah Unit : ");
    int jumlah = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Masukkan Kondisi Peralatan : ");
    String kondisi = scanner.nextLine();

    Peralatan peralatan = new Peralatan(nama, merk, jumlah, kondisi);
    inventaris.add(peralatan);
    System.out.println("Peralatan berhasil ditambahkan.");
  }

  private static void tampilkanPeralatan() {
    if (inventaris.isEmpty()) {
      System.out.println("Tidak ada data inventaris.");
    } else {
      System.out.println("Daftar Peralatan : ");
      for (Peralatan peralatan : inventaris) {
        System.out.println(peralatan);
      }
    }
  }

  private static void ubahPeralatan() {
    System.out.print("Masukkan Nama Peralatan yang ingin diubah : ");
    String nama = scanner.nextLine();
    for (Peralatan peralatan : inventaris) {
      if (peralatan.getNama().equalsIgnoreCase(nama)) {
        System.out.print("Masukkan Jumlah Unit Baru : ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Kondisi Baru : ");
        String kondisi = scanner.nextLine();

        peralatan.setJumlah(jumlah);
        peralatan.setKondisi(kondisi);
        System.out.println("Informasi peralatan berhasil diubah.");
        return;
      }
    }
    System.out.println("Peralatan tidak ditemukan.");
  }

  private static void hapusPeralatan() {
    System.out.print("Masukkan Nama Peralatan yang ingin dihapus : ");
    String nama = scanner.nextLine();
    for (int i = 0; i < inventaris.size(); i++) {
      if (inventaris.get(i).getNama().equalsIgnoreCase(nama)) {
        inventaris.remove(i);
        System.out.println("Peralatan berhasil dihapus.");
        return;
      }
    }
    System.out.println("Peralatan tidak ditemukan.");
  }
}