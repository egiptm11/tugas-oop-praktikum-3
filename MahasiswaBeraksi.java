public class MahasiswaBeraksi {
    public static void main(String[] args){
        //membuat objek
        mahasiswa anton = new mahasiswa();
        Manager Egi = new Manager();
        Programmer Hana = new Programmer();


        /* memanggil atribut dan memberi nilai */
        anton.setNim("10102020");
        anton.nama = "Anton Santoso";
        anton.jenisKelamin = "Laki-laki";
        anton.umur = 28;
        anton.alamat = "Bekasi Kota";
        anton.setJurusan("Informatika");
        System.out.println("Nim           : " + anton.getNim());
        System.out.println("Jurusan       : " + anton.getJurusan());

        //memanggil pegawai Manager
        Egi.setNama("Egi Pratama");
        Egi.setGajiPokok(3000000);
        Egi.setTunjangan(500000);

        //memanggil pegawai Programmer
        Hana.setNama("Hana");
        Hana.setGajiPokok(4000000);
        Hana.setBonus(1000000);


        anton.cetakInfo();
        Egi.cetakInfo();
        Hana.cetakInfo();
    }
}