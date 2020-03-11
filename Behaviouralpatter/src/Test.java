public class Test {

   public static void main(String[] args) {
      Strategy s1 = new Strategy(new Dm(), "hello");
      Strategy s2 = new Strategy(new Am(), "hi");
      Strategy s3 = new Strategy(new Dm(), "sc");
      s1.stance();
      s2.stance();
      s3.stance();
   }
}