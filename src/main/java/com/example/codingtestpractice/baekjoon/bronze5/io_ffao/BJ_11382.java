package com.example.codingtestpractice.baekjoon.bronze5.io_ffao;

import java.io.IOException;
import java.util.Scanner;

/**
 * [문제] 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 * [입력] 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.
 * [출력] A+B+C의 값을 출력한다.
 */
public class BJ_11382 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
        sc.close();

        double max = Math.pow(10, 12);  // 10^12
        double min = 1;

        System.out.println((min <= a && a <= max && min <= b && b <= max && min <= c && c <= max) ? (a + b + c) : "1 ≤ A, B, C ≤ 10^12");
    }
}
