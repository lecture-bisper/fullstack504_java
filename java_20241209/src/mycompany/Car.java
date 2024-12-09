package mycompany;

// import : 다른 패키지에 존재하는 클래스를 현재 패키지로 불러와서 사용할 수 있도록 하는 명령
// import 를 통해서 가져온 클래스는 패키지명을 제외한 클래스 이름만 입력하여 사용할 수 있음
// 여러 패키지에서 동일한 이름의 클래스를 가져올 수 없음
// 자주 사용하는 클래스를 import로 가져오고, 자주 사용하지 않는 클래스는 패키지명을 포함한 전체 클래스명을 사용함
import hankook.SnowTire;
import kumho.BigWidthTire;
import hyundai.Engine;
import hankook.Tire;
// hankook.Tire 와 kumho.Tire 의 클래스명이 같으므로 둘 중 하나만 import로 가져오고, 나머지 하나는 패키지명을 포함한 전체 클래스명을 통해서 가져와야 함
//import kumho.Tire;


public class Car {

  Engine engine = new Engine();
  SnowTire tire1 = new SnowTire();
  BigWidthTire tire2 = new BigWidthTire();
//  hankook.Tire 클래스와 kumho.Tire 클래스의 이름이 같으므로 자주 사용하는 hankook.Tire를 import로 가져와서 클래스명만 입력하여 사용하고, kumho.Tire는 패키지명을 포함한 전체 클래스명으로 사용함
  Tire tire3 = new Tire();
  kumho.Tire tire4 = new kumho.Tire();
}












