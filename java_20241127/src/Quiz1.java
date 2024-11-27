public class Quiz1 {
  
  public static void main(String[] args) {
    
//    문제 1) 중복 for 문을 이용하여 구구단을 2 단부터 9단까지 모두 출력하는 프로그램을 작성하세요
    System.out.println("----- 문제 1 -----");

    for (int i = 2; i < 10; i++) {
      System.out.println("--- " + i + "단 ---");
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + j * j);
      }
    }
    
//    문제 2) 중복 while 문을 이용하여 구구단을 2단부터 9단까지 모두 출력하는 프로그램을 작성하세요

    System.out.println("\n----- 문제 2 -----");

    int dan = 2;

    while (dan < 10) {
      System.out.println("--- " + dan + "단 ---");

      int su = 1;
      while (su < 10) {
        System.out.println(dan + " * " + su + " = " + dan * su);
        su++;
      }

      dan++;
    }
  }
}












