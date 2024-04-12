package de.kmo1089.Klassendiagramm;

public class RealMitglied implements Mitglied{
	private String name;
	private String service;
	private int rating;
	private int countratings;
	
	public RealMitglied() {
		
	}
	public RealMitglied(String name, String service) {
		this.name = name;
		this.service = service;
	}
	
	public String getName() {
		return name;
	}
	public String getService() {
		return service;
	}
	@Override
	public void setService(String service) {
		this.service = service;
		
	}
	@Override
	public double giveRating(int rating) {
		return 0;
	}
	
	
}
