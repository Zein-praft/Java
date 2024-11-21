package Prosedur_Fungsi;

public class Lat {
  // Prosedur
  public static void segitiga() {
    int alas = 5;
    int tinggi = 10;
    float luas = (alas * tinggi) / 2;
    System.out.println("Alas = " + alas);
    System.out.println("Tinggi = " + tinggi);
    System.out.println("Luas Segitiga = " + luas + " cm");
    System.out.println("===========================");
  }

  // Fungsi
  public static String lingkaran() {
    double phi = 3.14;
    int jari = 5;
    double luas = phi * jari * jari;
    System.out.println("Jari-jari lingkaran = " + jari + " cm");
    return "Luas lingkaran = " + luas + " cm";
  }

  public static void main(String[] args) {
    segitiga();
    System.out.println(lingkaran());
  }
}