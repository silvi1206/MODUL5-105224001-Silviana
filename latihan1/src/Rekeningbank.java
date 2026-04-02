//pretestjawabanyangbenar
public class Rekeningbank {
    private String nomorRekening;
    private int saldo;

    Rekeningbank(String nomorRekening, int saldo) {
        this.nomorRekening = nomorRekening;
        setsaldo(saldo);

    }

    public int getSaldo() {
        return saldo;
    }

    public void setsaldo(int saldoBaru){
        if (saldoBaru < 0) {
            System.out.println("salah");
        } else {
            this.saldo = saldoBaru;
            System.out.println("saldo diubah");
        }
    }
    

}
