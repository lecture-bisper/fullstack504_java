public class AnimalEx {

  public static void main(String[] args) {

//    Animal 클래스 타입의 변수 animal 선언
//    new 키워드와 Animal() 생성자로 Animal 클래스 타입의 객체 생성
    Animal animal   = new Animal();
    animal.speak();

    System.out.println();

//    Animal 클래스를 상속받은 Cat 클래스 타입의 변수 선언
//    new 키워드와 Cat() 생성자로 Cat 클래스 타입의 객체 생성
    Cat cat = new Cat();
    cat.speak();

    System.out.println();

//    Animal 클래스를 상속받은 Dog 클래스 타입의 변수 선언
//    new 키워드와 Dog() 생성자로 Dog 클래스 타입의 객체 생성
    Dog dog = new Dog();
    dog.speak();
    
    System.out.println();
    
//    cat = dog;
//    dog = cat;

    animal.speak();

//    부모 클래스 Animal 타입의 변수 animal 에 자식 클래스 Cat 타입의 객체 cat을 대입하여 저장
    animal = cat;
    animal.speak();
//    부모 클래스 Animal 타입의 변수 animal 에 자식 클래스 Dog 타입의 객체 dog를 대입하여 저장
    animal = dog;
    animal.speak();
  }
}












