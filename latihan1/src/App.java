public class App {
    public static void main(String[] args) throws Exception {
        mahasiswa mhs = new mahasiswa();

        mhs.nama = "cips";
        //mhs.nim = "123456789";
        System.out.println( mhs.nama);
        mhs.Setnim("123456789");
        System.out.println( mhs.getnim());
        mhs.setnamaO("ayah");
        System.out.println( mhs.getnamaO());

    }
    
}
