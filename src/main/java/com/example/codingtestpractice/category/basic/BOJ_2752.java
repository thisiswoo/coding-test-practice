package com.example.codingtestpractice.category.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [문제] 동규는 세수를 하다가 정렬이 하고싶어졌다.
 *       숫자 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어 졌다.
 *       숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.
 * [입력] 숫자 세 개가 주어진다. 이 숫자는 1보다 크거나 같고, 1,000,000보다 작거나 같다. 이 숫자는 모두 다르다.
 * [출력] 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
 */
public class BOJ_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자 세 개를 넣어줄 배열 생성 및 입력받은 수 3개를 배열에 저장
        int[] arr = readInput(st);

        // 오름차순으로 정렬
        sortAscending(arr);

        // 내림차순으로 정렬
//        int[] result = sortDescending(arr);

        // 출력
        printArray(arr);
//        printArray(result);
    }

    // 숫자 세 개를 넣어줄 배열 생성 및 입력받은 수 3개를 배열에 저장
    public static int[] readInput(StringTokenizer st) {
        int[] arr = new int[3]; // 입력 받을 정수 3개의 배열을 만들어 주기
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  // 배열에 입력 받은 정수 값 담기
        }
        return arr;
    }

    // 오름차순으로 정렬
    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);   // 올림차순 asc (입력 : 3 1 2 ==> 출력 : 1 2 3)
    }

    // 내림차순(asc)으로 정렬
    private static int[] sortDescending(int[] arr) {
        return reverseArray(arr);    // 내림차순 desc (입력 : 3 1 2 ==> 출력 : 3 2 1)
    }

    // 내림차순(desc)으로 정렬하기
    public static int[] reverseArray(int[] arr) {
        Arrays.sort(arr);
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[arr.length - i - 1] = arr[i];
        }
        return reversedArr;
    }

    // 출력
    private static void printArray(int[] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
