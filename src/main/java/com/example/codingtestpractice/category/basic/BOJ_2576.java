package com.example.codingtestpractice.category.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

/**
 * [문제] 7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최솟값을 찾는 프로그램을 작성하시오.
 *       예를 들어, 7개의 자연수 12, 77, 38, 41, 53, 92, 85가 주어지면 이들 중 홀수는 77, 41, 53, 85이므로
 *       그 합은 77 + 41 + 53 + 85 = 256이 되고, 41 < 53 < 77 < 85 이므로 홀수들 중 최솟값은 41이 된다.
 * [입력] 입력의 첫째 줄부터 일곱 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100보다 작다.
 * [출력] 홀수가 존재하지 않는 경우에는 첫째 줄에 -1을 출력한다. 홀수가 존재하는 경우 첫째 줄에 홀수들의 합을 출력하고, 둘째 줄에 홀수들 중 최솟값을 출력한다.
 */
public class BOJ_2576 {
    public static void main(String[] args) throws IOException {
        // try-with-resources를 사용하여 BufferedReader를 자동으로 닫도록 처리
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> oddNumbers = new ArrayList<>();

            for (int i = 0; i < 7; i++) {
                int num = Integer.parseInt(br.readLine());  // 7번의 정수 입력 받기
                if (isOdd(num)) {
                    oddNumbers.add(num); // 홀수이면 입력한 값을 list에 넣어주기
                }
            }
            printResult(oddNumbers); // 출력
        }
    }

    // 홀수를 판단하는 기능
    public static boolean isOdd(int num) {
        return num % 2 == 1; // 홀수일 때 return true
    }

    // 조건에 맞게 출력하기
    public static void printResult(List<Integer> oddNumbers) {
        if (oddNumbers.isEmpty()) { // 입력한 값 중 홀 수가 하나도 없을 때 -1 출력
            System.out.println(-1);
        } else {    // 입력한 값이 하나라도 있을 때
            // oddNumbers.stream().mapToInt(Integer::intValue)는
            // Integer 객체를 기본 데이터 타입 int로 변환. 여기서 Integer::intValue는 method reference로 intValue 메소드를 참조
            int sum = oddNumbers.stream().mapToInt(Integer::intValue).sum(); // 그렇게 나온 int 타입의 값을 모두 더한다.
            System.out.println(sum);

            // OptionalInt는 값이 존재하지 않을 수도 있는 int 값에 대한 컨테이너
            OptionalInt min = oddNumbers.stream().mapToInt(Integer::intValue).min();    // 그렇게 나온 int 타입의 값 중 최솟값을 찾는다.
            System.out.println(min.getAsInt());
        }
    }
}