package com.example.codingtestpractice.baekjoon.bronze5.io_ffao;

import java.util.Scanner;

/**
 * [문제] 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * [입력] 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * [출력] 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 */
public class BJ_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(), b = sc.nextLong();

//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);

        System.out.println(plus(a, b));
        System.out.println(minus(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println(remainder(a, b));
    }

    static long plus(long a, long b) { return a + b; }

    static long minus(long a, long b) { return a - b; }

    static long multiply(long a, long b) { return a * b; }

    static long divide(long a, long b) { return a / b; }

    static long remainder(long a, long b) { return a % b; }
}
