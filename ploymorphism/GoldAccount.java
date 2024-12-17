package ploymorphism;

public class GoldAccount {
public void onlineBanking() {
	System.out.println("yes");
}
public void rateOfInterest() {
	System.out.println("nill");
}
}

//for error because not same method inherited in PlatinumAccount
public class GoldAccount {
public void onlineBanking() {
	System.out.println("yes");
}
public void rateOfInterest() {
	System.out.println("Nill");
}
}
