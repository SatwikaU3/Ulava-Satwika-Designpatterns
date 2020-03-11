package structuralpattern;

public class Sa extends Animal{
private int time,amount;
private String foodtype;
public Sa(int time,int amount,String foodtype,Feed feeding)
{
	super(feeding);
	this.time=time;
	this.amount=amount;
	this.foodtype=foodtype;
}
	public void feed() {
		feeding.feed(time, amount, foodtype);
	}
}

