package praktikum;

/**
 * Created by User on 11/06/2015.
 */
public class TestClass {
    public static void main(String[] args) {

        Penulis kiranaAyu = new Penulis("Kirana Ayu","Malang",'p');
        Penulis radityaDika = new Penulis("Raditya Dika","Surabaya",'l');
        Penulis dyahKartika = new Penulis("Dyah Kartika","Jakarta",'p');

        Buku diUjungJalan = new Buku("Di Ujung Jalan",45.0,"Gramedia",kiranaAyu);
        System.out.println(diUjungJalan.toString());

    }
}
