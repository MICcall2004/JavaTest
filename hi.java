import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        System.out.println("1. 덧셈(+)");
        System.out.println("2. 뺄셈(-)");
        System.out.println("3. 곱셈(*)");
        System.out.println("4. 나눗셈(/)");
        System.out.println("5. 제곱(^)");
        System.out.println("6. 제곱근");
        System.out.print("원하는 연산 선택(1~6): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("첫번째 숫자 입력: ");
                num1 = sc.nextDouble();
                System.out.print("두번째 숫자 입력: ");
                num2 = sc.nextDouble();
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                System.out.print("첫번째 숫자 입력: ");
                num1 = sc.nextDouble();
                System.out.print("두번째 숫자 입력: ");
                num2 = sc.nextDouble();
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                System.out.print("첫번째 숫자 입력: ");
                num1 = sc.nextDouble();
                System.out.print("두번째 숫자 입력: ");
                num2 = sc.nextDouble();
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                System.out.print("첫번째 숫자 입력: ");
                num1 = sc.nextDouble();
                System.out.print("두번째 숫자 입력: ");
                num2 = sc.nextDouble();
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case 5:
                System.out.print("숫자 입력: ");
                num1 = sc.nextDouble();
                System.out.print("지수 입력: ");
                num2 = sc.nextDouble();
                result = Math.pow(num1, num2);
                System.out.println(num1 + "^" + num2 + " = " + result);
                break;
            case 6:
                System.out.print("숫자 입력: ");
                num1 = sc.nextDouble();
                result = Math.sqrt(num1);
                System.out.println("√" + num1 + " = " + result);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }

        sc.close();
    }
}