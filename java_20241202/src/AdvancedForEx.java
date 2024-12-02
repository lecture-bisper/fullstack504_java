public class AdvancedForEx {

  public static void main(String[] args) {

    int scores[] = {95, 71, 84, 93, 87};
    int total = 0;

    System.out.println("----- 일반 for 문으로 모든 내용 출력-----");

    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
      total += scores[i];
    }
    System.out.println("일반 for문으로 총합 : " + total);

    System.out.println("\n----- 향상된 for 문으로 모든 내용 출력 -----");
    total = 0;

//    향상된 for 문은 index 없이 배열(컬렉션)에서 순서대로 데이터를 하나씩 출력하여 지정한 변수에 저장한 후 코드 블록 내에서 사용할 수 있음
    for (int score : scores) {
      System.out.println(score);
      total += score;
    }
    System.out.println("향상된 for문으로 총합 : " + total);

  }
}












