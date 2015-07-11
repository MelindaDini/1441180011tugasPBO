package atm;

/**
 * Created by Toshiba C640 on 17-Jun-15.
 */
public class TestUnit {
    public static void main(String[] args) {
        rekening bbb = new rekening(10000000.00);
        nasabah ddd = new nasabah("machmudatul","chasanah",bbb);

        System.out.println(ddd);
        ddd.setAccount(bbb);

        System.out.println(ddd.toString());

        //ambil saldo
        bbb.ambil(3500000.00);
        //tampilkan saldo
        System.out.println("ambil Rp. 3500000.00");
        System.out.println("tampilkan saldo sekarang = " + bbb.getSaldo());

        //setor 3000000.00
        bbb.setor(3000000.00);
        //tampilkan saldo
        System.out.println("setor Rp. 3000000.00");
        System.out.println("tampilkan saldo sekarang = " + bbb.getSaldo());
    }
}
