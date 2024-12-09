package quiz2;

import java.util.Scanner;

public class PhoneEx {

  public static void main(String[] args) {
    //    문제1 ) 책 184 페이지 1번 문제
    //    문제2 ) 책 184 페이지 2번 문제
    //    문제3 ) 책 186 페이지 5번 문제
    //    문제4 ) 책 187 페이지 6번 문제

//    사용자 키보드 입력을 위해서 선언
    Scanner sc = new Scanner(System.in);

    System.out.print("이름과 전화번호 입력 >> ");
    String name = sc.nextLine();
    String tel = sc.nextLine();

    Phone phone1 = new Phone(name, tel);

    System.out.print("이름과 전화번호 입력 >> ");
    name = sc.nextLine();
    tel = sc.nextLine();

    Phone phone2 = new Phone(name, tel);

    System.out.println(phone1.getName() + "의 번호 " + phone1.getTel());
    System.out.println(phone2.getName() + "의 번호 " + phone2.getTel());


    System.out.println("\n\n----- 배열로 만들경우 -----\n");

    Phone arrPhone[] = new Phone[2];

    for (int i = 0; i < arrPhone.length; i++) {
      System.out.print("이름과 전화번호 입력 >> ");
      String inputName = sc.nextLine();
      String inputTel = sc.nextLine();

      arrPhone[i] = new Phone(inputName, inputTel);
    }

    for (int i = 0; i < arrPhone.length; i++) {
      System.out.println(arrPhone[i].getName() + "의 번호 " + arrPhone[i].getTel());
    }


  }
}












