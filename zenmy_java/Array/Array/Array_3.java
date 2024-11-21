package Array;

public class Array_3 {
  public static void main(String[] args) {
    int nilai[] = { 75, 87, 70, 90, 76 };

    // Hitung rata-rata nilai dari Array tersebut
    int jumNilai = 0;
    for (int nilaiSiswa : nilai) {
      jumNilai += nilaiSiswa;
    }
    // Menghitung rata-rata
    double rataRata = (double) jumNilai / nilai.length;
    System.out.println("Rata-rata nilai adalah : " + rataRata);
  }
}