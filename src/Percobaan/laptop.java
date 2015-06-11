package Percobaan;

/**
 * Created by Toshiba C640 on 11-Jun-15.
 */
public class laptop {

    private String warnaLaptop;
    private String merkLaptop;
    private int ukuranLaptop;
    private String jenisBaterai;
    private charger isiDaya;

    public laptop(String warnaLaptop, String merkLaptop, int ukuranLaptop, String jenisBaterai, charger isiDaya) {
        this.warnaLaptop = warnaLaptop;
        this.merkLaptop = merkLaptop;
        this.ukuranLaptop = ukuranLaptop;
        this.jenisBaterai = jenisBaterai;
        this.isiDaya = isiDaya;
    }

    public String getWarnaLaptop() {
        return warnaLaptop;
    }

    public void setWarnaLaptop(String warnaLaptop) {
        this.warnaLaptop = warnaLaptop;
    }

    public String getMerkLaptop() {
        return merkLaptop;
    }

    public void setMerkLaptop(String merkLaptop) {
        this.merkLaptop = merkLaptop;
    }

    public int getUkuranLaptop() {
        return ukuranLaptop;
    }

    public void setUkuranLaptop(int ukuranLaptop) {
        this.ukuranLaptop = ukuranLaptop;
    }

    public String getJenisBaterai() {
        return jenisBaterai;
    }

    public void setJenisBaterai(String jenisBaterai) {
        this.jenisBaterai = jenisBaterai;
    }

    public charger getIsiDaya() {
        return isiDaya;
    }

    public void setIsiDaya(charger isiDaya) {
        this.isiDaya = isiDaya;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "warnaLaptop='" + warnaLaptop + '\'' +
                ", merkLaptop='" + merkLaptop + '\'' +
                ", ukuranLaptop=" + ukuranLaptop +
                ", jenisBaterai='" + jenisBaterai + '\'' +
                ", isiDaya=" + isiDaya +
                '}';
    }

    public laptop() {


    }
}
