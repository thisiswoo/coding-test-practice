package com.example.codingtestpractice.category.basic;

import java.util.Scanner;

/**
 * [문제] 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * [입력] 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * [출력] 시험 성적을 출력한다.
 */
public class BOJ_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 시험 점수를 입력받기
        System.out.print("시험 점수를 입력하세요 : ");
        int score = getInputScore(sc);

        sc.close(); // Scanner close

        // 각 점수 범위에 따른 학점 출력
        if (isValidScore(score)) {
            System.out.println("학점: " + getGrade(score));
        } else {
            System.out.println("점수를 100점 이하 또는 0점 이상의 조건에 맞게 입력해주세요.");
            System.out.println("입력한 값 : " + score);
        }
    }

    // 입력한 scanner
    static int getInputScore(Scanner scanner) {
        return scanner.nextInt();
    }

    // 입력한 값에 대한 학점
    static String getGrade(int score) {
        return (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
    }

    // 입력한 값 유효성
    static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }
}
