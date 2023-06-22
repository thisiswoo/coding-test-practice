package com.example.codingtestpractice.category.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class BOJ_2576Test {
    @DisplayName("7개의 정수를 받아 홀수만 찾아서 더한 값과 그중 최솟값 구하기")
    @Test
    void 정수7개받아_홀수만가지고_모두더한값과_최솟값() {
        // given
        List<Integer> inputs = Arrays.asList(12, 77, 38, 41, 53, 92, 85);
        Integer sumExpected = 256;
        Integer minExpected = 41;

        // when
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputs.size(); i++) {
            if (BOJ_2576.isOdd(inputs.get(i).intValue())) {
                result.add(inputs.get(i).intValue());
            }
        }
        int sum = result.stream().mapToInt(Integer::intValue).sum();
        OptionalInt min = result.stream().mapToInt(Integer::intValue).min();

        // then
        assertEquals(sumExpected, sum);
        assertEquals(minExpected, min.getAsInt());
    }

}