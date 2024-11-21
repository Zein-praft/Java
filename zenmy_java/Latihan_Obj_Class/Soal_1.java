package Latihan_Obj_Class;

class Mobil {
  String merk, model;
  int tahun;

  void tampilkanInfo() {
    System.out.println("Merk mobil  : " + merk);
    System.out.println("Model mobil : " + model);
    System.out.println("Tahun mobil : " + tahun);
  }
}

public class Soal_1 {
  public static void main(String[] args) {
    Mobil data = new Mobil();

    data.merk = "Toyota Yaris";
    data.model = "City car";
    data.tahun = 2018;
    data.tampilkanInfo();
  }
}

// public class Soal_1 {
// private String merk;
// private String model;
// private int tahun;

// public Soal_1(String merk, String model, int tahun) {
// this.merk = merk;
// this.model = model;
// this.tahun = tahun;
// }

// public void tampilkanInfo() {
// System.out.println("Merk Mobil : " + merk);
// System.out.println("Model Mobil : " + model);
// System.out.println("Tahun Mobil : " + tahun);
// }

// public static void main(String[] args) {
// Soal_1 mobil = new Soal_1("Toyota", "Avanza", 2015);
// mobil.tampilkanInfo();
// }
// }