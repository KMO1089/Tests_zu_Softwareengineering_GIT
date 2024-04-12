package de.kmo1089.Klassendiagramm;

public class Proxy extends RealMitglied implements Mitglied  {

	private RealMitglied mitglied;
	private RealMitglied user;

	public Proxy(RealMitglied mitglied, RealMitglied user) {
		this.mitglied = mitglied;
		this.user = user;
	}
	
	

	public boolean isOwner() {
		if (mitglied.equals(user)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setService(String service) {
		
	}

	@Override
	public double giveRating(int rating) {
		if (isOwner() == true) {
			System.out.println("Bewertung wurde um 1.0 verringert");
			return -1.0;
		} else {
			mitglied.giveRating(rating);
			System.out.println(mitglied.getName()+" arbeitet als "+ mitglied.getService()+" seine/ihre Bewertung liegt bei: "+ mitglied.giveRating(rating));
			return mitglied.getRating();
		}
	}

}
