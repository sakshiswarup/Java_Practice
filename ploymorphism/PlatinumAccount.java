package ploymorphism;

public class PlatinumAccount extends GoldAccount {
@Override
public void rateOfInterest() {
	System.out.println("6%");
}
public static void main(String[] args) {
	GoldAccount g = new GoldAccount();
	g.onlineBanking();
	g.rateOfInterest();
	
	PlatinumAccount p = new PlatinumAccount();
	p.onlineBanking();
	p.rateOfInterest();
	
}
}

public class PlatinumAccount extends GoldAccount{
	public void onlineBanking() {
		System.out.println("yes");
	}
	@Override
	public int rateOfInterest() {//error because of not same method as previous.
		System.out.println("6%");
	}
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount();
		g.onlineBanking();
		g.rateOfInterest();
		
		PlatinumAccount p = new PlatinumAccount();
		p.onlineBanking();
		p.rateOfInterest()
	}
}
