

/*public class CarMain {
    public static void main(String[] args) {

        public static void makeDrive(Car[] cars) {
            for (Car car : cars) {
                car.drive();
            }
        }

        ElectricCar eCar = new ElectricCar();
        GasCar gCar = new GasCar();

        eCar.move(); // 부모의 mova()
        gCar.move(); // 오버라이딩 된 자식의 move()

        // 둘 다 오버라이딩 된 자식의 메서드 호출중
        eCar.drive();
        gCar.drive();
        // 다형성 -> 동일한 메서드를 호출하는데,
        // 동작이 다른 것
        // 어떻게 하면 다형성을 안전하게 구현할 수 있을까?
        // 오버라이딩을 강제하면?
        // 상속받은 클래스에서 강제로 같은 시그니처의 메서드를 가지게 됨.
        // -> 강제한 메서드는 호출이 안전하게 보장받는다.




        // 캐스팅 - (상속) 자료형 변경
        // 1.업캐스팅 : 자식클래스 객체 -> 부모클래스 타입으로
        // 2.다운캐스팅 : 부모클래스 객체 -> 자식클래스 타입으로
        // - 업캐스팅 되었던 객체를 다시 원복

        ElectricCar eCar2 = new ElectricCar();
        Car car1 = (Car) eCar2; //업캐스팅
        // car1.charge(); 전기차만의 메서드를 사용할 수 없음

        //오버라이딩된 자식의 메서드가 호출
        // 메서드가 호출되는 2가지 방식
        // 1. 컴파일 시점에 결정
        // 2. 런타임시정에 결정 -> 오버라이딩 메서드는 런타임에 결정됨
        // -> new해서 실제 생성된 객체기준으로 호출됨.
        car1.drive(); // super의 drive? // electricCar로 호출됨.



        // 생성(new)은 자식객체, 변수타입은 부모타입
        Car car2 = new GasCar();

        // 다운캐스팅은 위험
        GasCar gCar2 = (GasCar) car2;
        // GasCar gCar3 = (GasCar) car1; // 전기차 객체를 잘못 다운캐스팅

        //instanceif 연산자
        // 객체 instanceof 클래스
        // 왼쪽객체가 오른쪽 타입 정도를 가지고 있는가?
        System.out.println(car1 instanceof ElectricCar);
        System.out.println(car1 instanceof Car);
        System.out.println(car1 instanceof GasCar);

        if (car1 instanceof ElectricCar) {
            ElectricCar electricCar = (ElectricCar) car1;
        } else if (car1 instanceof GasCar) {
            GasCar gasCar = (GasCar) car1;
        }

        Car[] cars = {car1, car2}; // 서로 다른 객체들이
        // 업캐스팅돼서 배열로 관리
        makeDrive(cars);
    }*/
package _14_Inheritance;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        GasCar gCar = new GasCar();

        // 업캐스팅: 자식 객체를 부모 타입 배열에 담기
        Car[] cars = {eCar, gCar};

        // 다형성을 활용한 메서드 호출
        makeDrive(cars);

        // instanceof 패턴 매칭 (Java 16 이상 권장 방식)
        if (eCar instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) eCar; // 직접 형변환
            ec.charge();
        }
    }

    // 메서드를 main 바깥으로 이동
    public static void makeDrive(Car[] cars) {
        for (Car car : cars) {
            car.drive(); // 런타임에 실제 객체의 오버라이딩된 메서드가 실행됨
        }
    }
}

