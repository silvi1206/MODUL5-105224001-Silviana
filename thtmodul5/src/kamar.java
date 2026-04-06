class kamar {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean tersedia;

    // constructor cepat
    public kamar(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.tersedia = true;
    }

    // constructor lengkap
    public void setKamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam);
        this.tersedia = true;
    }

    // getter
    public String getNomorKamar() {
    return nomorKamar; 
    }
    
    public String getTipeKamar() {
    return tipeKamar;
    }

    public int getKapasitasMaksimal() { 
    return kapasitasMaksimal; 
    }

    public double getHargaPerMalam() {
    return hargaPerMalam; 
    }

    public boolean isTersedia() { 
    return tersedia; 
    }

   
    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equals("Reguler") || tipeKamar.equals("Premium") || tipeKamar.equals("Suite")) {
            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("Tipe tidak valid, diubah ke Reguler");
            this.tipeKamar = "Reguler";
        }
    }

    
    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println("Harga terlalu rendah, diubah ke 50000");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    public void pesanKamar() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Kamar berhasil dipesan");
        } else {
            System.out.println("Kamar sudah terisi");
        }
    }

   
    public void pesanKamar(int jumlahTamu) {
        if (!tersedia) {
            System.out.println("Kamar sudah terisi");
        } else if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("Jumlah tamu melebihi kapasitas");
        } else {
            tersedia = false;
            System.out.println("Pemesanan berhasil");
        }
    }

    public void batalPesan() {
        tersedia = true;
        System.out.println("Pesanan dibatalkan");
    }

    
    public double hitungTotalBayar(int jumlahMalam) {
        return jumlahMalam * hargaPerMalam;
    }

  
    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = jumlahMalam * hargaPerMalam;

        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            System.out.println("Diskon 20% diterapkan");
            return total * 0.8;
        } else {
            System.out.println("Voucher tidak berlaku");
            return total;
        }
    }

    
}