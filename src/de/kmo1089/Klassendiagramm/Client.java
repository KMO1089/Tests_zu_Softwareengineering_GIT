package de.kmo1089.Klassendiagramm;

public class Client {

	public static void main(String[] args) {
		RealMitglied m1 = new RealMitglied("Hans", "Sachbearbeiter");
		RealMitglied m2 = new RealMitglied("Klara", "Kundenbetreuerin");
		
		Proxy p1 = new Proxy(m1, m2);
		p1.giveRating(10);
		
	}

}
