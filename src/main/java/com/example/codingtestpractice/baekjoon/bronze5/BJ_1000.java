package com.example.codingtestpractice.baekjoon.bronze5;

import java.util.Scanner;

/**
 * [문제] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * [입력] 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * [출력] 첫째 줄에 A+B를 출력한다.
 */
public class BJ_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

//        if (a > 0 && b < 10) System.out.println(a + b);
//        else System.out.println("0 < A, B < 10의 조건을 맞춰세요.");

        System.out.println((a > 0 && b < 10) ? (a + b) : "0 < A, B < 10의 조건을 맞춰세요.");
    }
}
