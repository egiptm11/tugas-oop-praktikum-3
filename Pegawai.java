public class Pegawai {
    private String nama;
    private double gajiPokok;

    //Setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    //Getter
    public String getNama(){
        return this.nama;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void cetakInfo(){
        System.out.println("Nama          : " + this.nama);
        System.out.println("Gaji Pokok    : " + this.gajiPokok);
    }
}