package com.example.codingtestpractice.category.basic;

import java.util.Scanner;

/**
 * [문제] 우리나라 고유의 윷놀이는 네 개의 윷짝을 던져서 배(0)와 등(1)이 나오는 숫자를 세어 도, 개, 걸, 윷, 모를 결정한다.
 *       네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때 도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개) 중 어떤 것인지를 결정하는 프로그램을 작성하라.
 * [입력] 첫째 줄부터 셋째 줄까지 각 줄에 각각 한 번 던진 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가 빈칸을 사이에 두고 주어진다.
 * [출력] 첫째 줄부터 셋째 줄까지 한 줄에 하나씩 결과를 도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 출력한다.
 */
public class BOJ_2490 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                String yutResult = getYutResult(sc);
                System.out.println(yutResult);
            }
        }
    }

    public static String getYutResult(Scanner sc) {
        String[] yutResults = {"E", "A", "B", "C", "D"}; // 윷 결과를 위한 배열 -> 모, 도, 개, 걸, 윷
        int countOfBacks = 0; // 등(back) 초기화

        for (int i = 0; i < 4; i++) {
            countOfBacks += sc.nextInt(); // 입력받은 값을 등(back) 변수에 더합니다.
            // 예제)
            // 1 0 1 1 => 1 + 0 + 1 + 1 => 3 도
            // 0 0 1 1 => 0 + 0 + 1 + 1 => 2 개
            // 0 0 1 0 => 0 + 0 + 1 + 0 => 1 걸
            // 0 0 0 0 => 0 + 0 + 0 + 0 => 0 윷
            // 1 1 1 1 => 1 + 1 + 1 + 1 => 4 모
        }
        // 4를 빼줌으로 써 위 배열에 맞는 도, 개, 걸, 윷, 모 출력
        // (4 - 3(도)) => 1(A)
        // (4 - 2(개)) => 2(B)
        // (4 - 1(걸)) => 3(C)
        // (4 - 0(윷)) => 4(D)
        // (4 - 4(모)) => 4(E)
        return yutResults[4 - countOfBacks]; // 계산된 윷 결과값 반환

    }
}