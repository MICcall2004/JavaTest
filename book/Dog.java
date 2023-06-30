package book;

import java.lang.reflect.Constructor;

public class Dog {

    private String name;
    public int age;

    private Dog() {
        this.name = "뽀삐";
        this.age = 3;
    }

    public Dog(final String name) {
        this.name = name;
        this.age = 5;
    }

    public Dog(final String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getConstructorParameters() {
        Class<Dog> dogClass = Dog.class;

        // Dog 클래스의 모든 생성자 정보를 가져온다.
        Constructor<?>[] constructors = dogClass.getDeclaredConstructors();

        // 모든 생성자의 파라미터 정보를 출력한다.
        for (constructor constructor : constructors) {

        }
    }
}
