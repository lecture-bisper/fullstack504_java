public class SwitchStringEx {

  public static void main(String[] args) {

    String position = "대리";

    switch (position) {
      case "부장":
        System.out.println("700만원");
        break;

      case "과장":
        System.out.println("500만원");
        break;

      default:
        System.out.println("300만원");
        break;
    }
  }
}












