package com.study.effectivesoftwaretesting.chapter_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlanningPokerTest {
    @Test
    @DisplayName("else if 를 사용해도 성공하는 케이스")
    public void planningPokerHappyCaseTest() {
        List<Estimate> estimates = Arrays.asList(
                new Estimate("테드", 16),
                new Estimate("바니", 8),
                new Estimate("릴리", 2),
                new Estimate("로빈", 4)
        );

        List<String> extremes = PlanningPoker.identifyExtremes(estimates);

        Assertions.assertThat(extremes).contains("릴리", "테드");

        for (String extreme : extremes) {
            System.out.println("extreme = " + extreme);
        }
    }

    @Test
    @DisplayName("else if 를 사용하면 실패하는 케이스")
    public void planningPokerUnhappyCaseTest() {
        // Highest 의 if 에만 걸리면 Lowest 에 값이 들어가지 않는다.
        // 만일 Estimate List 의 원소가 하나여도 null pointer exception 이 발생할 것이다.
        List<Estimate> estimates = Arrays.asList(
                new Estimate("릴리", 2),
                new Estimate("로빈", 4),
                new Estimate("바니", 8),
                new Estimate("테드", 16)
        );

        List<String> extremes = PlanningPoker.identifyExtremes(estimates);

        Assertions.assertThat(extremes).contains("릴리", "테드");

        for (String extreme : extremes) {
            System.out.println("extreme = " + extreme);
        }
    }
}