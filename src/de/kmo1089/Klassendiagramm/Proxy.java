package de.kmo1089.Klassendiagramm;

public class Proxy implements Mitglied {

	private RealMitglied mitglied;
	private RealMitglied user;

	public Proxy(RealMitglied mitglied, RealMitglied user) {
		this.mitglied = mitglied;
		this.user = user;
	}

	public boolean isOwner(RealMitglied mitglied, RealMitglied user) {
		if (mitglied.equals(user)) {
			return true;
		} else
			return false;
	}

	@Override
	public void setService(String service) {
		
	}

	@Override
	public double giveRating(int rating) {
		if(mitglied.equals(user)) {
			return -1.0;
		}else {
			giveRating(rating);
			rating += rating;
		}

	}

}
