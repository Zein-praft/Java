package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Jajanan {
    private String nama;
    private int harga;
    private boolean statusSehat;

    public Jajanan(String nama, int harga, boolean statusSehat) {
        this.nama = nama;
        this.harga = harga;
        this.statusSehat = statusSehat;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public boolean isStatusSehat() {
        return statusSehat;
    }

    @Override
    public String toString() {
        return "Nama : " + nama + ", Harga : " + harga + ", Sehat : " + (statusSehat ? "Ya" : "Tidak");
    }
}

public class kantinSekolah {
    private ArrayList<Jajanan> jajananList;

    public kantinSekolah() {
        jajananList = new ArrayList<>();
    }

    public void tambahJajanan(String nama, int harga, boolean statusSehat) {
        Jajanan jajanan = new Jajanan(nama, harga, statusSehat);
        jajananList.add(jajanan);
        System.out.println("Jajanan berhasil ditambahkan.");
    }

    public void tampilkanSemuaJajanan() {
        System.out.println("Daftar Semua Jajanan:");
        for (Jajanan jajanan : jajananList) {
            System.out.println(jajanan);
        }
    }

    public void tampilkanJajananSehat() {
        System.out.println("Daftar Jajanan Sehat:");
        for (Jajanan jajanan : jajananList) {
            if (jajanan.isStatusSehat()) {
                System.out.println(jajanan);
            }
        }
    }

    public void tampilkanJajananTidakSehat() {
        System.out.println("Daftar Jajanan Tidak Sehat:");
        for (Jajanan jajanan : jajananList) {
            if (!jajanan.isStatusSehat()) {
                System.out.println(jajanan);
            }
        }
    }

    public void hapusJajanan(String nama) {
        for (int i = 0; i < jajananList.size(); i++) {
            if (jajananList.get(i).getNama().equalsIgnoreCase(nama)) {
                jajananList.remove(i);
                System.out.println("Jajanan '" + nama + "' berhasil dihapus.");
                return;
            }
        }
        System.out.println("Jajanan '" + nama + "' tidak ditemukan.");
    }

    public static void main(String[] args) {
        kantinSekolah kantin = new kantinSekolah();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println(" ___________________________________");
            System.out.println("|1. beli jajanan                    |");
            System.out.println("|2. Tampilkan Semua Jajanan         |");
            System.out.println("|3. Tampilkan Jajanan Sehat         |");
            System.out.println("|4. Tampilkan Jajanan Tidak Sehat   |");
            System.out.println("|5. Hapus Jajanan                   |");
            System.out.println("|0. Keluar                          |");
            System.out.println("|___________________________________|");
            System.out.print("Pilih menu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama jajanan : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga jajanan : ");
                    int harga = scanner.nextInt();
                    System.out.print("Apakah jajanan sehat? (true/false) : ");
                    boolean statusSehat = scanner.nextBoolean();
                    kantin.tambahJajanan(nama, harga, statusSehat);
                    break;
                case 2:
                    kantin.tampilkanSemuaJajanan();
                    break;
                case 3:
                    kantin.tampilkanJajananSehat();
                    break;
                case 4:
                    kantin.tampilkanJajananTidakSehat();
                    break;
                case 5:
                    System.out.print("Masukkan nama jajanan yang ingin dihapus : ");
                    String namaHapus = scanner.nextLine();
                    kantin.hapusJajanan(namaHapus);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}