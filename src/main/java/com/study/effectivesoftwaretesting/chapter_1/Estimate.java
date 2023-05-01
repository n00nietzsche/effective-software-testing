package com.study.effectivesoftwaretesting.chapter_1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Estimate {
    private final String developerName;
    private final float estimate;
}
