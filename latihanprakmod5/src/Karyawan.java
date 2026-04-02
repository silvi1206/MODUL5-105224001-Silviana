public class Karyawan {
    private String nama;
    private String idkaryawan;
    private Double gajipokok;
    private String departemen;

    public Karyawan(String nama, String idkaryawan) {
        this.nama = nama;
        this.idkaryawan = idkaryawan;  
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdkaryawan() {
        return idkaryawan;
    }

    public void setIdkaryawan(String idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    public Double getGajipokok() {
        return gajipokok;
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("Gaji tidak boleh negatif!");
        } else {
            this.gajipokok = gajiPokok;
        }
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

   
    
}




