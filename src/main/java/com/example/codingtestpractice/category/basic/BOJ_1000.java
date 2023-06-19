package com.example.codingtestpractice.category.basic;

import java.util.Scanner;

/**
 * [문제] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * [입력] 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * [출력] 첫째 줄에 A+B를 출력한다.
 */
public class BOJ_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수 A와 B를 입력받기
        int A = getInputValue(sc, "A");
        int B = getInputValue(sc, "B");

        sc.close(); // Scanner close

        // 조건을 만족하는 경우에만 연산 수행
        if (validateInput(A) && validateInput(B)) {
            System.out.println(A + B);
        } else {
            System.out.println("0 < A, B < 10 조건을 적용하여 다시 작성해주세요.");
        }
    }

    public static int getInputValue(Scanner sc, String valueName) {
        System.out.print("정수 " + valueName + "의 값을 입력하세요 : ");
        return sc.nextInt();
    }

    public static boolean validateInput(int inputValue) {
        return (inputValue > 0 && inputValue < 10);
    }
}
