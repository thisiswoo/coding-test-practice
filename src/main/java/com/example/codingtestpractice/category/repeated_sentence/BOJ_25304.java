package com.example.codingtestpractice.category.repeated_sentence;

import java.util.Scanner;

/**
 * [영수증]
 */
public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += (a * b);
        }
        System.out.println(X - sum == 0 ? "Yes" : "No");
    }
}
