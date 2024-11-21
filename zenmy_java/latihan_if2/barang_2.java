package latihan_if2;

import java.util.Scanner;

class main {
    private String nama;
    private double harga;
    private double diskon;

    // Constructor
    public main(String nama, double harga, double diskon) {
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Getter untuk diskon
    public double getDiskon() {
        return diskon;
    }

    // Metode untuk menghitung harga setelah diskon
    public double hargaSetelahDiskon() {
        return harga - (harga * diskon / 100);
    }

    @Override
    public String toString() {
        return "Nama Barang: " + nama + ", Harga: " + harga + ", Diskon: " + diskon + "%, Harga Setelah Diskon: "
                + hargaSetelahDiskon();
    }
}

public class barang_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan harga barang: ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan diskon barang (dalam persen): ");
        double diskon = scanner.nextDouble();

        // Membuat objek Barang
        main barang = new main(nama, harga, diskon);

        // Menampilkan informasi barang
        System.out.println(barang);

        // Meminta jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = scanner.nextInt();

        // Menghitung total pembayaran
        double hargaSetelahDiskon = barang.hargaSetelahDiskon();
        double totalPembayaran = 0;

        // Struktur if-else bertingkat untuk perhitungan total pembayaran
        if (jumlah <= 0) {
            System.out.println("Jumlah barang harus lebih dari 0.");
        } else if (jumlah == 1) {
            totalPembayaran = hargaSetelahDiskon;
        } else if (jumlah > 1 && jumlah <= 10) {
            totalPembayaran = hargaSetelahDiskon * jumlah;
        } else {
            System.out.println("Jumlah barang terlalu banyak. Harap masukkan jumlah yang wajar.");
        }

        // Menampilkan total pembayaran
        if (jumlah > 0 && jumlah <= 10) {
            System.out.println("Total Pembayaran: " + totalPembayaran);
        }

        scanner.close();
    }
}
