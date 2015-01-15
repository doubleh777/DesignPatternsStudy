package strategypattern;

public class RedheadDuck extends Duck implements FlyBehavior, QuackBehavior {

	public RedheadDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display() {
		System.out.println("빨간 머리 오리");
	}
	public void fly(){
		flyBehavior.fly();
	}
	public void quack() {
		quackBehavior.quack();
	}
}
