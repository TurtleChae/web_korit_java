package _11_Access;

public class Bottle {
    private int currentWater; // 현재 물의양(ml)
    private int max = 1000; // 용량(1000ml)

    public Bottle() {
        this.currentWater = 100; // 초기값
    }

    private boolean isNegative(int amount) {
        if(amount < 0) {
            System.out.println("물은 음수일수없습니다.");
            return true;
        }
        return false;
    }

    // fill(int amount)
    // currentWater를 amount만큼 증가시키는
    // amount 음수면 x, max를 넘어갈수 없음.
    public void fill(int amount) {
        if(this.isNegative(amount)) return;
        if(this.currentWater + amount > max) {
            System.out.println("물이 넘칩니다");
            return;
        }

        this.currentWater += amount;
    }
    // drink(int amount)
    // currentWater를 amount만큼 감소시키는
    // amount 음수면 x, currentWater는 음수가 될수x
    public void drink(int amount) {
        if(isNegative(amount)) return;
        if(this.currentWater < amount) {
            System.out.println("현재 양 보다 더 마실 수 없습니다");
            return;
        }

        this.currentWater -= amount;
    }

    public void printCurrenWater() {
        System.out.println("현재 물의양 : " + this.currentWater);
    }


}