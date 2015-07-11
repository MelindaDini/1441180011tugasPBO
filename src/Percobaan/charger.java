package Percobaan;

/**
 * Created by Toshiba C640 on 11-Jun-15.
 */
public class charger {

    private String panjangCharger;
    private String teganganCharger;
    private int ukuranAdaptor;
    private String jenisSteker;

    public charger(String panjangCharger, String teganganCharger, int ukuranAdaptor, String jenisSteker) {
        this.panjangCharger = panjangCharger;
        this.teganganCharger = teganganCharger;
        this.ukuranAdaptor = ukuranAdaptor;
        this.jenisSteker = jenisSteker;
    }

    public String getPanjangCharger() {
        return panjangCharger;
    }

    public void setPanjangCharger(String panjangCharger) {
        this.panjangCharger = panjangCharger;
    }

    public String getTeganganCharger() {
        return teganganCharger;
    }

    public void setTeganganCharger(String teganganCharger) {
        this.teganganCharger = teganganCharger;
    }

    public int getUkuranAdaptor() {
        return ukuranAdaptor;
    }

    public void setUkuranAdaptor(int ukuranAdaptor) {
        this.ukuranAdaptor = ukuranAdaptor;
    }

    public String getJenisSteker() {
        return jenisSteker;
    }

    public void setJenisSteker(String jenisSteker) {
        this.jenisSteker = jenisSteker;
    }

    @Override
    public String toString() {
        return "charger{" +
                "panjangCharger='" + panjangCharger + '\'' +
                ", teganganCharger='" + teganganCharger + '\'' +
                ", ukuranAdaptor=" + ukuranAdaptor +
                ", jenisSteker='" + jenisSteker + '\'' +
                '}';
    }

    public charger() {



    }
}
