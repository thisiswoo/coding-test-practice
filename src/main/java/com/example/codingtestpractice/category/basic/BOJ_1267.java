package com.example.codingtestpractice.category.basic;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * [핸드폰 요금]
 * [문제] 동호는 새악대로 T 통신사의 새 핸드폰 옴머나를 샀다. 새악대로 T 통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.
 *          1. 영식 요금제
 *          2. 민식 요금제
 *       영식 요금제는 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이 청구된다. 만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.
 *       민식 요금제는 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다. 만약 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.
 *       동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을 작성하시오.
 * [입력] 동호가 저번 달에 이용한 통화의 개수 N이 주어진다. N은 20보다 작거나 같은 자연수이다. 둘째 줄에 통화 시간 N개가 주어진다. 통화 시간은 10,000보다 작거나 같은 자연수이다.
 * [출력] 첫째 줄에 싼 요금제의 이름을 출력한다. 그 후에 공백을 사이에 두고 요금이 몇 원 나오는지 출력한다. 만약 두 요금제의 요금이 모두 같으면 영식을 먼저 쓰고 민식을 그 다음에 쓴다.
 *       영식은 Y로, 민식은 M으로 출력한다.
 */
public class BOJ_1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 처리하기 위해 Scanner 객체를 생성

        int N = sc.nextInt(); // 사용자로부터 입력받은 통화 수(N)를 저장할 변수를 선언

        // 각 전화 통화의 시간을 저장하는 phone 배열을 만들고, IntStream을 사용하여 배열의 요소를 초기화
        // 여기서는 0부터 N-1까지의 범위를 생성하고, 각 인덱스 i에 대해 sc.nextInt()를 이용해 입력받음
        int[] phone = IntStream.range(0, N).map(i -> sc.nextInt()).toArray();
        for (int cell : phone) {
            System.out.println("phone : " + cell);
        }

        // Y와 M 요금제의 사용 요금을 계산하는 변수를 선언하고 초기화
        // 요금 계산은 phone 배열의 요소에 대해 수행되며, IntStream을 사용하여 연산을 수행한 결과를 합산
        int Y = IntStream.of(phone).map(p -> ((p / 30) + 1) * 10).sum(); // 영식 요금제 - 30초마다 10원씩 청구
        int M = IntStream.of(phone).map(p -> ((p / 60) + 1) * 15).sum(); // 민식 요금제 - 60초마다 15원씩 청구

        System.out.println("Y : " + Y);
        System.out.println("M : " + M);

        if (Y < M) {
            System.out.println("Y " + Y);
        } else if (Y > M) {
            System.out.println("M " + M);
        } else {
            System.out.println("Y M " + Y);
        }
        sc.close();
    }
}
