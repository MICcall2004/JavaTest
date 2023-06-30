package book;

public class KoreanExample {
    public static void main(String args[]) {
        Korean k1 = new Korean("안영진", "040907-3703418");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        Korean k2 = new Korean("안자바", "930525-0654321");
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
}
