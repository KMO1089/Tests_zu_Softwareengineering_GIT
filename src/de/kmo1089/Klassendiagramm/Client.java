package de.kmo1089.Klassendiagramm;

public class Client {

	public static void main(String[] args) {
		RealMitglied mitglied1 = new RealMitglied("Hans", "Kundenbetreuer");
		RealMitglied mitglied2 = new RealMitglied("Klara", "Sekretärin");
		
		Proxy p1 = new Proxy(mitglied1, mitglied2);
		Proxy p2 = new Proxy(mitglied2, mitglied1);
		p1.giveRating(10);
		p1.giveRating(9);
		p1.giveRating(0);
		p1.giveRating(10);
		p1.giveRating(9);
		
		p2.giveRating(20);
		p2.giveRating(0);
	}

}
