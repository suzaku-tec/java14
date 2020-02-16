public class JEP305 {

  public static void main(String[] args) {
    Object obj = "hello saga!";
    
    if (obj instanceof String s) {
      System.out.println(s.length());
    } else {
      System.out.println("not String");
    }
  }
}
