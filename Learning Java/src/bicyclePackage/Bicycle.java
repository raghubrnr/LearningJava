package bicyclePackage;

public class Bicycle {

	private int gear;
	private int speed;
	private int cedace;
	
	void increasespeed(int value)
	{
		speed = speed + value;
	}
	
	void decreasespeed(int value)
	{
		speed = speed - value;
	}
	
	void changecedace(int value)
	{
		cedace = value;
	}
	
	void changegear(int value)
	{
		setGear(value);
	}
	
	void printstates()
	{
		System.out.println("Speed= "+speed+"\nCedace= "+cedace+"\nGear = "+getGear() );
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getCedace() {
		return cedace;
	}

	public void setCedace(int cedace) {
		this.cedace = cedace;
	}
}
