
// Tire 클래스와 내용이 동일함
public class Tire3 {

  public int maxRotation;
  public int accRotation;
  public String location;

  public Tire3(String location, int maxRotation) {
    this.location = location;
    this.maxRotation = maxRotation;
  }

  public boolean roll() {
    ++accRotation;

    if (accRotation < maxRotation) {
      System.out.println(location + " Tire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("***** " + location + " Tire 펑크 *****");
      return false;
    }
  }
}












