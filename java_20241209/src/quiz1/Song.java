package quiz1;

public class Song {

//  필드 선언, 필드는 주로 외부 접근을 막기 위해 private 선언
  private String title;

//  생성자 선언, 외부에서 생성자를 사용하여 객체 생성하기 때문에 public 접근제한자 사용
  public Song(String title) {
    this.title = title;
  }

//  메소드, 필드의 내용을 외부에서 사용할 수 있도록 하기 위한 Getter 메소드, public 접근제한자 사용
  public String getTitle() {
    return title;
  }
}












