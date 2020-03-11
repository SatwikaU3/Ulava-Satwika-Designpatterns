package structuralpattern;

public class Cat implements Feed {
 public void feed(int time,int amount,String foodtype)
 {
	 System.out.println(time+" "+amount+" "+foodtype);
 }
}
