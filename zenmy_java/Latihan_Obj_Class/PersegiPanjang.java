package Latihan_Obj_Class;

public class PersegiPanjang {
  double panjang, lebar;

  double hitungLuas(){
    return panjang * lebar;
  }

  double hitungKelling(){
    return 2 * (panjang + lebar);
  }
}
