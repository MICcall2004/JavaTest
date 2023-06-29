// gas 값이 0보다 클 경우 계속해서 while 문을 실행하고, 0일 경우 return 문을 실행해서 run() 메소드를 즉시 종료한다. while 문이 한 번 루핑될 때마다 gas 를 1씩 감소하기 때문에 언젠가는 0이 되어 rn() 메소드를 종료한다. return 문 대신 break 문을 사용할 수도 있다. 

package book;

public class Car {
    // 필드
    String model;
    int speed;

    // 생성자
    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for (int i = 10; i <= 50; i += 10) {
            setSpeed(i);
            System.out.println(this.model + "가 달립니다. (시속:" + this.speed + "km/h)");
        }
    }
}
