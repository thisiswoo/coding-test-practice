package com.example.codingtestpractice.category.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class BOJ_2490Test {

    private static Stream<Arguments> yutTestCase() {
        return Stream.of(
                Arguments.of("1 0 1 1", "A"), // 도
                Arguments.of("0 0 1 1", "B"), // 개
                Arguments.of("0 0 1 0", "C"), // 걸
                Arguments.of("0 0 0 0", "D"), // 윷
                Arguments.of("1 1 1 1", "E")  // 모
        );
    }

    @DisplayName("윳 계산 테스트")
    @ParameterizedTest
    @MethodSource("yutTestCase")
    void testGetYutResult(String input, String expectedYutResult) {
        try (Scanner sc = new Scanner(input)) {
            String actualYutResult = BOJ_2490.getYutResult(sc);
            assertEquals(expectedYutResult, actualYutResult);
        }
    }
}