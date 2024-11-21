package belajar;

// Bilangan Ganjil

public class latihan_2_for {
  public static void main(String[] args) {
    int a = 0;
    for (int i = 1; i <= 100; i += 2) {
      System.out.println(i);
      a += 1;
    }
    System.out.println("jumlah angka bilangan ganjil 1 sd 100 adalah : " + a + " angka");
  }
}