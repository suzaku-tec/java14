public class JEP368 {

  public static void main(String[] args) {
    var str = """
    You can write \\t
    two line string, \
    but this is single.
    """;

    System.out.println(str);
  }
}
