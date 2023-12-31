package com.example.codingtestpractice.category.basic;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [X보다 작은 수] 버전 2
 *
 * [문제] 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * [입력] 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 *       둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 * [출력] X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 */
public class BOJ_10871_ver2 {

    // ver1
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄 전체를 입력받음

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int A[] = new int[N]; // 정수 N으로 이루어진 수열(배열) A

        // 정수 N개로 이루어진 수열 A의 조건을 만족하기 위한 반복문
        st = new StringTokenizer(br.readLine()); // 한 줄 전체를 입력받음
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            // 정수 N개로 이루어진 수열 A중 정수 X보다 작은 것만 출력
            if (A[i] < X) {
                bw.write(A[i] + " ");
            }
        }

        br.close(); // BufferedReader close
        bw.flush(); //남아있는 데이터를 모두 출력시킴
        bw.close(); //스트림을 닫음
    }*/

    // ver2
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄 전체를 입력받음

            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            int A[] = new int[N]; // 정수 N으로 이루어진 수열(배열) A

            // 정수 N개로 이루어진 수열 A의 조건을 만족하기 위한 반복문
            st = new StringTokenizer(br.readLine()); // 한 줄 전체를 입력받음
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
                // 정수 N개로 이루어진 수열 A중 정수 X보다 작은 것만 출력
                if (A[i] < X) {
                    bw.write(A[i] + " ");
                }
            }
            bw.flush(); // 남아있는 데이터를 모두 출력시킴
        }
    }
}
