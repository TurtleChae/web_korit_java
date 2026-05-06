package _20_Enum;

public class Main {
    public static double getDiscountPrice(int price, Grade) {
        int discountRate = 0; // 할인율

        double discountRate = Grade.getDiscountRate();

        double discountAmount = price * discountRate / 100.0;
        return price - discountAmount;
    }

    public static void main(String[] args) {
        // 회원등급에 따라 물품가격 할인율을 차등 적용
        int price = 10000;
        // 상수를 만들어도, 상수를 사용하지 않고, 일반 문자열을 사용할 수 있음
        // 문법적으로 허용됨.
        // -> 매개변수로 넘겨줄 때, 상수사용이 강제되지 않기 때문
        double finalPrice = getDiscountPrice(price, Grade.DIAMOND);

        double fee = Payment.CARD.getCalcedFee(finalPrice);
        System.out.println(finalPrice - fee);
    }
}
