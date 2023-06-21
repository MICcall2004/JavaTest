// UP&DOWN 게임

// 1. 1 ~ 100 사이의 난수 생성 > 해당 숫자를 맞추는 게임
// 2. 본인이 몇 회 만에 맞출지 게임 횟수 설정
// 3. 설정 횟수 안에 난수와 입력한 숫자가 일치할 경우 승리
// 못 맞췄을 경우 난수 값 알려주기
// 4. 횟수 끝나면 재시작 / 종료 중 선택할 수 있도록

// 가능하면 메소드 사용하기


/* 
문제 풀이 방식
     기본 메소드 생성
     몇 번 도전할 것인지 입력하기
     게임이 오버되지 않았을 때 => !gameOver
     플레이어에게 숫자를 입력받아 난수와 비교하기
     비교한 다음 일치하면 게임에서 승리 / 일치하지 않으면 자신이 입력한 기회만큼 반복하기 (자신이 입력한 기회만큼 반복해도 일치하지 않을 시 게임 종료 => 패배)

     현재 문제 
     => 사용자에게 난수를 입력받아 비교하는 것이 잘 안 됨
*/ 

import java.util.Random;
import java.util.Scanner;

public class upDown {
    private int randomNum; 
    private int maxTry; 
    private int myTry;
    private boolean gameOver;

    public upDown() {
        randomNum = randomNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 번 도전 하시겠습니까?");
        maxTry = sc.nextInt();
        myTry = 0;
        gameOver = false;
    }

    private int randomNumber() { // 난수 선언
        Random rd = new Random();
        return rd.nextInt(100) + 1;
    }

    public void play() { // 대략적인 틀
        System.out.println("game START!");

        while (!gameOver) { 
            if (myTry < maxTry) {
                if (userTry() == randomNum) {
                    System.out.println("You Win!");
                    
                } else {
                    System.out.println("Wrong Answer! " + " Your chance is " + myTry + " th");
                    myTry++;
                }             
                
            } 
            else {
                System.out.println("GameOver! RandomNumber is " + randomNum + 1 + "!");
                Restart();
            }
        }
        
    }

    private int userTry() { // 플레이어가 난수 맞추기
        Scanner sc = new Scanner(System.in);
        System.out.println("1 부터 100 사이의 숫자 입력: ");
        return sc.nextInt();
    }

    public void Restart() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Restart? (Yes : 1, No : 0): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            randomNum = randomNumber();
            myTry = 0;
        } 
        else {
            gameOver = true;
            System.out.println("Game Exit");

        }
    }

    public static void main(String[] args) {
        upDown game = new upDown();
        game.play(); 
    }    
    
}