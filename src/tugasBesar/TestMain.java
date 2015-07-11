package tugasBesar;

/**
 * Created by Toshiba C640 on 09-Jul-15.
 */
public class TestMain {
    public static void main(String[] args) {

        Liga arab = new Liga("arab");

        Divisi alif = new Divisi("alif");
        Divisi bak = new Divisi("bak");

        Klub yasin = new Klub("yasin",alif,arab);
        Klub anas = new Klub("anas",alif,arab);

        Klub anasB = new Klub("anas B",bak,arab);
        Klub aliklas = new Klub("aliklas",bak,arab);


        arab.setDaftarDivisi(alif);
        arab.setDaftarDivisi(bak);


        alif.setDaftarKlub(yasin);
        alif.setDaftarKlub(anas);

        bak.setDaftarKlub(anasB);
        bak.setDaftarKlub(aliklas);



        System.out.println("a");
        System.out.println(arab.getDaftarDivisi());
        System.out.println("");


        System.out.println("b");
        arab.setDaftarKlub(yasin);
        System.out.println(arab.getDaftarKlub());
        System.out.println("");


        System.out.println("c");
        System.out.println(alif.getDaftarKlub());
        System.out.println(bak.getDaftarKlub());
        System.out.println("");



        System.out.println("d");

        System.out.println(anasB.getNamaKlub());
        System.out.println(anasB.getDivisi());
        System.out.println("");


        System.out.println("e");

        System.out.println(yasin.getNamaKlub());
        System.out.println(yasin.getLiga());
        System.out.println("");

    }
}
