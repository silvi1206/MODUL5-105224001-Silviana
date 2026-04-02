public class barang {
    // Semua data private
    private String idbarang;
    private String nama;
    private int stok;
    private double hargasatuan;

    
    protected String kategori;

    
    public barang(String idBarang, String namaBarang) {
        this.idbarang = idBarang;
        this.nama= namaBarang;
        this.stok = 0;
        this.hargasatuan = 0;
    }

    
    public String getIdBarang() { return idbarang; }
    public void setIdBarang(String idBarang) { this.idbarang = idBarang; }

    public String getNamaBarang() { return nama; }
    public void setNamaBarang(String namaBarang) { this.nama = namaBarang; }

    public int getStok() { return stok; }
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif");
        }
    }

    public double getHargaSatuan() { return hargasatuan; }
    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan > 0) {
            this.hargasatuan = hargaSatuan;
        } else {
            System.out.println("Harga harus lebih dari 0");
        }
    }

    
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok = jumlah + stok;
        } else {
            System.out.println("Jumlah harus lebih dari 0!");
        }
    }


    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok = stok - jumlah;
        } else {
            System.out.println("Pengurangan tidak valid!");
        }
    }
}
