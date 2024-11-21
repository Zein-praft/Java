package latihan_2;

class AlatTulis {
  private String nama;
  private int stok;
  private int hargaSatuan;
  private int hargaTotal;

  // Setter untuk nama, stok, harga,satuan, dan harga total
  public void SetNama(String nama) {
    this.nama = nama;
  }

  public void setStok(int stok) {
    this.stok = stok;
    updateHargaTotal();
  }

  public void sethargaSatuan(int hargaSatuan) {
    this.hargaSatuan = hargaSatuan;
    updateHargaTotal();
  }

  private void updateHargaTotal() {
    this.hargaTotal = this.stok * this.hargaSatuan;
  }

  // Getter untuk nama, stok harga satuan, dan harga total
  public String getNama() {
    return this.nama;
  }

  public int getStok() {
    return this.stok;
  }

  public int gethargaSatuan() {
    return this.hargaSatuan;
  }

  public int gethargaTotal() {
    return this.hargaTotal;
  }

  // Method untuk mendapatkan total harga jika semua alat tulis terjual
  public int getTotalHarga(int jumlahAlat) {
    return this.hargaTotal * jumlahAlat;
  }
}

public class latihan_2 {
  public static void main(String[] args)

  {
    // Membuat objek untuk setiap jenis alat tulis
    AlatTulis bolpoint = new AlatTulis();
    bolpoint.SetNama("Bolpoint");
    bolpoint.setStok(10);
    bolpoint.sethargaSatuan(2000);

    AlatTulis pensil = new AlatTulis();
    pensil.SetNama("Pensil");
    pensil.setStok(10);
    pensil.sethargaSatuan(1000);

    AlatTulis penghapus = new AlatTulis();
    penghapus.SetNama("Penghapus");
    penghapus.setStok(10);
    penghapus.sethargaSatuan(500);

    // Menampilkan informasi masing-masing alat
    System.out.println("Nama : " + bolpoint.getNama());
    System.out.println("Stok : " + bolpoint.getStok());
    System.out.println("Harga Satuan : " + bolpoint.gethargaSatuan());
    System.out.println("Harga Total : " + bolpoint.gethargaTotal());

    System.out.println("Nama : " + pensil.getNama());
    System.out.println("Stok : " + pensil.getStok());
    System.out.println("Harga Satuan : " + pensil.gethargaSatuan());
    System.out.println("Harga Total " + pensil.gethargaTotal());

    System.out.println("Nama : " + penghapus.getNama());
    System.out.println("Stok : " + penghapus.getStok());
    System.out.println("Harga Satuan : " + penghapus.gethargaSatuan());
    System.out.println("Harga Total " + penghapus.gethargaTotal());

    @SuppressWarnings("unused")
    int jumlahAlat = 3;
    int totalHarga = bolpoint.getTotalHarga(10) + pensil.getTotalHarga(10) + penghapus.getTotalHarga(10);
    System.out.println("Total harga semua alat tulis jika terjual semuanya : Rp " + totalHarga);

  }
}