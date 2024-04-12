package de.kmo1089.Klassendiagramm;

public class RealMitglied implements Mitglied {

	private String name;
	private String service;
	private double rating;
	private int countRatings;

	public RealMitglied(String name, String service) {
		this.name = name;
		this.service = service;
	}

	public RealMitglied() {

	}

	public String getName() {
		return name;
	}

	public String getService() {
		return service;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public void setService(String service) {
		this.service = service;
	}

	@Override
	public double giveRating(int rating) {
		countRatings ++;
		this.rating += rating;
		double durchschnittsbewertung = this.rating / countRatings;
		return durchschnittsbewertung;

	}

}