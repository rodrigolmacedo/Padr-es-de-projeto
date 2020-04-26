import Impl.FlyWithWings;
import Impl.Quack;

public class MallardDuck extends Duck{
	MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void Display() {
		System.out.println("I'm a real Mallard duck");
	}

}
