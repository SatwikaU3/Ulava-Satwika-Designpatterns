package structuralpattern;

public class Otherbranch implements fileaccess {
	private String doc;
	 private Original o;
	  
	Otherbranch(String doc)
	{
		this.doc=doc;
		
	}
	public void share()
	{
		
		
		if(o==null)
		{
			o =new Original(doc);
		}
		o.share();
	}

}