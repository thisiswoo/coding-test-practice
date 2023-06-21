package com.example.codingtestpractice.category.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

class BOJ_2752Test {

    @DisplayName("세수정렬 입력받기")
    @Test
    void 세수정렬_입력받기() {
        // given : StringTokenizer로 3 1 2 의 3개의 정수를 받았을 때
        StringTokenizer st = new StringTokenizer("3 1 2");
        int[] arr = BOJ_2752.readInput(st);

        // when : 기대값
        int[] expected = {3, 1, 2};

        // then : arr[] 과 expected[]이 같은지
        assertArrayEquals(expected, arr);
    }

    @DisplayName("오름차순으로 정렬")
    @Test
    void 오름차순으로정렬() {
        // given
        int[] arr = {3, 1, 2};
        BOJ_2752.sortAscending(arr);

        // when
        int[] expected = {1, 2, 3};

        // then
        assertArrayEquals(expected, arr);
    }

    @DisplayName("내림차순으로 정렬")
    @Test
    void 내림차순으로_정렬() {
        // given
        int[] arr = {3, 1, 2};
        int[] sortedArr = BOJ_2752.reverseArray(arr);

        // when
        int[] expected = {3, 2, 1};

        // then
        assertArrayEquals(expected, sortedArr);
    }

}