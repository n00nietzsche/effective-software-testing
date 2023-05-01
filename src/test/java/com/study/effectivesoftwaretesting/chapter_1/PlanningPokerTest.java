package com.study.effectivesoftwaretesting.chapter_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlanningPokerTest {
    @Test
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
}