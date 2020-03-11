
public class Strategy {
	private Strategybehavior behavior;
	   private String type;

	   public Strategy(Strategybehavior behavior, String type) {
	      super();
	      this.behavior = behavior;
	      this.type = type;
	   }

	   public void stance() {
	      System.out.println(type);
	      behavior.stance();
	   }
}
