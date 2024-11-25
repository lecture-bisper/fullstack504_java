public class CompareOpEx {

  public static void main(String[] args) {

    int num1 = 10;
    int num2 = 10;

    boolean result1 = (num1 == num2);
    boolean result2 = (num1 != num2);
    boolean result3 = (num1 < num2);
    boolean result4 = (num1 > num2);
    boolean result5 = (num1 <= num2);
    boolean result6 = (num1 >= num2);

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
    System.out.println("result3 = " + result3);
    System.out.println("result4 = " + result4);
    System.out.println("result5 = " + result5);
    System.out.println("result6 = " + result6);

    char char1 = 'A';
    char char2 = 'B';

    boolean result7 = (char1 < char2);
    System.out.println("result7 = " + result7);

    int v2 = 1;
    double v3 = 1.0;
    System.out.println(v2 == v3);

    double v4 = 0.1;
    float v5 = 0.1F;
    System.out.println(v4 == v5);
    System.out.println((float) v4 == v5);
    System.out.println((int)(v4 * 10) == (int)(v5 * 10));
  }
}












