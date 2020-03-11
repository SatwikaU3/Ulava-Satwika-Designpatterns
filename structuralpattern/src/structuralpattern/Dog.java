package structuralpattern;

public class Dog implements Feed {
public void feed(int time,int amount,String foodtype)
{
	System.out.println("feeding "+time+" "+amount+" "+foodtype);
}
}
