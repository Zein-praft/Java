package ObjClass_1;

import ObjClass_2.Mapel;

class Nilai {
  // int angka = 10;
  String nama = "Muhammad Fahmi Zein",
      ttl = "Balikpapan, 12 januari 1945 ",
      alamat = "Martadinata",
      sekolah = "SMK Airlangga";
}

public class Data_1 {
  public static void main(String[] args) {
    Nilai hasil = new Nilai();
    // System.out.println(hasil.angka);
    Jurusan Objprodi = new Jurusan();
    Mapel objMapel = new Mapel();

    System.out.println(hasil.nama);
    System.out.println(hasil.ttl);
    System.out.println(hasil.alamat);
    System.out.println(hasil.sekolah);
    System.out.println("Program Studi : " + Objprodi.prodi);
    System.out.println("Program Studi : " + Objprodi.walas);
    System.out.println("Program op : " + objMapel.mp);
    System.out.println("Program mp : " + objMapel.op);
  }
}
