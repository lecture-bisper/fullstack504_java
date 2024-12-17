public class ClassCastExceptionEx {

  public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();

    Animal animal;
    animal = cat;
    animal = dog;

//    원본이 서로 다른 클래스를 강제 타입 변환하려고 하여 오류 발생
    Cat cat1 = (Cat) animal;
  }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}












