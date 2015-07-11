package praktikum;

/**
 * Created by Toshiba C640 on 10-Jun-15.
 */
public class Penulis {

    private String namaPenulis;
    private String alamatPenulis;
    private char jenisKelaminPenulis;
    private String statusPenulis;
    private int umurPenulis;

    public Penulis(String namaPenulis, String alamatPenulis, char jenisKelaminPenulis) {
        this.namaPenulis = namaPenulis;
        this.alamatPenulis = alamatPenulis;
        this.jenisKelaminPenulis = jenisKelaminPenulis;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getAlamatPenulis() {
        return alamatPenulis;
    }

    public void setAlamatPenulis(String alamatPenulis) {
        this.alamatPenulis = alamatPenulis;
    }

    public char getJenisKelaminPenulis() {
        return jenisKelaminPenulis;
    }

    public void setJenisKelaminPenulis(char jenisKelaminPenulis) {
        this.jenisKelaminPenulis = jenisKelaminPenulis;
    }

    public String getStatusPenulis() {
        return statusPenulis;
    }

    public void setStatusPenulis(String statusPenulis) {
        this.statusPenulis = statusPenulis;
    }

    public int getUmurPenulis() {
        return umurPenulis;
    }

    public void setUmurPenulis(int umurPenulis) {
        this.umurPenulis = umurPenulis;
    }

    @Override
    public String toString() {
        return "Penulis{" +
                "namaPenulis='" + namaPenulis + '\'' +
                ", alamatPenulis='" + alamatPenulis + '\'' +
                ", jenisKelaminPenulis=" + jenisKelaminPenulis +
                ", statusPenulis='" + statusPenulis + '\'' +
                ", umurPenulis=" + umurPenulis +
                '}';
    }

    public Penulis() {




    }
}
