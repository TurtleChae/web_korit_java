package _11_Access;

public class AccessMain {
    public static void main(String[] args) {
        Access ac = new Access(5, 6);

        // private로 막혀있음
        // ac.x
        // ac.y
        int x = ac.getX(); // 간접조회
        System.out.println(x);
        ac.setX(8); // 간접변경
        x = ac.getX();
        System.out.println(x);

        Bottle b = new Bottle();
        b.drink(200);
        b.printCurrenWater();
        b.fill(10000);
        b.printCurrenWater();
        b.fill(500);
        b.drink(600);
        b.printCurrenWater();

    }
}