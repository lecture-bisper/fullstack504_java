public class DmbCellPhoneEx {

  public static void main(String[] args) {

    CellPhone cellPhone = new CellPhone();
    cellPhone.powerOn();
    cellPhone.bell();
    cellPhone.sendVoice("안녕하세요~~");
    cellPhone.receiveVoice("누구신가요??");
    cellPhone.sendVoice("길동이 폰 아닌가요??");
    cellPhone.receiveVoice("아닙니다.");
    cellPhone.hangUp();
    cellPhone.powerOff();

    System.out.println();

    DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시 S5", "검정", 7);

//    부모 클래스인 CellPhone에서 상속받은 메소드를 사용
    dmbCellPhone.powerOn();
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice("길동이 폰 아닌가요??");
    dmbCellPhone.receiveVoice("아니에요~~~~~~~~~~~~~~");
    dmbCellPhone.hangUp();

//    자식 클래스인 DmbCellPhone 전용 메소드를 사용
    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(11);
    dmbCellPhone.turnOffDmb();

    dmbCellPhone.powerOff();
  }
}












