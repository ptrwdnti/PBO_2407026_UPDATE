package latihan_pbo.latihan4;

public class MenuItem {
    private Menu menu;
    private int jumlah;

    public MenuItem(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public int hitungTotal() {
        return menu.getHarga() * jumlah;
    }

    public void tampilkan() {
        System.out.println("Menu   : " + menu.getNama());
        System.out.println("Harga  : " + menu.getHarga());
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : " + hitungTotal());
        System.out.println("------------------------");
    }
}
