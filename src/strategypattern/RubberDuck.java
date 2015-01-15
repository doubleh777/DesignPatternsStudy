package strategypattern;

public class RubberDuck extends Duck implements FlyBehavior, QuackBehavior{
	
	public RubberDuck(){
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("고무오리 모양");
	}
	public void fly(){
		flyBehavior.fly();
	}
	public void quack() {
		quackBehavior.quack();
	}

}
