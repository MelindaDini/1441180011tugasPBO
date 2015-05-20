class testTabungan {
	public static void main(String[] args) {
		tabungan mell = new tabungan();

		System.out.println("simpanan 	=" +mell.setsimpanan());
		System.out.println("pemilikRek 	=" +mell.setpemilikRek());
		System.out.println("noRek 		=" +mell.getnoRekening());
		System.out.println("bunga 		=" +mell.getbunga());
		mell.menabung();
		System.out.println(" ");




tabungan melinda = new tabungan("MelindaDini","BNI");

		System.out.println("simpanan 	=" +melinda.setsimpanan());
		System.out.println("pemilikRek 	=" +melinda.setpemilikRek());
		melinda.mengambil();
		System.out.println(" ");



tabungan dyah = new tabungan("dyah","Danamon",144118053);
		
		System.out.println("simpanan 	=" +dyah.setsimpanan());
		System.out.println("pemilikRek 	=" +dyah.setpemilikRek());
		System.out.println("noRek 		=" +dyah.getnoRekening());
		dyah.transfer();
		System.out.println("");



tabungan tita = new tabungan("tita","Mandiri",1441180124);

		System.out.println("simpanan 	=" +tita.setsimpanan());
		System.out.println("pemilikRek 	=" +tita.setpemilikRek());
		System.out.println("noRek 		=" +tita.getnoRekening());
		System.out.println("bunga 		=" +tita.getbunga());
		tita.menerimaTransfer();
		System.out.println(" ");
	





	}

}