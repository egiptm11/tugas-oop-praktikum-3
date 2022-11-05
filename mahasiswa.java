public class mahasiswa extends Manusia {
    private String nim;
    private String jurusan;

    //setter
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    //getter
    public String getNim() {
        return this.nim;
    }
    public String getJurusan() {
        return this.jurusan;
    }

}