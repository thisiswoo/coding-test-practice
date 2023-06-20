package com.example.codingtestpractice.category.basic;

import java.util.Scanner;

/**
 * [문제] 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * [입력] 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * [출력] 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 */
public class BOJ_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 자연수 A와 B가 주어진다.
        int A = getInputValue(sc, "A");
        int B = getInputValue(sc, "B");

        sc.close(); // Scanner close

        if (validateInput(A) && validateInput(B)) {
            // 첫째 줄에 A+B
            System.out.println("첫째 줄에 A+B : " + plus(A, B));

            // 둘째 줄에 A-B
            System.out.println("둘째 줄에 A-B : " + minus(A, B));

            // 셋째 줄에 A*B
            System.out.println("셋째 줄에 A*B : " + multiply(A, B));

            // 넷째 줄에 A/B
            System.out.println("넷째 줄에 A/B : " + divide(A, B));

            // 다섯째 줄에 A%B
            System.out.println("다섯째 줄에 A%B : " + remainder(A, B));
        } else {
            System.out.println("1 ≤ A, B ≤ 10,000의 조건을 맞추어 입력해주세요.");
        }

    }

    static int getInputValue(Scanner sc, String valueName) {
        System.out.print("정수 " + valueName + "의 값을 입력하세요 : ");
        return sc.nextInt();
    }

    static int plus(int a, int b) { return a + b; }

    static int minus(int a, int b) { return a - b; }

    static long multiply(int a, int b) { return a * b; }

    static long divide(int a, int b) { return a / b; }

    static long remainder(int a, int b) { return a % b; }

    static boolean validateInput(int inputValue) {
        return (inputValue >= 0 && inputValue <= 10000);
    }
}
