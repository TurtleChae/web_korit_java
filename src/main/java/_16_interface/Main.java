package _16_interface;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Duck duck = new Duck();
        // Animal ani = new Animal();

        Manager manager = new Manager();
        // duck의 현재 타입 : Duck
        // makeFly는 매개변수로 Flyable타입을 받음
        // -> 자동으로 캐스팅 되서 전달
        manager.makeFly(duck);
        manager.makeSound(dog);
        manager.makeSound(duck);
    }
}
