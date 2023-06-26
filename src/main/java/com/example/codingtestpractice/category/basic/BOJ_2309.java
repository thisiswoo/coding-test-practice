package com.example.codingtestpractice.category.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * [일곱 난쟁이]
 * [문제] 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
 *       아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
 *       아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 * [입력] 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
 * [출력] 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
 */
public class BOJ_2309 {
    public static void main(String[] args) throws IOException {
        List<Integer> dwarfHeights = getDwarfHeights(); // 9난쟁이 키값 입력 받기
        List<Integer> realDwarves = findRealDwarves(dwarfHeights); // 진짜 7난쟁이 찾기
        printRealDwarves(realDwarves);
    }

    // 9난쟁이 키값 입력 받기
    private static List<Integer> getDwarfHeights() throws IOException {
        List<Integer> heights =  null;
        // BufferedReader 객체 생성 부분을 try 블록의 괄호 안에 위치시키게 되면 br.close()를 명시적으로 호출할 필요가 없어진다.
        // 이 문법은 try-with-resource 문법으로 자동으로 리소스를 해제하게 해준다(AutoClose 개념이라 생각하면 됨).
        // 이렇게 하면 코드가 보다 간결해지고 리소스 관리를 보다 안전하게 할 수 있다.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // BufferedReader를 사용하여 한 줄씩 입력을 읽고, 스트림 API를 사용해 각 줄을 정수로 변환한 후 List로 수집.
            heights = br.lines().limit(9).map(Integer::parseInt).collect(Collectors.toList());
        }
        return heights;
    }

    // 진짜 7난쟁이 찾기
    private static List<Integer> findRealDwarves(List<Integer> dwarfHeights) {
        // 브루트 포스 알고리즘
        // 브루트 포스 알고리즘 알고리즘이란? 영어로 brute는 "짐승 같은, 난폭한"이라는 뜻이고, brute-force는 "난폭한 힘, 폭력"이라는 뜻이다.
        // 오래 걸리는 데다 시간과 자원이 엄청나게 들어서 얼핏 보면 무식하다고 생각할 수도 있겠지만, 항상 정확도 100%를 보장한다는 점에서 암호 해독법 중 가장 확실하고 무서운 방법
//        outerLoop: // outLoop 이라는 label을 달아주어 조건에 해당하면 continue 또는 break을 이용하여 해당 지점에 loop for 문을 빠져나오게 할 수 있는 것.

        //  이중 for문을 사용하여 두 개의 난쟁이 키 조합을 찾고, 해당 조합을 제외한 나머지 키의 리스트를 생성.
        for (int i = 0; i < dwarfHeights.size() - 1; i++) {
            for (int j = i + 1; j < dwarfHeights.size(); j++) {
                final int finalI = i;
                final int finalJ = j;
                List<Integer> realDwarves = dwarfHeights.stream()
                        .filter(h -> h != dwarfHeights.get(finalI) && h != dwarfHeights.get(finalJ))
                        .collect(Collectors.toList());
                // 이렇게 생성된 리스트의 길이가 7이고 합계가 100인 경우, 찾은 난쟁이들을 반환.
                if (realDwarves.size() == 7 && realDwarves.stream().mapToInt(Integer::intValue).sum() == 100) {
                    return realDwarves;
                }
            }
        }
        // 일곱 명의 난쟁이를 찾을 수 없는 경우 IllegalStateException을 발생시킵니다.
        throw new IllegalStateException("Unable to find the real dwarves.");
    }

    //
    private static void printRealDwarves(List<Integer> realDwarves) {
        // 스트림 API를 사용하여 난쟁이 키를 정렬(오름차순)한 후, 정렬된 난쟁이 키를 출력.
        realDwarves.stream()
                .sorted() // stream().sorted() 중간연산자. 오름차순 정렬
                .forEach(System.out::println);
    }
}

// --------------------------- 출력 순서 --------------------------------
//                                                                  정답
//                                                                   v
// 20  -                 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 7   -   1 1 1 1 1 1 1               2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2
// 23  - 1   2 2 2 2 2 2   2 2 2 2 2 2             3 3 3 3 3 3 3 3 3 3
// 19  - 2 2   3 3 3 3 3 2   3 3 3 3 3   3 3 3 3 3           4 4 4 4 4
// 10  - 3 3 3   4 4 4 4 3 3   4 4 4 4 3   4 4 4 4   4 4 4 4         5
// 15  - 4 4 4 4   5 5 5 4 4 4   5 5 5 4 4   5 5 5 4   5 5 5   5 5 5
// 25  - 5 5 5 5 5   6 6 5 5 5 5   6 6 5 5 5   6 6 5 5   6 6 5   6 6
// 8   - 6 6 6 6 6 6   7 6 6 6 6 6   7 6 6 6 6   7 6 6 6   7 6 6   7 6
// 13  - 7 7 7 7 7 7 7   7 7 7 7 7 7   7 7 7 7 7   7 7 7 7   7 7 7   7