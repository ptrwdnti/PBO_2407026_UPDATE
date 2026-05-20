package tugas_polymorphism;

public class Main {
    public static void main(String[] args) {
        // 1. Sesuai ketentuan: gunakan satu tipe variabel array yang sama (Polimorfisme)
        BangunDatar[] daftarBangun = new BangunDatar[4];

        // 2. Isi array dengan objek-objek yang berbeda
        daftarBangun[0] = new BangunDatar(2.0, 3.0);
        daftarBangun[1] = new Persegi(5.0);
        daftarBangun[2] = new PersegiPanjang(7.0, 5.0);
        daftarBangun[3] = new Segitiga(5.0, 6.0);

        // 3. Lakukan perulangan untuk mengeksekusi method tampilkan()
        for (BangunDatar bd : daftarBangun) {
            bd.tampilkan();
            System.out.println("--------------------"); 
        }
    }
}