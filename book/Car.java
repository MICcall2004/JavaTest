// gas 값이 0보다 클 경우 계속해서 while 문을 실행하고, 0일 경우 return 문을 실행해서 run() 메소드를 즉시 종료한다. while 문이 한 번 루핑될 때마다 gas 를 1씩 감소하기 때문에 언젠가는 0이 되어 rn() 메소드를 종료한다. return 문 대신 break 문을 사용할 수도 있다. 

package book;

public class Car {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Car() {
    }

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
