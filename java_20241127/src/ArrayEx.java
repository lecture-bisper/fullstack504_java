import java.util.Scanner;

public class ArrayEx {

  public static void main(String[] args) {

//    배열 : 하나의 배열명으로 지정한 데이터 타입의 데이터를 여러개 저장할 수 있는 데이터 타입
//    배열은 index를 사용하여 원하는 위치의 데이터를 저장하거나 사용할 수 있음
//    배열도 참조 타입이기 때문에 null을 저장할 수 있음
//    배열은 한번 생성되면 배열의 크기를 변경할 수 없음

//    사용방법 (선언)
//    1. 데이터타입 배열명[] = {값1, 값2, ... };
//    배열을 선언과 동시에 데이터를 입력
//    데이터 입력 시 '{}' 를 사용하고, 각각의 데이터는 ',' 로 구분
//    선언과 동시에 입력하는 데이터의 수에 따라서 배열의 크기가 결정
//    배열 객체가 생성되어 있는 상태 (배열의 기능을 다 사용 가능)

//    2. 데이터타입 배열명[] = new 데이터타입[크기];
//    배열의 크기를 미리 지정하고 빈 배열을 생성함
//    배열 객체가 생성되어 있는 상태 (배열의 기능을 다 사용 가능)

//    3. 데이터타입 배열명[];
//    배열명[] = new 데이터타입[크기];
//    배열명[] = new 데이터타입[] {값1, 값2, ... };
//    배열 크기는 지정하지 않고 배열 이름만 미리 지정하여 선언
//    배열이 완전히 생성된 것이 아니기 때문에 배열의 기능 사용 불가
//    배열명 = {값1, 값2, ...}; 이러한 형태는 사용이 불가능(new 필수)

//    사용방법 (값 저장, 사용)
//    배열명[index] = 데이터;  // 배열의 지정한 index 위치에 데이터 저장
//    배열명[index]; // 배열의 지정한 index 위치에 있는 데이터 가져오기

    System.out.println("----- 1번 방식으로 배열 선언 -----");
    int scores[] = {80, 90, 70, 100, 80};
    System.out.println(scores);
    System.out.println(scores.length);
    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);
    System.out.println(scores[3]);
    System.out.println(scores[4]);

    System.out.println("\n----- 2번 방식으로 배열 선언 -----");
    int arr2[] = new int[5];
    System.out.println(arr2);
    System.out.println(arr2.length);
    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);
    System.out.println(arr2[3]);
    System.out.println(arr2[4]);

    arr2[0] = 10;
    arr2[1] = 20;
    arr2[2] = 30;
    arr2[3] = 40;
    arr2[4] = 50;

    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);
    System.out.println(arr2[3]);
    System.out.println(arr2[4]);

    System.out.println("\n----- 3번 방식으로 배열 선언 -----");

//    배열 변수를 선언만 함
    int arr3[];
//    초기화를 하지 않으면 사용 불가
//    System.out.println(arr3);
//    System.out.println(arr3.length);

    arr3 = new int[3];
    System.out.println(arr3);
    System.out.println(arr3.length);

    System.out.println(arr3[0]);
    System.out.println(arr3[1]);
    System.out.println(arr3[2]);

    arr3[0] = 10;
    arr3[1] = 20;
    arr3[2] = 30;

    System.out.println(arr3[0]);
    System.out.println(arr3[1]);
    System.out.println(arr3[2]);


    int arr4[];
//    배열명만 미리 선언하고, {} 타입으로 데이터를 나중에 입력하는 것은 불가능
//    arr4 = {10, 20, 30};@

    arr4 = new int[] {10, 20, 30};

    System.out.println(arr4);
    System.out.println(arr4.length);
    System.out.println(arr4[0]);
    System.out.println(arr4[1]);
    System.out.println(arr4[2]);

    System.out.println("\n----- 배열과 반복문 -----");

//    반복문을 사용하면 배열에 저장된 내용을 쉽게 모두 출력할 수 있음
    int arr5[] = new int[10];
//    배열의 특정 위치에 데이터 저장하기
    arr5[0] = 10;
    arr5[1] = 20;
    arr5[2] = 30;
    arr5[3] = 40;
    arr5[4] = 50;
    arr5[5] = 60;
    arr5[6] = 70;
    arr5[7] = 80;
    arr5[8] = 90;
    arr5[9] = 100;

//    배열에 저장된 내용을 직접 모두 출력
    System.out.println(arr5[0]);
    System.out.println(arr5[1]);
    System.out.println(arr5[2]);
    System.out.println(arr5[3]);
    System.out.println(arr5[4]);
    System.out.println(arr5[5]);
    System.out.println(arr5[6]);
    System.out.println(arr5[7]);
    System.out.println(arr5[8]);
    System.out.println(arr5[9]);

//    반복문을 사용하여 배열의 모든 내용을 순서대로 출력
    for (int i = 0; i < 10; i++) {
      System.out.println(arr5[i]);
    }

//    배열 사용 중 주의사항
//    배열의 최대 크기를 벗어나서 데이터를 저장하거나 가져올 수 없음
//    System.out.println(arr5[10]);

//    문제 5) int 타입의 배열을 10 크기로 지정하여 생성하고, 데이터를 1 ~ 10까지 각각의 index에 저장한 후 배열에 저장된 모든 데이터의 총합을 구하는 프로그램을 작성하세요

    System.out.println("\n ----- 문제5 -----\n");

//    배열 선언과 동시에 데이터 입력
    int quizArr5[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//    다른 방식
//    int quizArr5[] = new int[10];
//    quizArr5[0] = 1;

    int total = 0; // 총합을 저장할 변수

    for (int i = 0; i < quizArr5.length; i++) {
      total += quizArr5[i];
    }

    System.out.println("배열 quizArr5 의 총합 : " + total);

//    문제 6) 사용자 입력을 통해서 배열의 크기를 지정하고, 지정된 배열의 크기만큼 1 ~ 100 까지의 숫자를 입력받아 저장 후 배열의 모든 내용을 출력하는 프로그램을 작성하세요
//    예시) 생성하려는 배열의 크기를 입력하세요 (최대 10) > 5
//    예시) 배열에 저장할 데이터를 입력하세요 (1 ~ 100) >

//    예시) x번 index에 저장된 내용 : 10 ...

    System.out.println("\n ----- 문제6 -----\n");

    Scanner sc = new Scanner(System.in);

    System.out.print("생성하려는 배열의 크기를 입력하세요(최대 10) >> ");
    int size = sc.nextInt();

    int quizArr6[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.print("배열에 저장할 데이터를 입력하세요(1 ~ 100) > ");
      quizArr6[i] = sc.nextInt();
    }

    for (int i = 0; i < quizArr6.length; i++) {
      System.out.println("배열 quizArr6[" + i + "] : " + quizArr6[i]);
    }

//    문제 7) 주어진 배열의 내용을 역순으로 출력하세요
//    [10, 20, 30, 40, 50]
    System.out.println("\n ----- 문제7 -----\n");

    int quizArr7[] = {10, 20, 30, 40, 50};

    for (int i = quizArr7.length - 1; i >= 0; i--) {
      System.out.println("배열 quizArr7[" + i + "] : " + quizArr7[i]);
    }

//    문제 8) 사용자에게서 영어(소문자) 를 입력받고 주어진 char 타입 배열 안에 입력된 알파벳 중 사용자가 입력한 알파벳은 몇개가 있는지 확인하는 프로그램을 작성하세요
//	char eng[] = {'h','e','l','l','o',' ','w','o','r','l','d',',',' ','h','e','l','l','o',' ','u','n','i','v','e','r','s','e'};

    System.out.println("\n ----- 문제8 -----\n");
    char eng[] = {'h','e','l','l','o',' ','w','o','r','l','d',',',' ','h','e','l','l','o',' ','u','n','i','v','e','r','s','e'};
    int count = 0;

    System.out.print("검색할 영문자를 입력하세요 >> ");
    char charEng = sc.next().charAt(0);

    for (int i = 0; i < 8; i++) {
      if (charEng == eng[i]) {
        count++;
      }
    }

    System.out.println("검색한 영문자 '" + charEng + "' 은 " + count + "개 있습니다.");

  }
}












