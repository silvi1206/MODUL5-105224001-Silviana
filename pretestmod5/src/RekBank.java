public class RekBank {
    private int rekening;
    private double saldo;
    
    public RekBank(int rekening, double saldo) {
        this.rekening = rekening;
        this.saldo = saldo;

    }
    
    public int lihatrekening(){
        return rekening;
    }

    public double lihatsaldo(){
        return saldo;
    }

    public void setor(double jumlah){
        saldo += jumlah;
        System.out.println("saldo anda "+ this.saldo);

        if (jumlah < 0){
            System.out.println("yang anda masukkan tidak valid");

        } else {
            System.out.println("saldo anda "+ this.saldo);
        }
    }

    
    public void setSaldo(double jumlah) {
        if (jumlah >= 0) {
            this.saldo += jumlah;
            System.out.println("Saldo berhasil ditambahkan.");
        } else {
            System.out.println("Gagal! Jumlah tidak boleh negatif.");
        }
    }
}
   


