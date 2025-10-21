class Sample
{
	public void display(ElectronicDevice ed)
	{
		ed.on();
	}
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.display((ElectronicDevice) new Fan());
		s.display((ElectronicDevice) new Laptop());
		s.display((ElectronicDevice) new Mobile());

	}
}

interface ElectronicDevice
{
	void on();
}
class Fan implements ElectronicDevice
{
	public void on()
	{
		System.out.println("Fan on...");
	}
}
class Laptop implements ElectronicDevice
{
	public void on()
	{
		System.out.println("Laptop on...");
	}
}
class Mobile implements ElectronicDevice
{
	public void on()
	{
		System.out.println("Mobile on...");
	}
}
