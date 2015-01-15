package strategypattern;

public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		System.out.println("Mallard Duck은 어떻게 우나요?");
		mallard.performQuack();
		System.out.println("Mallard Duck은 어떻게 나나요?");
		mallard.performFly();

		Duck rubberDuck = new RubberDuck();
		System.out.println("나는 방법을 set하기 전");
		rubberDuck.performFly();
		rubberDuck.setFlyBehavior(new FlyRocketPowered());
		System.out.println("나는 방법을 set한 후");
		rubberDuck.performFly();
	}
}
