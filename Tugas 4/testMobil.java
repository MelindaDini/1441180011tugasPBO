class testMobil {
	public static void main(String[] args) {
		mobil mell = new mobil();

		System.out.println("merk		=" +mell.getmerk());
		System.out.println("platNomor	=" +mell.getplatNomor());
		System.out.println("warna 		=" +mell.getwarna());
		System.out.println("mesin		=" +mell.getmesin() +"cc");
		System.out.println("kecepatan	=" +mell.getkecepatan() +"km");
		mell.maju();
		System.out.println(" ");	

	 mobil kirana = new mobil("HondaJazz","N4145NA");

		System.out.println("merk		=" +kirana.getmerk());
		System.out.println("platNomor	=" +kirana.getplatNomor());
		kirana.mundur();
		System.out.println(" ");


	mobil sinta = new mobil("Lamborgini","N1375FX","Hitam");

		System.out.println("merk		=" +sinta.getmerk());
		System.out.println("platNomor 	=" +sinta.getplatNomor());
		System.out.println("warna  		=" +sinta.getwarna());
		sinta.berhenti();
		System.out.println(" ");


	mobil melinda = new mobil("MiniChoper","M371NDA","Merah",1500);

		System.out.println("merk		=" +melinda.getmerk());
		System.out.println("platNomor 	=" +melinda.getplatNomor());
		System.out.println("warna  		=" +melinda.getwarna());
		System.out.println("mesin   	=" +melinda.getmesin() +"cc");
		melinda.belok();
		System.out.println(" ");

	mobil andin = new mobil("Mazda","N6232DG","Hijau",1999,100);

		System.out.println("merk		=" +andin.getmerk());
		System.out.println("platNomor 	=" +andin.getplatNomor());
		System.out.println("warna  		=" +andin.getwarna());
		System.out.println("mesin   	=" +andin.getmesin() +"cc");
		System.out.println("kecepatan	=" +andin.getkecepatan() +"km"); 
		andin.ngebut();
		System.out.println(" ");
	

	
}
}