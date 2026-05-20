package latihan_pbo.latihan_exception;

public class tes {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(angka[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("terjadi error: " + 0);
        } finally {
            System.out.println("Program selesai");
        }
    }
}
