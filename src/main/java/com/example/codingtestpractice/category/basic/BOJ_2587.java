package com.example.codingtestpractice.category.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * [대표값2]
 * [문제] 어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다. 평균은 주어진 모든 수의 합을 수의 개수로 나눈 것이다. 예를 들어 10, 40, 30, 60, 30의 평균은 (10 + 40 + 30 + 60 + 30) / 5 = 170 / 5 = 34가 된다.
 *       평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다. 예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
 *       10 30 30 40 60
 *       이 되고 따라서 중앙값은 30이 된다.
 *       다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
 * [입력] 첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 100 보다 작은 10의 배수이다.
 * [출력] 첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력한다. 평균과 중앙값은 모두 자연수이다.
 */
public class BOJ_2587 {
    /*
    version 1
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int addVal = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            addVal += arr[i];
        }
        System.out.println(addVal / arr.length);

        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
    */

    // version2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5]; // 5개의 배열 생성
        int addVal = 0; // 총 합 구할 변수 초기화

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 입력한 값 배열에 값 넣기
            addVal += arr[i];   // 총 합 변수에 값 더하기
        }
        System.out.println(calculateAvg(addVal, arr.length)); // 평균값 구하기
        System.out.println(findMedian(arr));    // 입력한 값 중 중앙수 구하기
    }

    // 평균값 구하기
    public static int calculateAvg(int sum, int length) {
        return sum / length;
    }

    // 중앙수 구하기
    public static int findMedian(int[] arr) {
        Arrays.sort(arr); // 오름차순으로 정렬
        return arr[arr.length / 2];
    }
}
