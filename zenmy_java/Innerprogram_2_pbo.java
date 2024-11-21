class main {
  // atribut
  private int alas;
  private int tinggi;

  // konstruktuor
  public void segitiga(int alas, int tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  // method untuk menghitung fungsi
  public float hitungluas() {
    return (alas * tinggi) / 2;
  }

  // method untuk mendapatkan alas
  public int getAlas() {
    return alas;
  }

  // method untuk mendapatkan alas
  public int getTinggi() {
    return tinggi;
  }
}

// clas utama
public class Innerprogram_2_pbo {
  public static void main(String[] args) {
    // membuat objek segitiga
    segitiga segitiga = new segitiga(10, 4);

    // menghitung luas segitiga
    float luas = segitiga.HitungLuas();

    // output
    System.out.println("alas segitiga = " + segitiga.getAlas() + " cm");
    System.out.println("tinggi segitiga = " + segitiga.getTinggi() + " cm");
    System.out.println("luas segitiga adalah = " + luas + " cm");
  }
}
