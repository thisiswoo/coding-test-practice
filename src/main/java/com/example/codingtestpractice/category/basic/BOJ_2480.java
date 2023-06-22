package com.example.codingtestpractice.category.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [문제] 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 *          1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 *          2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 *          3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 * [입력] 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 * [출력] 첫째 줄에 게임의 상금을 출력 한다.
 */
public class BOJ_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dice = readInputDice(st); // 3개의 주사위 값 배열에 담기
        int prize = prizeCalculation(dice); // 3개의 주사위 값을 조건부에 맞게 계산하기
        printPrize(prize);  // 출력
    }

    // 3개의 주사위 값 배열에 담기
    public static int[] readInputDice(final StringTokenizer st) {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    // 3개의 주사위 값을 조건부에 맞게 계산하기
    public static int prizeCalculation(final int[] dice) {
        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            return 10000 + (dice[0] * 1000); // 3개의 주사위가 모두 같을 때 계산
        } else if (dice[0] == dice[1] || dice[0] == dice[2] || dice[1] == dice[2]) {
            return calculateSameDicePrize(dice);    // 2개의 주사위가 같을 때 같은 값으로 계산
        } else {
            return getMaxOfArray(dice) * 100; // 3개의 주사위 값이 모두 다를 때 제일 높은 값으로 계산
        }
    }

    // 제일 높은 값으로 계산
    public static int getMaxOfArray(int[] arr) {
        Arrays.sort(arr); // 오름차순으로 정렬

        // 오름차순 정렬된 배열에서 마지막 요소(-1)는 가장 큰 값이기 때문에 arr[arr.length - 1]을 반환합니다.
        // 만약 (-2)를 해주면 마지막에서 두 번째 값을 반환
        return arr[arr.length - 1]; // 오름차순으로 정렬된 배열의 마지막 요소를 반환합니다.
    }

    // 출력
    public static void printPrize(int prize) {
        System.out.println(prize);
    }

    // 2개의 주사위가 같을 때 같은 값으로 계산
    public static int calculateSameDicePrize(int[] dice) {
        int sameDice = dice[0] == dice[1] ? dice[0] : dice[1];
        return 1000 + (sameDice * 100);
    }
}
