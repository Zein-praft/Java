package latihan_if2;

import java.util.Scanner;

public class Barang {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah cat yang dibeli (liter) : ");
        int jumlahLiter = input.nextInt();
        System.out.print("Masukkan merk cat (A,B, dan C) : ");
        char merkcat = input.next().charAt(0);

        double hargaPerLiter = 0;
        if (merkcat == 'A') {
            hargaPerLiter = 50000;
        } else if (merkcat == 'B') {
            hargaPerLiter = 45000;
        } else if (merkcat == 'C') {
            hargaPerLiter = 40000;
        } else {
            System.out.println("merk cat tidak ditemukan");
        }

        double hargaTotal = jumlahLiter * hargaPerLiter;
        double diskon = 0;

        if (jumlahLiter > 10) {
            diskon += 10;
        }
        if (merkcat == 'A' && jumlahLiter > 5) {
            diskon += 5;
        } else if (merkcat == 'B' && jumlahLiter > 8) {
            diskon += 3;
        }

        double hargaSetelahDiskon = hargaTotal - (hargaTotal * diskon / 100);
        System.out.println("Total harga sebelum diskon: Rp. " + hargaTotal);
        System.out.println("Besar diskon\t\t: " + diskon + "%");
        System.out.println("Total harga setelah diskon: Rp. " + hargaSetelahDiskon);
    }
}