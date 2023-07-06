package com.example.codingtestpractice.category.two_dimensional_arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * [세로읽기]
 *
 * [문제] 아직 글을 모르는 영석이가 벽에 걸린 칠판에 자석이 붙어있는 글자들을 붙이는 장난감을 가지고 놀고 있다.
 *       이 장난감에 있는 글자들은 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’이다.
 *       영석이는 칠판에 글자들을 수평으로 일렬로 붙여서 단어를 만든다. 다시 그 아래쪽에 글자들을 붙여서 또 다른 단어를 만든다.
 *       이런 식으로 다섯 개의 단어를 만든다. 아래 그림 1은 영석이가 칠판에 붙여 만든 단어들의 예이다.
 *       ----------------------
 *       A A B C D D
 *       a f z z
 *       0 9 1 2 1
 *       a 8 E W g 6
 *       P 5 h 3 k x
 *       ----------------------
 *       <그림1>
 *
 *       한 줄의 단어는 글자들을 빈칸 없이 연속으로 나열해서 최대 15개의 글자들로 이루어진다. 또한 만들어진 다섯 개의 단어들의 글자 개수는 서로 다를 수 있다.
 *       심심해진 영석이는 칠판에 만들어진 다섯 개의 단어를 세로로 읽으려 한다. 세로로 읽을 때, 각 단어의 첫 번째 글자들을 위에서 아래로 세로로 읽는다.
 *       다음에 두 번째 글자들을 세로로 읽는다. 이런 식으로 왼쪽에서 오른쪽으로 한 자리씩 이동 하면서 동일한 자리의 글자들을 세로로 읽어 나간다.
 *       위의 그림 1의 다섯 번째 자리를 보면 두 번째 줄의 다섯 번째 자리의 글자는 없다.
 *       이런 경우처럼 세로로 읽을 때 해당 자리의 글자가 없으면, 읽지 않고 그 다음 글자를 계속 읽는다. 그림 1의 다섯 번째 자리를 세로로 읽으면 D1gk로 읽는다.
 *       그림 1에서 영석이가 세로로 읽은 순서대로 글자들을 공백 없이 출력하면 다음과 같다:
 *       Aa0aPAf985Bz1EhCz2W3D1gkD6x
 *       칠판에 붙여진 단어들이 주어질 때, 영석이가 세로로 읽은 순서대로 글자들을 출력하는 프로그램을 작성하시오.
 *
 *       [입력]
 *       총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다.
 *       주어지는 글자는 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’ 중 하나이다. 각 줄의 시작과 마지막에 빈칸은 없다.
 *
 *       [출력]
 *       영석이가 세로로 읽은 순서대로 글자들을 출력한다. 이때, 글자들을 공백 없이 연속해서 출력한다.
 */
public class BOJ_10798 {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] words = new char[5][15]; // 문자 하나씩 저장하기 위한 이중 배열 선언

        // 다섯 줄의 단어(word)를 입력 받아 words 배열에 담음
        for (int i = 0; i < 5; i++) { // 5번 반복
            String word = br.readLine();
            for (int j = 0; j < word.length(); j++) { // 입력한 값의 개수만큼 반복
                // charAt() 해당 인덱스의 값을 반환해줌
                words[i][j] = word.charAt(j); // words i번째 j번 방에 입력한 문자열 word 변수의 j번째 값 넣기
            }
        }

        // 세로로 읽어들인 문자들을 출력함
        // String이 아닌 StringBuilder를 사용한 이유?
        // String의 경우 기존에 선언한 값에 추가(+=)한 경우 새로운 객체로 탄생하게 된다.
        // 하지만, StringBuilder의 경우 sb.append("xxx") 새로운 값을 추가하게 되면 기존 StringBuilder의 객체에 새로운 값이 추가된다.
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (words[i][j] != '\0') { // \0은 널 문자(Null character)를 나타낸다
                    sb.append(words[i][j]);
                }
            }
        }
        System.out.println(sb);
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 사용하여 입력을 처리
        String[] words = new String[5]; // 문자열 배열 words를 선언

        for (int i = 0; i < 5; i++) { // 반복문을 사용하여 5개의 문자열을 입력 받고, words 배열에 저장
            words[i] = br.readLine();
        }

        // Stream API를 이용한 데이터 정제
        String result = IntStream.range(0, 15) // IntStream을 사용하여 0부터 14까지의 범위를 생성. 이 숫자들은 문자열의 인덱스를 나타낸다
                // .mapToObj()를 사용하여 각 인덱스에 대해 아래의 연산을 수행
                .mapToObj(j -> IntStream.range(0, 5) // 내부적으로 또 다른 IntStream을 생성하여 0부터 4까지의 범위를 나타낸다. 이 숫자들은 각 문자열의 인덱스이다
                        .filter(i -> j < words[i].length()) // .filter()를 사용하여 해당 인덱스에 문자가 있는지 확인하고, 필요한 경우 해당 문자열에서 문자를 가져온다
                        .mapToObj(i -> words[i].charAt(j)) // .mapToObj()를 사용하여 문자를 문자 객체로 변환
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString()) // .collect()를 사용하여 내부 인덱스(IntStream의 요소)에 대해 필터링된 문자를 차례대로 StringBuilder 객체에 추가
                .collect(Collectors.joining()); // .collect(Collectors.joining())을 사용하여 각 인덱스의 문자들을 모아 하나의 문자열로 만듦

        System.out.println(result);
    }
}
