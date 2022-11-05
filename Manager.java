public class Manager extends Pegawai {
    private double tunjangan;

    //setter
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    //getter
    public double getTunjangan() {
        return tunjangan;
    }

    public void cetakInfo(){
        System.out.println("Data Manager");
        System.out.println("Nama         : " +getNama());
        System.out.println("Gaji Pokok   : " + getGajiPokok());
        System.out.println("Tunjangan    : " + getTunjangan());
        System.out.println( );

    }

}