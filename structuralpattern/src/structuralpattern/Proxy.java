package structuralpattern;
import java.util.Scanner;
public class Proxy {

	public static void main(String args[])
	{Scanner ama=new Scanner(System.in);
	System.out.println("Enter the doc to be shared");
	String s=ama.next();
		Access s1=new Otherbranch(s);
		s1.share();
		
	}
}
