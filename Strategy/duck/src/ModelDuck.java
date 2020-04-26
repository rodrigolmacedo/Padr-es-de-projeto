import Impl.FlyNoWay;
import Impl.Quack;

public class ModelDuck extends Duck{

	ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void Display() {
		System.out.println("I'm a model duck");
		
	}
	
}
