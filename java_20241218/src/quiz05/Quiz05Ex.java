package quiz05;

// 문제 5) 책 238페이지 문제 6번
// 책 212 페이지 예문 5-4에 있는 Line, Rect, Circle 클래스 참고

// 사용자키보드 입력을 통해서 객체를 여러개 저장하고, 나중에 출력
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz05Ex {

  public static void main(String[] args) {

//    여러개의 데이터를 저장하기 위해서 배열 사용
    Shape arrShape[] = new Shape[10];
//    ArrayList 사용했을 경우
//    List<Shape> listShape = new ArrayList<Shape>();
    
    int index = 0;

    Scanner sc = new Scanner(System.in);

//    무한 반복
    while (true) {
//      사용자에게 메뉴 출력
      System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
//      사용자에게서 메뉴 선택을 받음
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
//          입력 내용에 대한 메뉴 출력
          System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
//          입력할 도형에 대한 사용자 입력을 받기
          int type = sc.nextInt();

          switch (type) {
            case 1:
              arrShape[index] = new Line();
              index++;
              
//              ArrayList 사용 시
//              listShape.add(new Line());
              break;

            case 2:
              arrShape[index] = new Rect();
              index++;
              break;

            case 3:
              arrShape[index] = new Circle();
              index++;
              break;

            default:
              System.out.println("잘못된 입력입니다.");
              break;
          }
          break;

        case 2:
          System.out.print("삭제할 도형의 위치 >> ");
          int delIndex = sc.nextInt() - 1;

//          ArrayList 사용 시
//          if (delIndex < listShape.size()) {
//            listShape.remove(delIndex);
//          }
//          else {
//            System.out.println("삭제할 수 없습니다.");
//          }

          if (arrShape[delIndex] != null) {
            arrShape[delIndex] = null;
          }
          else {
            System.out.println("삭제할 수 없습니다.");
          }
          break;

        case 3:
//          저장된 내용을 모두 출력
          for (int i = 0; i < arrShape.length; i++) {
//            배열의 요소 중 null 인 부분 제외하고 출력
            if (arrShape[i] != null) {
              arrShape[i].draw();
            }
          }

//          ArrayList 사용 시
//          for (Shape shape : listShape) {
//            shape.draw();
//          }
          break;

        case 4:
          System.out.println("프로그램을 종료합니다.");
//          현재 실행하고 있는 프로세스 종료
          System.exit(0);
          break;

        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }
}












