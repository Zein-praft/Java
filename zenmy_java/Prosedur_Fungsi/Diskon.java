package Prosedur_Fungsi;

public class Diskon {
  public static double hDiskon(double harga, double diskon) {
    double hargaJadi = harga - Potongan(harga, diskon);
    return hargaJadi;
  }

  public static double Potongan(double harga, double diskon) {
    double potonganHarga = harga * (diskon / 100);
    return potonganHarga;
  }

  public static void TampilkanDiskon(double harga, double diskon) {
    System.out.println("Harga Barang  : Rp." + harga);
    System.out.println("Diskon        : " + diskon + "%");
    System.out.println("Potongan      : Rp." + Potongan(harga, diskon));
    System.out.println("==============================");
  }

  public static void main(String[] args) {
    double harga, diskon;

    harga = 150000;
    diskon = 10;
  }
}
