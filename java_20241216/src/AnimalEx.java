public class AnimalEx {

  public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();
    dog.sound();
    cat.sound();
    cat.breathe();
    System.out.println("-----------------");

//    Animal 클래스는 추상 클래스이므로 객체 생성 불가능
//    Animal animal = new Animal();
//    추상 클래스는 객체 생성은 불가능하지만 변수 생성은 가능
    Animal animal;
    animal = new Dog();
    animal.sound();

    animal = new Cat();
    animal.sound();

    System.out.println("-------------------");

//    추상 클래스를 통해서 클래스의 다형성을 구현
    animal = dog;
    animal.sound();

    animal = cat;
    animal.sound();

    System.out.println("-------------------");

//    매개변수의 다형성 사용
    animalSound(new Cat());
    animalSound(new Dog());
    animalSound(cat);
    animalSound(dog);
  }

  public static void animalSound(Animal animal) {
    animal.sound();
  }
}











