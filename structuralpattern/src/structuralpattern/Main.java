package structuralpattern;

public class Main {
	public static void main(String[] args)
	{
		Animal Dog=new Sa(3,500,"meat",new Dog());
		Animal Cat=new Sa(2,200,"carrot",new Cat());
  Dog.feed();
  Cat.feed();
	}
}
