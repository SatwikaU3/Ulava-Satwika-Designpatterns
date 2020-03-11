package structuralpattern;

public abstract class Animal {
    protected Feed feeding;
    protected Animal(Feed feeding)
    {
    	this.feeding=feeding;
    }
    public abstract void feed();
}
