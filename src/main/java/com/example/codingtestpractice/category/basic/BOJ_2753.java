package com.example.codingtestpractice.category.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [문제] 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
 *       윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
 *       예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
 * [입력] 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
 * [출력] 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 */
public class BOJ_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 연도 입력 받기
        int inputYear = readInputYear(st);

        // 윤년인지 확인 (윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때)
        boolean isLeapYear = isLeapYear(inputYear);

        // 출력 - 윤년이면 1, 아니면 0 출력
        printLeapYear(isLeapYear, inputYear);
    }

    // 입력한 값 int로 파싱하기
    private static int readInputYear(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());  // 입력 받은 정수 값 담기
    }

    // 윤년인지 체크
    private static boolean isLeapYear(final int inputYear) {
        // 4의 배수이면서, 100의 배수가 아닌 경우, 또는 400의 배수일 때 윤년
        return (inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0);
    }

    // 조건에 맞게 출력
    private static void printLeapYear(boolean isLeapYear, int inputYear) {
        if (isLeapYear) System.out.println("입력한 " + inputYear + "년은 윤년입니다 - 1");
        else System.out.println("입력한 " + inputYear + "년은 윤년이 아닙니다 - 0");
    }
}
