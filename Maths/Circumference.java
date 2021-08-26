package Maths;

public class Circumference {

  public static void main(String[] args) {
    assert Double.compare(CircumferenceSphere(5), 31.4159265358979) == 0;
  }

  private static double CircumferenceSphere(double radius) {
    return 2 * Math.PI * radius;
  }
}
