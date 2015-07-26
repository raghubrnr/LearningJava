package bicyclePackage;

public class BicycleDemo {

	public static void main(String[] args) {
		Bicycle Atlas = new Bicycle();
		Bicycle Hero = new Bicycle();
		
		Atlas.setCedace(1);
		Atlas.setGear(2);
		Atlas.increasespeed(20);
		Atlas.decreasespeed(30);
		Atlas.printstates();
		
		Hero.setGear(5);
		Hero.setCedace(20);
		Hero.increasespeed(50);
		Hero.decreasespeed(-10);
		Hero.printstates();
		
	}

}
