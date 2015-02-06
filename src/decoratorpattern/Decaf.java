package decoratorpattern;

public class Decaf extends Beverage{
	
	public Decaf() {
		description = "디마페인 커피";
	}
	public double cost() {
		return 1.05;
	}
}
