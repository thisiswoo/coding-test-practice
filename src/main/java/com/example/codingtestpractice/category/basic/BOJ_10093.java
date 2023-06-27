package com.example.codingtestpractice.category.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [숫자]
 * [문제] 두 양의 정수가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램을 작성하시오.
 * [입력] 두 정수 A와 B가 주어진다.
 * [출력] 첫째 줄에 두 수 사이에 있는 수의 개수를 출력한다.
 *       둘째 줄에는 두 수 사이에 있는 수를 오름차순으로 출력한다.
 * [서브태스크]   번호	                배점	            제한
 *              1	                30          1 ≤ A, B ≤ 1000.
 *              2	                70          1 ≤ A, B ≤ 1015, A와 B의 차이는 최대 100,000.
 */
public class BOJ_10093 {
    public static void main(String[] args) throws IOException {
        long[] inputNums = readInput(); // 두 정수 입력 받기(최대 값이 100,000이니 int 보단 long으로)
        long num1 = Math.min(inputNums[0], inputNums[1]); // 첫 번째 입력 값과 두 번째 입력값 중 작은 값을 num1에 저장
        long num2 = Math.max(inputNums[0], inputNums[1]); // 첫 번째 입력 값과 두 번째 입력값 중 큰 값을 num2 저장

        printNumbersBetween(num1, num2); // 입력 받은 두 수 사이의 값과 개수 출력
    }

    // 두 정수 입력 받기
    private static long[] readInput() throws IOException {
        // BufferedReader 객체 생성 부분을 try 블록의 괄호 안에 위치시키게 되면 br.close()를 명시적으로 호출할 필요가 없어진다.
        // 이 문법은 try-with-resource 문법으로 자동으로 리소스를 해제하게 해준다(AutoClose 개념이라 생각하면 됨).
        // 이렇게 하면 코드가 보다 간결해지고 리소스 관리를 보다 안전하게 할 수 있다.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력받은 문자열을 공백으로 구분하여 배열로 변환
            String[] input = br.readLine().split(" ");
            // mapToLong을 사용하여 각각의 값(입력 받은 String의 값들)을 long 타입으로 변환하고, toArray()를 사용하여 변된 long 타입 값들로 구성된 long 타입의 배열을 반환
            return Arrays.stream(input).mapToLong(Long::parseLong).toArray();
        }
    }

    // 입력 받은 두 수 사이의 값과 개수 출력
    private static void printNumbersBetween(long num1, long num2) {
        if (num2 - num1 <= 1) { // 두 정수의 차이가 1과 같거나 1보다 클 경우 e.g) 2 3 => 1, 2 2 => 0
            System.out.println(0); //
        } else { // 입력 받은 두 수의 차이가 2 이상인 경우
            // 두 수 사이의 수가 몇개 있는지 출력
            System.out.println(num2 - num1 - 1); // e.g) 8 14 => 14(num2) - 8(num1) - 1 = 5
            // 두 수 사이의 수의 수가 무엇이 있는지 출력(두 입력값 제외)
            for (long i = num1 + 1; i < num2; i++) {
                System.out.print(i + " "); // 오름차순으로 출력(옆으로 출력)
            }
        }
    }
}
