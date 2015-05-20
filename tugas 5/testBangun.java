public class testBangun
{
	public static void main(String[] args)
	{
		Lingkaran bundar = new Lingkaran();

		bundar.rad = 14;

		bundar.cetakKeLayar();

		System.out.println("luas: " + bundar.hitungLuas());

		System.out.println("keliling: " + bundar.hitungKeliling());

		bundar.ubahProperty(21);

		System.out.println("Property Baru =");

		bundar.cetakKeLayar();

		System.out.println("luas baru: " + bundar.hitungLuas());

		System.out.println("keliling baru: " + bundar.hitungKeliling());

		Segitiga bentuk = new Segitiga();

		bentuk.alas = 3;

		bentuk.tinggi = 5;

		bentuk.sisi = 7;

		bentuk.cetakKeLayar();

		System.out.println("luas: " + bentuk.hitungLuas());

		System.out.println("keliling: " + bentuk.hitungKeliling());

		bentuk.ubahProperty(4,6,8);

		System.out.println("Property Baru =");

		bundar.cetakKeLayar();

		System.out.println("luas baru: " + bentuk.hitungLuas());

		System.out.println("keliling baru: " + bentuk.hitungKeliling());
}
}


