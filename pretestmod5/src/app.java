 class App {
    public static void main(String[] args) throws Exception {
        RekBank rek1 = new RekBank(12345, 100000);


        System.out.println("Rekening: " + rek1.lihatrekening());
        System.out.println("Saldo: " + rek1.lihatsaldo());

        

        rek1.setor(25000);
        rek1.setor(-5000); 

        rek1.setSaldo(5000); 
        rek1.setSaldo(-2000); 
    }
}
