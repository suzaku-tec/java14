
public class JEP359 {

  public static void main(String[] args) {
    Range record = new Range(3, 10);
    System.out.println(record);
    System.out.println(record.lo());
  }

}

record Range(int lo, int hi) {
  public Range {
    if (lo > hi)  /* referring here to the implicit constructor parameters */
      throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
  }
}
