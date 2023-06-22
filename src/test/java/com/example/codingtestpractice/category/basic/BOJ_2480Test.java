package com.example.codingtestpractice.category.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.params.provider.MethodSource;

import java.util.StringTokenizer;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BOJ_2480Test {

    @DisplayName("주사위 값 입력 받기")
    @Test
    void 주사위_값_입력_받기() {
        // given
        StringTokenizer st = new StringTokenizer("3 3 6");
        int[] result = BOJ_2480.readInputDice(st);

        // when
        int[] expected = {3, 3, 6};

        // then
        assertArrayEquals(expected, result);
    }

    @DisplayName("주사위 값 계산")
    @ParameterizedTest // 여러 argument를 이용해 테스트를 여러번 돌릴 수 있는 테스트를 할 수 있는 기능
    @MethodSource("provideDiceCasesForTesting") // 테스트 클래스 내의 메서드 혹은 외부 클래스의 메서드가 반환하는 값을 source로 삼는 것. static 메서드를 이용하여 Stream으로 반환해야 한다.
    void 주사위_값_계산(int[] diceValues, int expectedPrize) {
        int actualPrize = BOJ_2480.prizeCalculation(diceValues);
        assertEquals(expectedPrize, actualPrize);
    }
    private static Stream<Arguments> provideDiceCasesForTesting() {
        return Stream.of(
                Arguments.of(new int[]{3, 3, 6}, 1300),
                Arguments.of(new int[]{2, 2, 2}, 12000),
                Arguments.of(new int[]{6, 2, 5}, 600)
        );
    }

    @Test
    void prizeCalculation() {
    }

    @Test
    void getMaxOfArray() {
    }

    @Test
    void printPrize() {
    }

    @Test
    void calculateSameDicePrize() {
    }
}