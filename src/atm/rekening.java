package atm;

/**
 * Created by Toshiba C640 on 18-Jun-15.
 */
public class rekening {
    private double saldo;
    private double hasil;

    public rekening() {
    }

    public rekening(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ambil(double ambil){
        this.saldo = saldo - ambil;
    }

    public void setor (double setor){
        this.saldo = saldo + setor;
    }

    @Override
    public String toString() {
        return "rekening{" +
                "saldo=" + saldo +
                '}';
    }
}
