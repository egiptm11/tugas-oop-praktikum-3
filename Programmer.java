public class Programmer extends Pegawai{
    private double bonus;

    //setter

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //getter

    public double getBonus() {
        return bonus;
    }

    public void cetakInfo(){
        System.out.println("Data Programmer");
        System.out.println("Nama         : " +getNama());
        System.out.println("Gaji Pokok   : " + getGajiPokok());
        System.out.println("Tunjangan    : " + getBonus());
    }
}
