public class App {
    public static void main(String[] args) {

        // objek dari constructor lengkap
        kamar kamar1 = new kamar("101", "Reguler", 2);
         kamar1.setHargaPerMalam(300000);
        
        // objek kedua
        kamar kamar2 = new kamar("102", "Premium", 2);
        kamar2.setHargaPerMalam(500000);

        System.out.println("=== UJI SETTER ===");
        System.out.println("=== Informasi Kamar ===");
        System.out.println("Nomor Kamar   : " + kamar1.getNomorKamar());
        System.out.println("Tipe Kamar    : " + kamar1.getTipeKamar());
        System.out.println("Kapasitas     : " + kamar1.getKapasitasMaksimal());
        System.out.println("Harga/Malam   : " + kamar1.getHargaPerMalam());
        System.out.println("Status        : " + (kamar1.isTersedia() ? "Tersedia" : "Terisi"));
        System.out.println();

        System.out.println("=== UJI PEMESANAN ===");
        kamar2.pesanKamar(4); // over kapasitas
        kamar2.pesanKamar(2); // berhasil
        kamar2.pesanKamar();  // sudah terisi

        System.out.println("\n=== UJI PEMBAYARAN ===");
        double total1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total kamar1: " + total1);

        double total2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total kamar2: " + total2);

        System.out.println("\n=== STRUK AKHIR ===");
        System.out.println("Kamar 1: " + kamar1.getNomorKamar() + " - " + kamar1.getTipeKamar() + " - Total: " + total1);
        System.out.println("Kamar 2: " + kamar2.getNomorKamar() + " - " + kamar2.getTipeKamar() + " - Total: " + total2);
        
    }
}