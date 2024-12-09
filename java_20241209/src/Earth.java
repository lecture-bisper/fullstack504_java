public class Earth {

//  static 을 사용하여 클래스 로딩 시 함께 로딩
//  final 을 사용하여 수정 불가 필드로 선언
  static final double EARTH_RADIUS = 6400;
//  static final 을 사용하여 클래스 로딩 시 함께 로딩되는 수정 불가능한 정적 필드로 선언
  static final double EARTH_SURFASE_AREA;

//  정적 초기화 블록을 사용하여 데이터 초기화
  static {
    EARTH_SURFASE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
  }
}












