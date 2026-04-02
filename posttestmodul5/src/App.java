public class App {
    public static void main(String[] args) throws Exception {
        barang barang1 = new barang ("001", "babi");
        barang1.setHargaSatuan(50.500);
        barang1.tambahStok(40);
        System.out.println("ID Barang: " + barang1.getIdBarang());
        System.out.println("Nama Barang: " + barang1.getNamaBarang());
        System.out.println("Harga Satuan: " + barang1.getHargaSatuan());
        System.out.println("Stok: " + barang1.getStok());

    }
}
