package _15_Abstract;

public class Warrior extends Character {

    // 1. 생성자는 메서드 밖, 클래스 바로 아래에 위치해야 합니다.
    public Warrior(String name) {
        super(name, 120, 25);
    }

    // 2. 부모 클래스(Character)의 추상 메서드를 구현합니다.
    @Override
    public void attack(Character target) {
        // Character 클래스에서 name이나 targetName이 protected 이상으로 선언되어 있어야 접근 가능합니다.
        System.out.println(target.getName() + "에게 강력한 강타를 시전합니다.");
        target.receiveDMG(this.attackDMG);
        System.out.println(target.getName() + "이 " + this.attackDMG + "의 데미지를 받았습니다.");
    }
}
