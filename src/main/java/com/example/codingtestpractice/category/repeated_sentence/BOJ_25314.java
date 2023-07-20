package com.example.codingtestpractice.category.repeated_sentence;

import java.util.Scanner;

/**
 * [코딩은 체육과목 입니다]
 */
public class BOJ_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "";

        if (N % 4 == 0) {
            for (int i = 0; i < (N / 4); i++) {
                System.out.print(str + "long " );
            }
            System.out.println(str + "int");
        }
    }
}
