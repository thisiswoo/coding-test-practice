package com.example.codingtestpractice.baekjoon.bronze5.io_ffao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [문제] (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 *       (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 *       세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * [입력] 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * [출력] 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 */
public class BJ_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sa = br.readLine(), sb = br.readLine(), sc = br.readLine();
        int a = Integer.parseInt(sa), b = Integer.parseInt(sb), c = Integer.parseInt(sc);

        System.out.println(conditionA(a, b, c));
        System.out.println(conditionB(a, b, c));
        System.out.println(conditionC(a, b, c));
        System.out.println(conditionD(a, b, c));
    }

    static int conditionA(int a, int b, int c) { return (a + b) % c; }
    static int conditionB(int a, int b, int c) { return ((a % c) + (b % c)) % c; }
    static int conditionC(int a, int b, int c) { return (a * b) % c; }
    static int conditionD(int a, int b, int c) { return ((a % c) * (b % c)) % c; }
}
