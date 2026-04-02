public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan karyawan1 = new Karyawan("Dimas", "12345");
        karyawan1.setGajiPokok(-700000); // Contoh gaji negatif
        karyawan1.setGajiPokok(55000000); // Contoh gaji positif
        karyawan1.setDepartemen("IT");

        System.out.println("Data Karyawan 1:");
        System.out.println("Nama: " + karyawan1.getNama());
        System.out.println("ID Karyawan: " + karyawan1.getIdkaryawan());
        System.out.println("Gaji Pokok: " + karyawan1.getGajipokok());
        System.out.println("Departemen: " + karyawan1.getDepartemen());


    }
    
}
