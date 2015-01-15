package strategypattern;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior{
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display() {
		System.out.println("물오리 모양");
	}
	public void fly(){
		flyBehavior.fly();
	}
	public void quack() {
		quackBehavior.quack();
	}
}
