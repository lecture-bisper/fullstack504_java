//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
  public static void main(String[] args) {
    //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
    // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    System.out.printf("Hello and welcome!");

    for (int i = 1; i <= 5; i++) {
      //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
      // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
      System.out.println("i = " + i);
    }

    System.out.println("Hello World!!");

    int x = 1;
    int y = 2;
    int result = x + y;
    System.out.println(result);

//    변수 초기화 : 변수를 선언 후 처음으로 데이터를 저장하는 행위

//    변수 value는 초기화되지 않았기 때문에 연산이 불가능함
//    int value;
//    result  = value + 10;

//    변수 value가 초기화되었기 때문에 연산에 사용할 수 있음
    int value = 30;
    result = value + 10;
  }
}











