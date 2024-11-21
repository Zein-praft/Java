package latihan_if;

import java.util.Scanner;

public class bilangan_1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        // Menutup scanner setelah digunakan
        scanner.close();

        // Menentukan apakah bilangan tersebut ganjil, genap, atau nol
        if (bilangan == 0) {
            System.out.println("0 adalah bilangan netral.");
        } else if (bilangan % 2 == 0) {
            System.out.println("Bilangan tersebut adalah genap.");
        } else {
            System.out.println("Bilangan tersebut adalah ganjil.");
        }
    }
}