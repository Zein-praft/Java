import java.util.Scanner;

class input_data_pbo {
    private String nama;

    // konstruktor untuk inisialisasi nama
    public input_data_pbo(String nama) {
        this.nama = nama;
    }

    // getter umtuk mendapatkan nama
    public String getNama() {
        return nama;
    }

    // setter mengubah nama
    public void SetNama(String nama) {
        this.nama = nama;
    }

    // tampilan output program
    public void show() {
        System.out.println("selamat pagi " + nama);
    }

    // program utama
    public static void main(String[] args) {
        try (Scanner masukkan = new Scanner(System.in)) {
            // input data
            System.out.println("Masukkan nama anda : ");
            String nama = masukkan.nextLine();

            // membuat objek user
            Scanner user = new Scanner(System.in);

        }
    }
}
