package com.spring_uuidv7.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.github.f4b6a3.uuid.UuidCreator;

@Component
public class UuidGenerator {

    public UUID generate() {
        return UuidCreator.getTimeOrderedEpoch();
    }
}
