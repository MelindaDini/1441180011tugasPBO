package praktikum;

/**
 * Created by User on 11/06/2015.
 */
public class Buku {

    private String namaBuku;
    private Double hargaBuku;
    private String penerbitBuku;
    private Penulis pembuat;

    public Buku(String namaBuku, Double hargaBuku, String penerbitBuku, Penulis pembuat) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
        this.penerbitBuku = penerbitBuku;
        this.pembuat = pembuat;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public Double getHargaBuku() {
        return hargaBuku;
    }

    public void setHargaBuku(Double hargaBuku) {
        this.hargaBuku = hargaBuku;
    }

    public String getPenerbitBuku() {
        return penerbitBuku;
    }

    public void setPenerbitBuku(String penerbitBuku) {
        this.penerbitBuku = penerbitBuku;
    }

    public Penulis getPembuat() {
        return pembuat;
    }

    public void setPembuat(Penulis pembuat) {
        this.pembuat = pembuat;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "namaBuku='" + namaBuku + '\'' +
                ", hargaBuku=" + hargaBuku +
                ", penerbitBuku='" + penerbitBuku + '\'' +
                ", pembuat=" + pembuat +
                '}';
    }

    public Buku() {




    }
}
